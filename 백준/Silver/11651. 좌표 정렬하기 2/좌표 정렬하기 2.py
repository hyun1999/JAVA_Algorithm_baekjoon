n = int(input())
arr = []
for i in range(n):
    a,b = map(int,input().split())
    arr.append([b,a])
arr.sort()
for i in range(n):
    for j in reversed(arr[i]):
        print(j,end=' ')
    print()