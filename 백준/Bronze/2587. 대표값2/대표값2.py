list = []
total = 0
for i in range(5):
    input_val = int(input())
    list.append(input_val)
    total += input_val
list.sort()
print(total//5)
print(list[2])