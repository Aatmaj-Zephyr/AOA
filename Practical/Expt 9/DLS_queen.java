/******************************************************************************

Need to put value of N
Depth limited search
*******************************************************************************/
public class Main
{
public static void main(String[] args) {
System.out.println("Hello World");
int N=4;
int[][] positions = new int[N][N];

boolean a = place(0,positions,5);

//printPos(positions);
}
public static boolean place(int queenNo,int[][] positions,int depthLimit){
   if(depthLimit==0){
        return false;
   }
   boolean val=false;
        for(int row=0;row<positions[0].length;row++){//iterate row
       
       if(checkQueen(queenNo,positions,row)==true){
           //place queen
               positions[row][queenNo]=1; //column is queenNo
               
               if(queenNo==positions[0].length-1){
                   //end of recursion
                        printPos(positions);
                        positions[row][queenNo]=0;
                   return true;
               }
               //recur
               if(place(queenNo+1,positions,depthLimit-1)==false){
                   //failed
                    positions[row][queenNo]=0;
                    continue; //look for next position
               }
               else{
                        val = true;//valid position
                        positions[row][queenNo]=0;
                        continue; //still look for next position
                   
               }
       }
   }
        if(val==true){
            return true;
        }
   //backtrack
   return false;
}
public static boolean checkQueen(int column,int [][] positions, int row){
   
   if(checkRow(column,positions,row)&&checkdiaLeft(column,positions,row)&&checkdiaRight(column,positions,row)){
       return true;
   }
   return false;
   
}
public static boolean checkRow(int column,int [][] positions, int row){
        for(int i=0;i<positions[0].length;i++){ //iterate columns
            if(positions[row][i]==1){
             
                return false;
            }
        }
        return true;
    }
    public static boolean checkdiaLeft(int column,int [][] positions, int row){
        for(int i=0;i<positions[0].length;i++){ //iterate row
        for(int j=0;j<positions[0].length;j++){ //iterate columns
           if(i-j==row-column){
             
              if(positions[i][j]==1 ){
             
                return false;
            }
           }
        }
       
    }
     return true;
    }
   
     public static boolean checkdiaRight(int column,int [][] positions, int row){
        for(int i=0;i<positions[0].length;i++){ //iterate row
        for(int j=0;j<positions[0].length;j++){ //iterate columns
           if(i+j==row+column){
             
              if(positions[i][j]==1 ){
             
                return false;
            }
           }
        }
       
    }
     return true;
    }
   
   
    public static void printPos(int [][] positions){
         for(int i=0;i<positions[0].length;i++){ //iterate columns
             for(int j=0;j<positions[0].length;j++){ //iterate rows
            System.out.print(positions[i][j]+",");
        }
        System.out.println();
        }
        System.out.println("___________________");
    }
}
