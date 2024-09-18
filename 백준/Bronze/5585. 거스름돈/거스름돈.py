N = int(input())
re_val = 1000-N
total = 0

coins = [500,100,50,10,5,1]
for coin in coins:
	total += re_val//coin
	re_val = re_val%coin
print(total)