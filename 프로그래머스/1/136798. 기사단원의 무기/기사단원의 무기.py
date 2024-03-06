def solution(number, limit, power):
    answer = 0
    attack = []
    for i in range(1,number+1):
        result = []
        for j in range(1,int(i**(1/2))+1):
            if i%j == 0:
                result.append(j)
                result.append(i//j)
        l = len(set(result))
        if l > limit:
            attack.append(power)
        else:
            attack.append(l)
    answer = sum(attack)
    
    return answer