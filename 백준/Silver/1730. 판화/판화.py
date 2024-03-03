n = int(input())
row_map = [[False for col in range(n)] for row in range(n)]
col_map = [[False for col in range(n)] for row in range(n)]
cur_y = 0
cur_x = 0
input_str = input()
for i in input_str:
    if i == 'D' and cur_y<n-1:
        col_map[cur_y][cur_x] = True
        col_map[cur_y+1][cur_x] = True
        cur_y+=1
    elif i == 'R' and cur_x<n-1:
        row_map[cur_y][cur_x] = True
        row_map[cur_y][cur_x+1] = True
        cur_x+=1
    elif i == 'U' and cur_y>0:
        col_map[cur_y][cur_x] = True
        col_map[cur_y-1][cur_x] = True
        cur_y-=1
    elif i == 'L'and cur_x>0:
        row_map[cur_y][cur_x] = True
        row_map[cur_y][cur_x-1] = True
        cur_x-=1
    else:
        continue

for i in range(0,n):
    for j in range(0,n):
        if row_map[i][j] and col_map[i][j]:
            print('+',end='')
        elif row_map[i][j]:
            print('-',end='')
        elif col_map[i][j]:
            print('|',end='')
        else:
            print('.',end='')
    print()