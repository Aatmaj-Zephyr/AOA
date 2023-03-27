/*
Warshall algo for all pair shortest path


*/
public class Main
{
	public static void main(String[] args) {
    int [] [] matrix = {{ 0, 5, 1000, 10 },
                          { 1000, 0, 3, 1000 },
                          { 1000, 1000, 0, 1 },
                          { 1000, 1000, 1000, 0 } };
                          
    int[][] matrix2 = new int[4][4];
    
    for(int k=0;k<4;k++){//hor
    for(int i=0;i<4;i++){//hor
         for(int j=0;j<4;j++){//vert
        if(i==k | j==k | i==j){ //for target element and diagonal
            matrix2[i][j]=matrix[i][j];
        }
        
        if(matrix[i][k]+matrix[k][j]<matrix[i][j]){
            matrix[i][j]=matrix[i][k]+matrix[k][j];
        }
    }
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
