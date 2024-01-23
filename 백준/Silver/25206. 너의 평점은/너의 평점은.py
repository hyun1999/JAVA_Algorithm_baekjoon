rating = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F']
score = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0]
total_score = 0
total_num = 0
for _ in range(20):
    a,b,c = input().split()
    b = float(b)
    if c != 'P':
        idx = rating.index(c)
        total_num+=b
        total_score += b * score[idx]

print('%.6f' % (total_score/total_num))