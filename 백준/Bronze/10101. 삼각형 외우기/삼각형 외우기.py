array = []
for i in range(3):
    array.append(int(input()))

if array[0] == array[1] == array[2] == 60:
    print("Equilateral")
elif sum(array)==180:
    if array[0] != array[1] and array[1]!=array[2] and array[0] != array[2]:
        print("Scalene")
    else :
        print("Isosceles")
else :
    print("Error")