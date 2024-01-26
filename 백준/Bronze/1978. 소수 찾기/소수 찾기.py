n = int(input())
array = list(map(int,input().split()))
count = len(array)
for i in array: # 입력 받은값 하나씩 살펴봄
    if i==1:
        count-=1
    for j in range(2,i): # 값 하나가 소수인지 확인
        if(i%j==0):
            count-=1
            break
print(count)