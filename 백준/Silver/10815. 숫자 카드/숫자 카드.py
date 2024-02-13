import sys
n = int(input())
arr = list(map(int,sys.stdin.readline().split()))
set_arr = set(arr)
m = int(input())
arr2 = list(map(int,sys.stdin.readline().split()))
for i in arr2:
    if i in set_arr:
        print(1,end=' ')
    else:
        print(0,end=' ')