import sys
from collections import deque
n = int(input())
q = deque()
for i in range(n):
    arr = list(map(str,sys.stdin.readline().rstrip().split()))
    if arr[0] == 'push':
        q.append(arr[1])
    elif arr[0] == 'pop':
        if len(q)==0:
            print(-1)
        else:
            print(q.popleft())
    elif arr[0] == 'size':
        print(len(q))
    elif arr[0] == 'empty':
        if q:
            print(0)
        else:
            print(1)
    elif arr[0] == 'front':
        if q:
            a = q.popleft()
            print(a)
            q.appendleft(a)
        else:
            print(-1)
    else:
        if q:
            a = q.pop()
            print(a)
            q.append(a)
        else:
            print(-1)