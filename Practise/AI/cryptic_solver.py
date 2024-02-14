a = 'EAT'
b = 'THAT'
c='APPLE'

from itertools import permutations

unique = "".join(list(set(a+b+c)))


print(unique)
my_combinations = [x for x in permutations(range(10),len(unique))]
# print(my_combinations)
# print(len(my_combinations))
for order in my_combinations:
    # print(order)
    A = a 
    B = b 
    C = c
    for i in range(len(unique)):
        char = unique[i]
        num = str(order[i])
        #print(f"char: {char} num: {num}")
        A = A.replace(char,num)
        B = B.replace(char,num)
        C = C.replace(char,num)
    # print((A,B,C))
    A=int(A)
    B=int(B)
    C=int(C)
   
    if(A+B==C):
        print("Answer obtained")
        print((A,B,C))
