a,b = map(int,input().split())
count_row = 0
count_col = 0
arr = []

for i in range(a):
    arr.append(input())

for i in range(a):
    if 'X' not in arr[i]:
        count_row+=1

for j in range(b):
    if 'X' not in [arr[i][j] for i in range(a)]:
        count_col+=1
print(max(count_row,count_col))