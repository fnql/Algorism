def deep(n,s):
    t= [];
    while n > 0:
        t.append(s//n)
        s -= s//n
        n-=1
    return t

def solution(n, s):
    answer = []
    if n>s:
        answer.append(-1)
        return answer
    else:
        return deep(n,s)
    return te