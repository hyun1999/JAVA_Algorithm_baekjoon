total = int(input())
various = int(input())
count_total = 0
for i in range(various):
    money,count = map(int,input().split())
    count_total+=money*count

if count_total==total:
    print('Yes')
else:
    print('No')