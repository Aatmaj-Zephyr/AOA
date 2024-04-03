# alpha beta pruning with tic tac toe.

board = [[0,0,0],[0,0,0],[0,0,0]]
# board = [[0,0],[0,0]]
# board = [[1,0,0],[0,1,0],[0,0,1]]
#aim can be 1 for X and -1 for O
#return value 1 for X and -1 for O
mylist = [[],[]]

def traverse(alpha,beta,aim,board,steps):
   
    for i in range(len(board)):
        for j in range(len(board[0])):
            if(board[i][j]==0):
                board[i][j] = aim
                if winner(board,aim): # is a node
                    value = aim 
                    # print(board)
                    # print(f'{aim} wins')
                    # print(board,value,alpha,beta,True)
                    board[i][j]=0
                    steps.append((aim,(i,j)))
                   
                    mylist[(1+aim)//2].append(steps)
                    
                    return board,value,alpha,beta,True
                elif winner(board,aim*-1): # is a node
                    value = aim *-1
                    # print(board)
                    # print(f'{aim*-1} wins')
                    # print(board,value,alpha,beta,True)
                    board[i][j]=0
                    steps.append((aim,(i,j)))
                    mylist[1+aim].append(steps)
                    return board,value,alpha,beta,True
                elif no_winners(board):
                    #  print(board,0,alpha,beta,True)
                    #  print("no winners")
                     board[i][j]=0
                     return board,0,alpha,beta,True
               
                _,value_traversed,alpha_traversed,beta_traversed,is_node = traverse(alpha,beta,aim*-1,board,steps+[(aim,(i,j))])
                if(is_node):
                        if(aim>0):
                              alpha_traversed = value_traversed
                        else:
                              beta_traversed = value_traversed
                if(aim>0):
                        if alpha_traversed>alpha:
                            alpha = alpha_traversed 
                else:   
                        if beta_traversed<beta:
                            beta = beta_traversed
                if(alpha>=beta):
                    #prune
                    value = aim
                    # print(board,value,alpha,beta,True)
                    board[i][j]=0
                    # print("prune")
                    return board,value,alpha,beta,True
                board[i][j]=0 #backtrack
                # mylist.append((i,j,value_traversed))
    
    # print(board)
    # print("Backtrack without prune") 
    value = aim
    return board,value,alpha,beta,True




def winner(board,aim):
    win = 0
    col = -2
    row = -2
    n = len(board)
    for i in range(n):
        if all(board[i][j] == board[i][0] and board[i][0] != 0 for j in range(n)):
            win = board[i][0]
            row = i
    
    for j in range(n):
        if all(board[i][j] == board[0][j] and board[0][j] != 0 for i in range(n)):
            win = board[0][j]
            col = j

    if all(board[i][i] == board[0][0] and board[i][i] != 0 for i in range(n)):
        win = board[0][0]

    if all(board[i][n - i - 1] == board[0][n - 1] and board[i][n - i - 1] != 0 for i in range(n)):
        win = board[0][n - 1]
            
    
    return win == aim


 

def no_winners(board):
    prod = 1
    for i in board:
        for j in i:
            prod=prod*j
    if(prod!=0):
        return True
    return False
print(traverse(-100,100,1,board,[]))
print(mylist[1])
