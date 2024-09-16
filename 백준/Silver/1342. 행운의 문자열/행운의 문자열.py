S = list(input())
level = len(S)
def recur(lev):
	global ing, chars, cnt, level, total_count
	# 종료 케이스
	# lev가 다 된 경우
	if lev == level:
		total_count+=1
		return

	for i in chars:
		if cnt[i] == 0:
			continue
		if ing and ing[-1] == i:
			continue

		cnt[i] -= 1
		ing.append(i)

		recur(lev+1)
		cnt[i] += 1
		ing.pop()


ing = []
chars = set()
cnt = {}
total_count = 0
for i in S:
	chars.add(i)
	if i not in cnt:
		cnt[i] = 0
	cnt[i]+=1
recur(0)

print(total_count)
