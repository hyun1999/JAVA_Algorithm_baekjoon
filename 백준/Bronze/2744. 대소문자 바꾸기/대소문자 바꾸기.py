str = input()
for i in str:
    if 'Z' >= i >= 'A':
        print(i.lower(),end='')
    else:
        print(i.upper(),end='')