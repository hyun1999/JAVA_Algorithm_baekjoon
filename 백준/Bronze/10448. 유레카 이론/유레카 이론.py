arr = [1,3]
for i in range(3,47):
    arr.append((i*(i+1))//2)
T = int(input())
for i in range(T):
    input_val = int(input())
    flag = False
    for i in range(0,46):
        for j in range(0,46):
            for k in range(0,46):
                if arr[i]+arr[j]+arr[k] == input_val:
                    flag = True
                    break
            if flag:
                break
        if flag:
            break
    if flag:
        print(1)
    else:
        print(0)