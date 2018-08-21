def solution(n):
    answer = 0
    
    #restriction : n is more than 0 and less than 3000 natural numbers
    if n > 0 and n <= 3000:
        for i in range(1, n+1):
            if n % i == 0:
                answer += i
            
    return answer


### The below is other person's code example ###
def sumDivisor(num):
    return num + sum([i for i in range(1, (num // 2) + 1) if num % i == 0])
