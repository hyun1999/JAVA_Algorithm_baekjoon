import sys
from collections import deque
n = int(input())
q = deque()
for i in range(n):
    arr = list(map(int,sys.stdin.readline().split()))
    if arr[0] == 1:
        q.appendleft(arr[1])
    elif arr[0] == 2:
        q.append(arr[1])
    elif arr[0] == 3:
        if q :
            print(q.popleft())
        else:
            print(-1)
    elif arr[0] == 4:
        if q :
            print(q.pop())
        else:
            print(-1)
    elif arr[0] == 5:
        print(len(q))
    elif arr[0] == 6:
        if q:
            print(0)
        else:
            print(1)
    elif arr[0] == 7:
        if q:
            print(q[0])
        else:
            print(-1)
    else:
        if q:
            print(q[len(q)-1])
        else:
            print(-1)