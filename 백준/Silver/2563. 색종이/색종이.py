array = [[False] * 101 for i in range(101)] #2차원 배열 선언
N = int(input())
for _ in range(N):
    x,y = list(map(int,input().split()))

    for row in range(x,x+10):
        for col in range(y,y+10):
            array[row][col] = True

result = 0

for i in array:
    result+=i.count(True)

print(result)