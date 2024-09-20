N, M = map(int, input().split(" "))
mapping = []
dp = [[0] * M for _ in range(N)]  # DP 배열을 0으로 초기화

for i in range(N):
    mapping.append(list(map(int, input().split(" "))))

# DP 배열 초기값 설정
dp[0][0] = mapping[0][0]

# 첫 번째 행 초기화
for c in range(1, M):
    dp[0][c] = dp[0][c-1] + mapping[0][c]

# 첫 번째 열 초기화
for r in range(1, N):
    dp[r][0] = dp[r-1][0] + mapping[r][0]

# DP 배열 채우기
for r in range(1, N):
    for c in range(1, M):
        dp[r][c] = max(dp[r-1][c], dp[r][c-1]) + mapping[r][c]

# 결과 출력
print(dp[N-1][M-1])