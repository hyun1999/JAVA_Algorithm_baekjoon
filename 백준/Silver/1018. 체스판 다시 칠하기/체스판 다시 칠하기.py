N, M = map(int, input().split())
chess = []
for i in range(N):
    chess.append(list(input()))

def count_repaints(x, y, first_color):
    count = 0
    for i in range(8):
        for j in range(8):
            # (i + j) % 2 == 0 일 때는 first_color가 와야 하고, 아닐 때는 반대 색이 와야 한다.
            if (i + j) % 2 == 0:
                if chess[x + i][y + j] != first_color:
                    count += 1
            else:
                if chess[x + i][y + j] == first_color:
                    count += 1
    return count

min_val = float('inf')
for i in range(N - 7):
    for j in range(M - 7):
        # 왼쪽 위가 'W'로 시작하는 경우와 'B'로 시작하는 경우 각각 검사
        repaints_w_start = count_repaints(i, j, 'W')
        repaints_b_start = count_repaints(i, j, 'B')
        min_val = min(min_val, repaints_w_start, repaints_b_start)

print(min_val)