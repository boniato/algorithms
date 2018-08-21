#아래는 시간초과 에러

#case1
(len(s) >= 1 and len(s) <= 8) and s.isdigit()
        
#case2
(len(s) >= 1 and len(s) <= 8) and re.compile("[\D]").search(s) == None

#case3
(len(s) >= 1 and len(s) <= 8) and re.search("[\D]", s) == None

#case4
(len(s) >= 1 and len(s) <= 8) and len(re.findall("[\D]", s)) == 0 

#case5
(len(s) >= 1 and len(s) <= 8) and s.isdecimal()

#case6
(len(s) >= 1 and len(s) <= 8) and s.isnumeric()

#case7
def solution(s):
    answer = True
    
    try:
        if( len(s) >= 1 and len(s) <= 8 ):
            tmp = int(s)
    except ValueError:
        answer = False

    return answer

