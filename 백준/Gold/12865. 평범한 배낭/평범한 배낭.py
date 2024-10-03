N, K = map(int,input().split(" "))
Vn = [0]
Wn = [0]
for i in range(N):
	W, V = map(int,input().split(" "))
	Wn.append(W)
	Vn.append(V)

dp = [[0 for _ in range(K+1)] for _ in range(N+1)]

for i in range(1,N+1):
	for j in range(1,K+1):
		dp[i][j] = dp[i-1][j]
		if j-Wn[i] >= 0:
			dp[i][j] = max(dp[i][j],dp[i-1][j-Wn[i]]+Vn[i])
print(dp[N][K])