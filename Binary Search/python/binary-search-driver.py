from binarySearch import binarySearch

file = open('../random-numbers.txt')
array = []
for val in file.read().split():
    array.append(int(val))

print (binarySearch(array, 4204, 0, len(array)))  # 0
print (binarySearch(array, 2125353, 0, len(array)))  # 201
print (binarySearch(array, 7638830, 0, len(array)))  # 779
print (binarySearch(array, 9760609, 0, len(array)))  # 1000
print (binarySearch(array, 9760608, 0, len(array)))  # -1
