n,k = map(int,input().split())
# n = 동전 종류, k = 목표 금액
coin = []
for i in range(n):
    coin.append(int(input()))

for i in range(n-1,0,-1):
    if coin[i]>k:
        coin.pop()

coin.reverse()
bool_val = False
result = 0
while True:
    result = 0
    for i in coin:
        result += k//i
        k = k%i
        if k == 0:
            bool_val = True
            break
    if bool_val == True:
        break
print(result)