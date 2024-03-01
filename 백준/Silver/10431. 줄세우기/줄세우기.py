n = int(input())
for _ in range(n):
    count=0
    arr = list(map(int,input().split()))
    for i in range(1,len(arr)-1):
        for j in range(i+1,len(arr)):
            if arr[i]>arr[j]:
                arr[i],arr[j] = arr[j],arr[i]
                count+=1
    print(arr[0],count)