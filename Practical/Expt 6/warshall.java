/*
Warshall algo for all pair shortest path


*/
public class Main
{
	public static void main(String[] args) {
    int [] [] matrix = {{ 0, 3, 1000, 7 },
                          { 8, 0, 2, 1000 },
                          { 5, 1000, 0, 1 },
                          { 2, 1000, 1000, 0 } };
                          
    int[][] matrix2 = new int[4][4];
    
    for(int k=0;k<4;k++){//hor
    
    for(int i=0;i<4;i++){//hor
         for(int j=0;j<4;j++){//vert
        if(i==k | j==k | i==j){ //for target element and diagonal
            matrix2[i][j]=matrix[i][j];
        }
      //  System.out.println(matrix[i][k]+matrix[k][j]);
        if((matrix[i][k]+matrix[k][j])<matrix[i][j]){
            matrix2[i][j]=matrix[i][k]+matrix[k][j];
        }
        else{
            matrix2[i][j]=matrix[i][j];
        }
    }
    }
    
    //copy matrix
    for(int i=0;i<4;i++){//hor
         for(int j=0;j<4;j++){//vert
         // System.out.print(matrix2[i][j]+",");
        matrix[i][j]=matrix2[i][j];
         }
      //  System.out.println();
            
        }
    }
        for(int i=0;i<4;i++){//hor
         for(int j=0;j<4;j++){//vert
         System.out.print(matrix2[i][j]+",");
         }
         System.out.println();
            
        }
		System.out.println("Hello World");
	}
}
