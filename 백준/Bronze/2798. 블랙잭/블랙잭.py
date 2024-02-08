n,m = map(int,input().split())
arr = list(map(int,input().split()))
arr.reverse()
max_val = 0
for i in range(0,n-2):
    for j in range(i+1,n-1):
        for k in range (j+1,n):
            sum_val = arr[i]+arr[j]+arr[k]
            if sum_val > m: # 합이 M을 초과할 시
                continue
            elif sum_val > max_val:
                max_val = sum_val
                break
            else :
                continue

print(max_val)