while True:
    array = []
    a,b,c = map(int,input().split())
    array.append(a)
    array.append(b)
    array.append(c)
    if a == b == c == 0:
        break;
    max_val = max(array)
    max_index = array.index(max_val)
    sum_val = 0
    for i in range(3):
        if i == max_index:
            pass
        else : sum_val+=array[i]
    if sum_val<=max_val:
        print("Invalid")
    elif len(set(array)) == 1:
        print("Equilateral")
    elif len(set(array)) == 2:
        print("Isosceles")
    else:
        print("Scalene")