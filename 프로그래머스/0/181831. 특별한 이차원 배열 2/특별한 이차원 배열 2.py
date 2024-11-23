def solution(arr):
    answer = 0
    flag = False
    for i in range(0,len(arr)):
        for j in range(0,len(arr[0])):
            if arr[i][j] != arr[j][i]:
                flag = True
    if flag == True:
        answer = 0
    else:
        answer = 1
    return answer