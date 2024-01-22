M,N = map(int,input().split())
array = []

def change(first,last):
    tmp = array[first-1]
    array[first-1] = array[last-1]
    array[last-1] = tmp

for i in range(1,M+1):
    array.append(i)
for i in range(N):
    first, last = map(int,input().split())
    change(first,last)

for i in range(M):
    print(array[i],end=' ')