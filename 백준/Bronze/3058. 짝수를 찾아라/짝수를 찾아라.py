t = int(input())

for i in range(t):
    arr = list(map(int,input().split()))
    sum = 0
    min_val = 1000
    for j in arr:
        if j%2 == 0:
            sum+=j
            min_val = min(min_val,j)
    print(sum,min_val)