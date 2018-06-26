# solution1 (for loop)

def solution(n):
    answer = 0
    numList = list(map(int, str(n))) # str to int
    
    for i in numList :
        answer += i
    
    return answer

solution(123)


# solution2 (recursive call)
def solution(n):
    sList = str(n)
    answer = int(sList[0]) # 1 2 3 ..
    
    if len(sList) > 1 :
        sList = sList[1:] #remove first element in list
        answer += solution(sList)
    
    return answer
    
solution(123)
