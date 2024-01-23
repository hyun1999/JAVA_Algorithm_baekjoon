N = int(input())
array = list(map(int,input().split()))
max_value = max(array)
for i in range(N):
    array[i] = array[i]/int(max_value)*100
total = 0
for i in range(N):
    total+=array[i]
print(total/N)