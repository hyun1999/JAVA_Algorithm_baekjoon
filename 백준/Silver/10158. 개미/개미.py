total_x, total_y = map(int,input().split())
ant_x, ant_y = map(int,input().split())
t = int(input())
a = (ant_x + t)//total_x
b = (ant_y + t)//total_y

if a%2 == 0:
    x = (ant_x+t)%total_x
else:
    x = total_x - (ant_x+t)%total_x

if b%2 == 0:
    y = (ant_y+t)%total_y
else:
    y = total_y - (ant_y+t)%total_y
print(x,y)