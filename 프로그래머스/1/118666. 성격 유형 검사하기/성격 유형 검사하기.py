def solution(survey, choices):
    type = {'R': 0, 'T': 0, 'C': 0, 'F': 0, 'J': 0, 'M': 0, 'A': 0, 'N': 0}
    for i in range(len(choices)):
        if choices[i] < 4:
            type[survey[i][0]] += (choices[i] * 3) % 4
        if choices[i] > 4:
            type[survey[i][1]] += choices[i] % 4
    type_key = list(type.keys())

    answer = ''
    
    for i in range(0,len(type_key),2):
        if type[type_key[i]] > type[type_key[i+1]]:
            answer += type_key[i]
        elif type[type_key[i]] < type[type_key[i+1]]:
            answer += type_key[i+1]
        else:
            answer += min(type_key[i], type_key[i+1])
        
    return answer