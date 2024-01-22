array = []
for i in range(9):
    array.append(int(input()))
print(max(array))
print(int(array.index(max(array))+1))