array = [] # 소인수 분해 결과를 넣을 배열
val = int(input()) # 입력값 받음
if(val != 1):
    while(val != 1):
        count = 2
        while True:
            if(val%count==0):
                array.append(count)
                val /= count
                break;
            else:
                count+=1
for i in array:
    print(i)