s1 = input()
s2 = input()

N,M = len(s1), len(s2)


# 초기값 처리
dp = [[0] * (M+1) for _ in range(N+1)]

for i in range(0,N):
	for j in range(0,M):
		dp[i][j] = " "

# DP Table 갱신
for n in range(0,N):
	for m in range(0,M):
		if s1[n] == s2[m]:
			dp[n][m] = dp[n-1][m-1]+1
		else:
			dp[n][m] = max(dp[n-1][m],dp[n][m-1])
print(dp[N-1][M-1])