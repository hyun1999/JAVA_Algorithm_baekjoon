n = int(input())
list = list(map(int,str(n)))
list.sort()
list.reverse()
for i in range(len(list)):
    print(list[i],end='')