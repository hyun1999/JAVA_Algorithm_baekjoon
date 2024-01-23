N,M = map(int,input().split())  #N = 바구니 갯수 M = 바꾸는 횟수
array = [i for i in range(1,N+1)]
for _ in range(M):
    i,j = map(int,input().split())
    i-=1
    j-=1
    while i<=j :
        array[i],array[j] = array[j],array[i]
        i+=1
        j-=1

for i in range(N):
    print(array[i],end= ' ')