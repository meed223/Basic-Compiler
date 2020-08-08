package program;
/* 1703977 Henry Lewis - Languages & Compilers Assignment 2*/
/* A small compiler */

/* Imports */
import grammar.*;
import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class compiler {
    /* Class Variables */
    static private CharStream cs;
    static private languageLexer lexer;
    static private CommonTokenStream tokens;
    static private languageParser parser;
    static private ArrayList<String> sb;
    static private Scanner sc;

    public static void main(String[] args) {
        // Initialize class variables
        sb = new ArrayList<>();
        languageParser lp = null; // New instance of language-parser
         sc = new Scanner(System.in); // Read user input

        // Let user know the program is running
        System.out.println("---[ Compiler Running ]---");

        String menu = "1. Open a text file to compile into Python\n" +
                      "2. Write program in the console\n" +
                      "3. Exit";

        System.out.println(menu);

        // Check for user input
        while (true) {
            String input = sc.nextLine();
            if (input.equals("1")) {
                // User intends to compile an already written file
                openFile();
                System.out.println("\n" + menu);
            } else if (input.equals("2")) {
                // User intends to write program out in the console
                consoleCompiler();
                System.out.println("\n" + menu);
            } else if (input.equals("3")) {
                // Exit compiler program
                System.exit(0);
            } else {
                System.out.println("Please enter a valid option from the selection");
            }
        }


    }

    public static void openFile() {
        // Open a file containing code in my language to be Compiled to Python
        System.out.println("Please enter the filename: (include file extension)");
        String filename = sc.nextLine();
        String line = null;

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr); /* Wrap file-reader with buffered-reader*/

            while ((line = br.readLine()) != null) {
                sb.add(line);
            }

            br.close();

            pythonWriter();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException - Try entering a different file name.");
        } catch (IOException e) {
            System.out.println("IOException - Failed to open the file.");
        }
    }

    public static void consoleCompiler() {
        System.out.println("\nType 'COMPILE' when done to try and compile code.\n");
        // Read User-Input from console
        String input = ""; // Read next-line of user input
        while(!input.equals("COMPILE")) {
            System.out.print(".");
            input = sc.nextLine();
            // Check for done condition
            sb.add(input);
        }
        System.out.println("-------");
        pythonWriter();
    }

    public static void pythonWriter() {
        System.out.println("Please enter file-name to write to: (WARNING WILL OVERRIDE EXISTING FILES)");
        String filename = sc.nextLine();
        try {
            PrintWriter pyWriter = new PrintWriter(filename + ".py", "UTF-8");
            // Take code from my language and compile it to Python

            // Parse code line-by-line
            String sourceCode = "";
            for (int i = 0; i < sb.size(); i++) {
                sourceCode += sb.get(i);
            }
            try {
                parse(sourceCode);
                // Compile to python
                String compiledCode = parser.compile_python().python;

                if (parser.errors.size() == 0) {
                    pyWriter.println("# " + filename + " Python Compiled Code");
                    pyWriter.print(compiledCode);
                    // Add wait-to-close statement & close file
                    pyWriter.print("input(\"\\nPress any key to continue...\")");
                    pyWriter.close();
                } else {
                    pyWriter.close();
                    System.out.println("Unable to write file - errors found in compilation process.");
                    for (int y = 0; y < parser.errors.size(); y++) {
                        System.out.println(parser.errors.get(y));
                    }
                }
            } catch (RecognitionException e) {
                System.out.println("Token Recognition Error - Please check you have properly closed all curly-braces " +
                                   "and terminated all expressions with ';' semi-colons.");
                System.out.println("Print Stack-Trace? [y/n]");
                String input = sc.nextLine();
                if (input.equals("y")|input.equals("Y")) {
                    e.printStackTrace();
                }
            }

            System.out.println("\nFile: " + filename + ".py has been sucessfully created.");
        } catch (IOException e) {
            System.out.println("IOException - Failed to write " + filename + ".py");
        }
    }

    // Text Parser
    public static void parse(String text) {
        cs = CharStreams.fromString(text);
        lexer = new languageLexer(cs); // Parse text into language-lexer
        tokens = new CommonTokenStream(lexer); // Tokenize
        if (parser == null) {
            // New Parser if no tokens passed before
            parser = new languageParser(tokens);
        } else {
            // Give new tokens, keep any previous context
            parser.setTokenStream(tokens);
        }
    }

}
