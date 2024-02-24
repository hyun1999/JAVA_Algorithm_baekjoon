import sys
n,m = map(int,sys.stdin.readline().split())
arr = [0]
arr.extend(list(map(int,sys.stdin.readline().split())))
arr.append(0)
for i in range(1,n+1):
    arr[i] = arr[i-1]+arr[i]
for i in range(m):
    a,b = map(int,sys.stdin.readline().split())
    print(arr[b]-arr[a-1])