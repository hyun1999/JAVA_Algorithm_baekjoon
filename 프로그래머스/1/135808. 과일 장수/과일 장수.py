def solution(k, m, score):
    answer = 0
    num_arr = [0]*(k+1) #각 가격 개수를 저장할 배열
    for i in score:
        num_arr[i]+=1
    
    rest = 0 #각 가격에서 남은 사과 수
    
    for i in range(k,0,-1):
        answer += ((num_arr[i]+rest)//m) * i
        rest = (num_arr[i]+rest) % m
        
    answer *= m
    
    
    return answer