while True:
    arr = list(str(input().rstrip()))
    if len(arr) == 1 and arr[0]=='.': # 만약 .이 나오면 종료
        break
    stack = []
    for i in arr:
        if i == '(' or i =='[':
            stack.append(i)
        elif i == ')':
            if len(stack)!=0 and stack[-1]=='(':
                stack.pop()
            else:
                stack.append(i)
                break
        elif i == ']':
            if len(stack)!=0 and stack[-1]=='[':
                stack.pop()
            else:
                stack.append(']')
                break
        else:
            continue

    if len(stack)!=0:
        print('no')
    else:
        print('yes')