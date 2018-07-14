def solution(s):
    answer = str()
    strList = s.lower().split(' ')
    
    for s in strList:
        for i, a in enumerate(s):
            if i % 2 == 0:
                a = a.upper()
            answer += a
        answer += ' '
    
    return answer[:-1]
