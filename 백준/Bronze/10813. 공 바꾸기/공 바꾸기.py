M,N = map(int,input().split())
array = [i for i in range(1,M+1)]

for i in range(N):
    first, last = map(int,input().split())
    array[first-1],array[last-1] = array[last-1],array[first-1]

for i in range(M):
    print(array[i],end=' ')