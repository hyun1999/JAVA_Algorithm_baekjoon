n = int(input())
row_map = [[False for col in range(n)] for row in range(n)]
col_map = [[False for col in range(n)] for row in range(n)]
cur_x = 0
cur_y = 0
input_str = input()
for i in input_str:
    if i == 'D' and cur_x<n-1:
        col_map[cur_x][cur_y] = True
        col_map[cur_x+1][cur_y] = True
        cur_x+=1
    elif i == 'R' and cur_y<n-1:
        row_map[cur_x][cur_y] = True
        row_map[cur_x][cur_y+1] = True
        cur_y+=1
    elif i == 'U' and cur_x>0:
        col_map[cur_x][cur_y] = True
        col_map[cur_x-1][cur_y] = True
        cur_x-=1
    elif i == 'L'and cur_y>0:
        row_map[cur_x][cur_y] = True
        row_map[cur_x][cur_y-1] = True
        cur_y-=1
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