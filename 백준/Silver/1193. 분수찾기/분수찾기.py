num = int(input())
line = 1

while num > line:
    num -= line
    line+=1
# 몇번째 줄인지 구함
if (line%2 == 0): #짝수일때
    a = num
    b = line - num + 1
else: #홀수일때
    a = line - num + 1
    b = num
print(a,'/',b,sep='')