# odd_even Python Compiled Code
n = 100
odd = 0
even = 0
index = 1
while (index <= n):
    if ((index % 2) == 0):
        even = (even + index)

    else:
        odd = (odd + index)

    index = (index + 1)
print (odd)
print (even)
print ((odd + even))
input("\nPress any key to continue...")