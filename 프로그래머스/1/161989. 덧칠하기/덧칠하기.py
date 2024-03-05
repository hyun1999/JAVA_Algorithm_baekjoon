def solution(n, m, section):
    answer = 0
    painted_index = 0 # 페인트칠을 한 인덱스값 저장
    # n = 벽 총 길이
    # m = 롤러 길이
    
    for i in section:
        if i > painted_index:
            painted_index = i+m-1
            answer+=1
        
    return answer