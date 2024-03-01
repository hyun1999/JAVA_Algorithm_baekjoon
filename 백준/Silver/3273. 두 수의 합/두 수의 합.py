import sys
n = int(input())
arr = sorted(list(map(int,sys.stdin.readline().split())))
x = int(input())

l = 0
r = n-1
count=0
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