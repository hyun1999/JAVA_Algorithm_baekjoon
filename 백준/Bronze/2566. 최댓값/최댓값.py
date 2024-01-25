a=[]

for i in range(9):
    row = list(map(int,input().split()))
    a.append(row)
#입력 완료
max = 0
max_i = 0
max_j = 0
for i in range(9):
    for j in range(9):
        if a[i][j]>max:
            max = a[i][j]
            max_i = i
            max_j = j
print(max)
print(max_i+1,max_j+1)