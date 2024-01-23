/******************************************************************************

Need to put value of N
Depth first search

*******************************************************************************/
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Main
{
public static void main(String[] args) {
System.out.println("Hello World");
int N=4;
int[][] initpositions = new int[N][N];
boolean [] terminated = new boolean[N];
ArrayList<int[][]> listOfPositions = new ArrayList<>();
ArrayList<int[][]> newConfigurations = new ArrayList<>();
listOfPositions.add(initpositions);
 for(int i=0;i<4;i++){
 for (int[][] positions : listOfPositions) {
           
       
for(int queen=i;queen<N;queen++){
    for(int row=0;row<N;row++){//iterate row
  if( checkQueen(queen,positions,row)==true){
      int [] [] positions_cpy = deepCopy(positions);
     positions_cpy[row][queen]=1; //column is queenNo
     // printPos(positions_cpy);
     newConfigurations.add(positions_cpy);
  }
    }
}
}
listOfPositions.clear();
listOfPositions.addAll(newConfigurations);
newConfigurations.clear();

}
        // Convert the ArrayList to a Set to remove duplicates
        HashSet<int[][]> uniqueSet = new HashSet<>(listOfPositions);

        // Convert the Set back to an ArrayList
        ArrayList<int[][]> uniqueList = new ArrayList<>(uniqueSet);

for (int[][] positions : uniqueList) {
       printPos(positions);
    }

}

public static boolean checkQueen(int column,int [][] positions, int row){
   
   if(checkRow(column,positions,row)&&checkdiaLeft(column,positions,row)&&checkdiaRight(column,positions,row)&&checkCol(column,positions,row)){
       return true;
   }
   return false;
   
}
   // Helper method to create a deep copy of a 2D array
    private static int[][] deepCopy(int[][] original) {
        int rows = original.length;
        int cols = original[0].length;
        int[][] copy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, cols);
        }

        return copy;
    }
   
public static boolean checkRow(int column,int [][] positions, int row){
        for(int i=0;i<positions[0].length;i++){ //iterate columns
            if(positions[row][i]==1){
             
                return false;
            }
        }
        return true;
    }
   
    public static boolean checkCol(int column,int [][] positions, int row){
        for(int i=0;i<positions[0].length;i++){ //iterate row
            if(positions[i][column]==1){


             
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
