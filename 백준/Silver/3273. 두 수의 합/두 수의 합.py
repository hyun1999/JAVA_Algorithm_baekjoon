import sys
n = int(input())
arr = list(map(int,sys.stdin.readline().split()))
x = int(input())

l = 0
r = len(arr)-1
count=0
arr.sort()
while l<r:
    sum_val = arr[l]+arr[r]
    if sum_val == x:
        count+=1
        l+=1
    elif sum_val > x:
        r-=1
    elif sum_val < x:
        l+=1
print(count)