n = int(input())
arr = []
for i in range(n):
    a,b = map(int,input().split())
    arr.append([a,b])

arr.sort()
for i in range(len(arr)):
    for j in range(len(arr[i])):
        print(arr[i][j],end=' ')
    print()