n = int(input())
arr = list(map(int,input().split()))
arrCopy = []

for i in range(n):
    arrCopy.append([arr[i],i])

arrCopy.sort()
arrCopy2 = []
count = 0
arrCopy2.append([arrCopy[0],0])
for i in range(1,len(arrCopy)):
    if arrCopy[i-1][0]==arrCopy[i][0]:
        arrCopy2.append([arrCopy[i],count])
    else :
        count+=1
        arrCopy2.append([arrCopy[i],count])
arrCopy2.sort(key = lambda x:(x[0][1]))

for i in range(n):
    print(arrCopy2[i][1],end=' ')