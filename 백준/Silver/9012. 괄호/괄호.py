n = int(input())
for i in range(n):
    bool_val = False
    arr = list(str(input()))
    stack = []
    for j in range(len(arr)):
        if arr[j] == '(':
            stack.append('(')
        else:
            if len(stack)>0:
                stack.pop()
            elif len(stack)==0:
                if arr[j] == ')':
                    bool_val = True
                    break;
    if bool_val == True:
        print('NO')
    elif len(stack)==0:
        print('YES')
    else:
        print('NO')