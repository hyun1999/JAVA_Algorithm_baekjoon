M,N = map(int,input().split())
array = [0]*M
for i in range(N):
    first,last,num = map(int,input().split())
    for j in range(first-1,last):
        array[j] = num
for i in range(M):
    print(array[i],end=' ')