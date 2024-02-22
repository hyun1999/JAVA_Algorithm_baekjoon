import sys
from collections import deque
n = int(sys.stdin.readline())
arr = list(map(int,sys.stdin.readline().split()))
arr_val = list(map(int,sys.stdin.readline().split()))
input_n = int(sys.stdin.readline())
input_val = list(map(int,sys.stdin.readline().split()))

q = deque()
count = 0
for i in arr:
    if i == 0:
        val = int(arr_val[count])
        q.append(val)
    count+=1

q.reverse()

for i in input_val:
    q.append(i)


for i in range(input_n):
    print(q.popleft(),end=' ')