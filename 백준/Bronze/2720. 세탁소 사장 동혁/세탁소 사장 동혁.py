n = int(input())
for _ in range(n):
    money = int(input())
    print(money//25,end=' ')
    money %= 25
    print(money//10,end=' ')
    money %= 10
    print(money//5,end=' ')
    money %= 5
    print(money,end=' ')
    print()