n = 12
previous = 0
current = 1
index = 1
temp = None
while (index <= n):
    print (current)
    temp = current
    current = (current + previous)
    previous = temp
    index = (index + 1)
input("\nPress any key to continue...")