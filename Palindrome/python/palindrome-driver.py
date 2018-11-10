from palindrome import palindrome

file = open('../words.txt')
array = []
for val in file.read().split():
    array.append(str(val))

palindrome(array)
