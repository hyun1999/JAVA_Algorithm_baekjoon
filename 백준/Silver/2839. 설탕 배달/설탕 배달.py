n = int(input())
max5kg = n//5
min_val = 10000
while max5kg >= 0:
    tmp = n # 초기화
    count = 0 # 초기화
    count += max5kg
    tmp -= max5kg*5
    count += tmp//3
    if tmp%3 == 0:
        min_val = min(min_val,count)
    max5kg-=1
if min_val == 10000 :
    print(-1)
else:
    print(min_val)