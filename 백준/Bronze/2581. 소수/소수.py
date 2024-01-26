start = int(input())
end = int(input())
array = []
for i in range(start,end+1):
    is_sosu = True
    if(i>1):
        for j in range(2,i):
            if(i%j==0):
                is_sosu = False
                break
            else:
                is_sosu = True
        if is_sosu == True:
            array.append(i)
if len(array) == 0:
    print(-1)
else:
    print(sum(array))
    print(array[0])