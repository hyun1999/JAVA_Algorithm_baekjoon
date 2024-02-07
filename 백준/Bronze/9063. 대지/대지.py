n = int(input())
arr_left = []
arr_right = []
for i in range(n):
    a,b = map(int,input().split())
    arr_left.append(a)
    arr_right.append(b)
left_min = min(arr_left)
left_max = max(arr_left)
right_min = min(arr_right)
right_max = max(arr_right)
print((left_max-left_min)*(right_max-right_min))