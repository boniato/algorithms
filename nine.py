def solution(arr):
    answer = [arr[0]]

    for idx, i in enumerate(arr) :
        if idx > 0 :
            prev = arr[idx-1]   # previous element in array
            curr = i            # currnet element in array
            if prev != curr : answer.append(curr)

    return answer
