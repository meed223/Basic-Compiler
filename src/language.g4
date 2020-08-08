grammar language;
@header {
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    /*varType stores the variable type, using same key as other map*/
    private HashMap<String, String> variableType = new HashMap<>();
    private HashMap<String, String> variableValue = new HashMap<>();
    public ArrayList<String> errors = new ArrayList<>();
    private int indentLevel = 0;
    private String tab = "    ";

    private String tab() {
        String toReturn = "";
        for (int i = 0; i < indentLevel; i++) {
            toReturn += tab;
        }
        return toReturn;
    };
}

/*---[ Parser Rules ]---*/
compile_python returns[String python]
            : (a=expression) {$python = $a.python; }
            (
            (b=expression) {$python += $b.python; }
            |
            (f=function) {$python += $f.python; }
            )*
            ((cm=compile) {$python += $cm.python; }
            )?
            ;

expression returns [String python]
            : /* All possible expressions */
            ( (d=declaration) {$python = $d.python; }
            | (a=assignment) {$python = $a.python; }
            | (o=operation) LineEnd {$python = $o.python; }
            | (c=compare) LineEnd {$python = $c.python; }
            | (p=print) {$python = $p.python; }
            | (i=if_statement) {$python = $i.python;}
            | (w=while_loop) {$python = $w.python; }
            );

/* Language Statements */
function returns [String python, String value]
            : Function (c=Char)  {$python = "def $c.text:";
                                  indentLevel += 1;}
            (Open_Bracket
            (
            (d=declaration) ','? {$python += tab() + $d.python; }
            )*
            Close_Bracket)?
            Open_Brace
            (
            (e=expression) {$python += tab() + $e.python; }
            )*
            Return (v=variable) LineEnd {$python += tab() + "return" + $v.python;}
            Close_Brace {indentLevel -= 1;}
            LineEnd
            ;

declaration returns [String python]
            : (t=decTypes)
            ((
            (c=Char) Assign {$python = $c.text + " = "; }
              (v=variable) {try {
                            variableType.put($c.text, $v.type);
                            variableValue.put($c.text, $v.value);
                            $python += $v.python + "\n";
                         } catch (NullPointerException e) {
                            errors.add("Undeclared Variable Error - An undeclared variable was called.");
                            $python = "None";
                            return _localctx;
                         };
                        }
              ) LineEnd
            |(c=Char) LineEnd {variableType.put($c.text, $t.value);
                                /* Python vars have to be assigned something */
                                $python = $c.text + " = None\n";
                               }
            )
            ;

assignment returns [String python]
            : (c=Char) Assign {$python = ""; }
            (v=variable) {try {
                            String type = variableType.get($c.text);
                            if (type.equals("BOOL") & !$v.type.equals("BOOL")) {
                                errors.add("Type Error - Tried to assign a value to a variable of a different type.");
                                $python = "None";
                                return _localctx;
                            }
                            variableType.put($c.text, $v.type);
                            variableValue.put($c.text, $v.value);
                            $python += $c.text + " = " + $v.python + "\n";
                        } catch (NullPointerException e) {
                            errors.add("Undeclared Variable Error - An undeclared variable was called");
                            $python = "None";
                            return _localctx;
                        };
                        }
            LineEnd
            ;

print returns[String python]
            : PRINT Open_Bracket (v=variable) Close_Bracket LineEnd {$python = "print (" + $v.python + ")\n";}
            ;

/* While Loop */
while_loop returns[String python]
            : WHILE (c=bool) Open_Brace {$python = "while " + $c.python + ":\n";
                                         indentLevel += 1;
                                        }
            (
            (e=expression) {$python += tab() + $e.python; }
            )*
            Close_Brace LineEnd {indentLevel -= 1;}
            ;

/* If Statement */
if_statement returns[String python]
            : IF (ac=bool) Open_Brace {$python = "if " + $ac.python + ":\n";
                                       indentLevel += 1;
                                      }
            (
            (ae=expression) {$python += tab() + $ae.python + "\n"; }
            )*
            Close_Brace {indentLevel -= 1;}
            (ELIF (bc=bool) Open_Brace {$python += tab() + "elif (" + $bc.python + "):\n";
                                        indentLevel += 1;
                                       }
            (
            (be=expression) {$python += tab() + $be.python; }
            )*
            Close_Brace {indentLevel -= 1;}
            )*
            (ELSE Open_Brace {$python += tab() + "else:\n";
                             indentLevel += 1;
                            }
            (
            (ce=expression) {$python += tab() + $ce.python; }
            )*
            Close_Brace {indentLevel -= 1;}
            /* If an elif is used, there must be an 'else'*/
            LineEnd {$python += "\n"; })?
            ;

/* Variable Types */
variable returns [String type, String value, String python]
             : (v=var) {try {
                            $type = variableType.get($v.name);
                            $value = variableValue.get($v.name);
                            $python = $v.name;
                         } catch (NullPointerException e) {
                            errors.add("Variable Declaration Error - variable '$v.name' was called but has not been declared.");
                            $type = "BOOL";
                            $value = "False";
                            $python = "None";
                            return _localctx;
                         };
                         }
             | (n=number) {$type = $n.type;
                           $value = String.valueOf($n.value);
                           $python = $n.python;
                          }
             | (b=bool) {$type = "BOOL";
                         $value = String.valueOf($b.value);
                         $python = $b.python;
                        }
             ;

decTypes returns [String value]/* Variable decleration types */
            : DecInt {$value = "INT"; }
            | DecFloat {$value = "FLOAT"; }
            | DecBool {$value = "BOOL"; }
            ;

var returns [String name]         /* Variable by name */
             : (c=Char+) {$name = $c.text; }
             ;

bool returns [boolean value, String python]
            : (b=Bool) { $value = Boolean.parseBoolean($b.text);
                         $python = $b.text;
                       }
            | Open_Bracket (c=compare) Close_Bracket { $value = $c.value;
                                                       $python = "(" + $c.python + ")";
                                                     }
            | Open_Bracket (e=equality) Close_Bracket {$value = $e.value;
                                                       $python = "(" + $e.python + ")";
                                                      }
            ;

number returns [String type, double value, String python]
            : (f=Float) {$type = "FLOAT";
                         $value = Double.parseDouble($f.text);
                         $python = $f.text;
                        }
            | (i=Int) {$type = "INT";
                       $value = Double.parseDouble($i.text);
                       $python = ($i.text);
                      }
            | Open_Bracket (o=operation) Close_Bracket {$type = "FLOAT";
                                                        $value = $o.value;
                                                        $python = "(" + $o.python + ")" ;
                                                       }
            ;

/* Numerical Operations */
operation returns [double value, String python]
            : (m=multiply) {$value = $m.value;
                            $python = $m.python;
                           }
            | (a=add) {$value = $a.value;
                       $python = $a.python;
                      }
            ;

add returns [String type, double value, String python]
            /* addition deals with both '+' and '-' and deals with multiplied/divided values to preserve correct operator order*/
            : (a=multiply) {/*Add / Subtract takes type, will convert from int to float if required*/
                            $python = $a.python;
                            $type = $a.type;
                            if ($a.type.equals("INT")) {
                                $value = (int)Math.round($a.value);
                            } else if ($a.type.equals("FLOAT")) {
                                $value = $a.value;
                            } else {
                                errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
                                $value = 0;
                                $type = "FLOAT";
                                $python = "None";
                                return _localctx;
                            }
                           }
            (Sum (b=multiply) {if ($type.equals("INT") & $b.type.equals("FLOAT")) {
                                   $type = "FLOAT";
                               }
                               if ($b.type.equals("INT")) {
                                   $value += (int)Math.round($b.value);
                                   $python += " + " + $b.python;
                               } else if ($b.type.equals("FLOAT")) {
                                   $value += $b.value;
                                   $python += " + " + $b.python;
                               } else {
                                   errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
                                   $value = 0;
                                   $type = "FLOAT";
                                   $python = "None";
                                   return _localctx;
                               };
                              }
            |Subtract (b=multiply) {if ($type.equals("INT") & $b.type.equals("FLOAT")) {
                                        $type = "FLOAT";
                                    }
                                    if ($b.type.equals("INT")) {
                                        $value -= (int)Math.round($b.value);
                                        $python += " - " + $b.python;
                                    } else if ($b.type.equals("FLOAT")) {
                                        $value -= $b.value;
                                        $python += " - " + $b.python;
                                    } else {
                                        errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
                                        $value = 0;
                                        $type = "FLOAT";
                                        $python = "None";
                                        return _localctx;
                                    };
                                   }
            )*
            ;

multiply returns [String type, double value, String python]
            /* Numbers are multiplied or divided - multiply deals with both to preserve operator order*/
            : (a=variable) {/*Multiply/Divide takes type, will convert from int to float if required*/
                            $python = $a.python;
                            $type = $a.type;
                            try {
                                if ($a.type.equals("INT")) {
                                  $value = (int)Math.round(Double.parseDouble($a.value));
                                } else if ($a.type.equals("FLOAT")) {
                                   $value = Double.parseDouble($a.value);
                                } else {
                                 errors.add("Type Error - Invalid Variable-Type used in Add/Subtract Operation");
                                 $value = 0;
                                 $type = "FLOAT";
                                 return _localctx;
                                }
                            } catch (NullPointerException e) {
                                errors.add("NullPointerException - Unrecognized variable. You may have made a spelling error.");
                            };
                           }
            (Multiply (v=variable) {if ($type.equals("INT") & $v.type.equals("FLOAT")) {
                                        $type = "FLOAT";
                                    }
                                    if ($v.type.equals("INT")) {
                                        $value *= Math.round(Double.parseDouble($v.value));
                                        $python += " * " + $v.python;
                                    } else if ($v.type.equals("FLOAT")) {
                                        $value *= Double.parseDouble($v.value);
                                        $python += " * " + $v.python;
                                    } else {
                                        errors.add("Type Error - Invalid Variable-Type used in Multiply Operation");
                                        $value = 0;
                                        $type = "FLOAT";
                                        return _localctx;
                                    };
                                   }
            |Divide (v=variable)   {/*Division always converts to double to avoid rounding errors*/
                                    if ($type.equals("INT")) {
                                        $type = "FLOAT";
                                    }
                                    if ($v.type.equals("INT")|$v.type.equals("FLOAT")) {
                                        $value /= Double.parseDouble($v.value);
                                        $python += " / " + $v.python;
                                    } else {
                                        errors.add("Type Error - Invalid Variable-Type used in Multiply Operation");
                                        $value = 0;
                                        $type = "FLOAT";
                                        return _localctx;
                                    };
                                   }
            |Modulo (v=variable)   {/*Modulo always produces an int*/
                                    if ($type.equals("INT") & $v.type.equals("FLOAT")) {
                                        $type = "FLOAT";
                                    }
                                    if ($v.type.equals("INT")|$v.type.equals("FLOAT")) {
                                        $value = $value % Double.parseDouble($v.value);
                                        $python += " % " + $v.python;
                                    } else {
                                        errors.add("Type Errors - Invalid Variable-Type used in Modulo Operation");
                                        $value = 0;
                                        $type = "FLOAT";
                                        return _localctx;
                                    };
                                   }
            )*
            ;

/* Logical Comparators */
compare returns[boolean value, String python]
            : (c=condition) {$value = $c.value;
                             $python = $c.python;
                            }
            | (g=gate) {$value = $g.value;
                        $python = $g.python;
                       }
            ;

gate returns[boolean value, String python]
            : (a=bool) {$value = $a.value;
                             $python = $a.python;
                            }
            ( AND (b=bool) {$value = ($value & $b.value);
                                 $python += " & " + $b.python;
                                }
            | OR (b=bool) {$value = ($value | $b.value);
                                $python += " | " + $b.python;
                               }
            )+
            ;

equality returns[boolean value, String python]
            : (a=variable) {String previous = $a.value;
                            $python = $a.python;
                            if ($a.type.equals("BOOL")) {
                                $value = Boolean.parseBoolean($a.value);
                            } else {
                                $value = true;
                            };
                           }
            ( ET (b=variable) {$value = previous.equals($b.value);
                               $python += " == " + $b.python;
                              }
            | NET (b=variable) {$value = !previous.equals($b.value);
                                $python += " != " + $b.python;
                               }
            )+
            ;

condition returns[boolean value, String python]
            : (a=variable) {/* Keep previously compared value to compare to next */
                            $python = $a.python;
                            double previous;
                            if ($a.type.equals("BOOL")) {
                                errors.add("Type Error - Booleans cannot be compared");
                                $value = Boolean.parseBoolean($a.value);
                                return _localctx;
                            } else {
                                /* Numbers are by default converted to true*/
                                previous = Double.parseDouble($a.value);
                                $value = true;
                            };
                           }
            ( GT (b=variable) {if ($a.type.equals("BOOL")) {
                                    errors.add("Type Error - Booleans cannot be compared in '>' operations");
                                    $value = false;
                                    $python = "None";
                                    return _localctx;
                               } else {
                                    $value = (previous > Double.parseDouble($b.value));
                                    $python += " > " + $b.python;
                               };
                              }
            | LT (b=variable) {if ($a.type.equals("BOOL")) {
                                    errors.add("Type Error - Booleans cannot be compared in '<' operations");
                                    $value = false;
                                    $python = "None";
                                    return _localctx;
                                } else {
                                    $value = (previous < Double.parseDouble($b.value));
                                    $python += " < " + $b.python;
                                };
                               }
            | GTET (b=variable) {if ($a.type.equals("BOOL")) {
                                    errors.add("Type Error - Booleans cannot be compared in '<=' operations");
                                     $value = false;
                                     $python = "None";
                                     return _localctx;
                                 } else {
                                     $value = (previous <= Double.parseDouble($b.value));
                                     $python += " >= " + $b.python;
                                 };
                                }
            | LTET (b=variable) {if ($a.type.equals("BOOL")) {
                                        errors.add("Type Error - Booleans cannot be compared in '>=' operations");
                                        $value = false;
                                        $python = "None";
                                        return _localctx;
                                  } else {
                                        $value = (previous >= Double.parseDouble($b.value));
                                        $python += " <= " + $b.python;
                                  };
                                 }
            )+
            ;

compile returns[String python]
        : Compile {$python = ""; }
        ;

/*---[ Tokens ]---*/
/* Syntax Elements */
LineEnd     : ';' ; /*Character used to mark end of a statement */
Assign      : '=' ; /*Character used to denote assignment of value to a variable */
Open_Bracket    : '(' ;
Close_Bracket   : ')' ;
Open_Brace      : '{' ;
Close_Brace     : '}' ;
IF          : 'IF' ;
ELIF        : 'ELIF' ;
ELSE        : 'ELSE' ;
WHILE       : 'WHILE' ;
PRINT       : 'PRINT' ;
Compile     : 'COMPILE' ; /* used to denote end-of-writing in compiler */

/*  VARIABLES */
/* Primitive Types */
Char        : [a-z]+ ;
Int         : [0-9]+ ;
Float       : [0-9]+ '.' [0-9]+ ;
Bool        : 'True' | 'False' ;

/* Function Decleration */
Function    : 'DEF' ;
Return      : 'RETURN' ;

/* Declarable Types */
DecInt      : 'INT' ;
DecFloat    : 'FLOAT' ;
DecBool     : 'BOOL' ;


/* OPERATORS */
/* Logical Comparators */
ET          : '==' ;
NET         : '!=' ;
GT          : '>' ;
GTET        : '>=' ;
LT          : '<' ;
LTET        : '<=' ;

/* Logical Operators */
AND         : '&' ;
OR          : '|' ;

/* Mathematical Operators */
Sum         : '+' ;
Subtract    : '-' ;
Multiply    : '*' ;
Divide      : '/' ;
Modulo      : '%' ;

WS : [ \t\r\n]+ -> skip;