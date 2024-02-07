array1 = []
array2 = []
for i in range(3):
    a,b = map(int,input().split())
    array1.append(a)
    array2.append(b)
for i in range(3):
    if(array1.count(array1[i]))==1:
        print(array1[i],end=' ')
for i in range(3):
    if(array2.count(array2[i]))==1:
        print(array2[i])