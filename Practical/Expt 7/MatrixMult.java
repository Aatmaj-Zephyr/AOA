/******************************************************************************

Matrix Multiplication
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[][] matrixData = {{4,10},{10,3},{3,12},{12,20},{20,7}};
	    int [][] jaggedArray = new int [5][5];
	    for (int diff=1;diff<=5-1;diff++){
	    for(int j=0;j<=5-1;j++){
	    for (int i=0;i<=5-1;i++){
	        if((j-i)!=diff){
	            continue; //for diagonal elements order of execution
	        }
	        if(i>j){
	            continue;
	        }
	        if(i==j){
	            jaggedArray[i][j]=0;
	            continue;
	        }
	        int min=10000;
	        for(int k=i;k<j;k++){
	           // System.out.print(jaggedArray[k+1][j]+",");
	        int temp=jaggedArray[i][k]+jaggedArray[k+1][j]+matrixData[i][0]*matrixData[k][1]*matrixData[j][1];
	        if(min>temp){
	            min=temp;
	        }
	        }
	         jaggedArray[i][j]=min;
	    }
	    }
	    }
	    
	     for (int i=0;i<=5-1;i++){
	        for (int j=0;j<=5-1;j++){
	         System.out.print(jaggedArray[i][j]+",");
	    }
	    System.out.println();
	     }
		System.out.println("Hello World");
	}
}
