N, M = map(int,input().split(" "))
books = list(map(int,input().split(" ")))
books = sorted(books)

plus_books=[]
minus_books=[]
far_val = 0
most_far_val = 0
total_walk = 0
def func():
	global plus_books, minus_books, far_val, most_far_val, total_walk
	for i in books:
		if i>=0:
			plus_books.append(i)
			if abs(i) > abs(far_val):
				most_far_val = i
				far_val = abs(i)
		else:
			minus_books.append(i)
			if abs(i) > abs(far_val):
				most_far_val = i
				far_val = abs(i)

	# 음수이면
	if most_far_val < 0:
		total_walk += abs(minus_books.pop(0))
		for _ in range(min(M-1,len(minus_books))):
			minus_books.pop(0)
	# 양수이면
	else:
		total_walk += abs(plus_books.pop(len(plus_books)-1))
		for _ in range(min(M-1,len(plus_books))):
			plus_books.pop(len(plus_books)-1)
	# 초기 세팅 완료

	# 양수
	while len(plus_books) > 0:
		try:
			total_walk += 2*plus_books.pop()
			for _ in range(min(M-1,len(plus_books))):
				plus_books.pop()
		except:
			break
	# 음수
	while len(minus_books) > 0:
		try:
			val = abs(minus_books[0])
			total_walk += 2*abs(minus_books.pop(0))
			for _ in range(min(M-1,len(minus_books))):
				minus_books.pop(0)
		except:
			break
if len(books) == 1 :
	print(books[0])
elif len(books) == 0:
	print(0)
else:
	func()
	print(total_walk)

