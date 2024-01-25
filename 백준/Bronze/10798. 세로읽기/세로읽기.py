array = []
max_len = 0
for i in range(5):
    a = list(input())
    array.append(a)
    if len(a)>max_len:
        max_len = len(a)
for i in range (max_len):
        for j in range(5):
            try:
                print(array[j][i],end='')
            except:
                pass
