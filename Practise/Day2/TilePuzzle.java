/******************************************************************************

15 tile game

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [][] array ={{1,2,3,4},{5,6,7,8},{9,10,-1,12},{13,14,11,15}};
		/*swap(array,3,2,3);
		print(array);
		unswap(array,3,2,3);
		print(array);*/
		System.out.println(check(array));
		solve(array,-1,100);
	}
	//i column
//	j row
	public static int solve(int [][]array,int lastOp,int lastError){
	    int p=-1;
	    int q=-1;
	    //find position of blank
	  for(int i =0;i<4;i++){
	        for(int j=0;j<4;j++){
	            if(array[i][j]==-1){
	                p=i;
	                q=j;
	            }
	        }
	  }
	
	  for(int k=1;k<=4;k++){
	      int[][]  arraycpy=copy(array);
	      if(IsComplementary(k,lastOp)==true){
	          continue;// dont repeat
	      }
	      int swapped=swap(arraycpy,p,q,k);
	      
	      if(check(arraycpy)==1){
	          System.out.println("Answer->>");
	          print(arraycpy);
	          return 0;
	          //soln
	          
	      }
	      if(check(arraycpy)<lastError){
	         // print(array);
	        //  System.out.println("Error reduced from "+lastError+"to "+check(arraycpy));
	        //  print(arraycpy);
	        //   System.out.println("Next->>");
	          
	          if(solve(arraycpy,k,check(arraycpy))==1){
	           return 0;   
	          }
	      }
	    //  print(arraycpy);
	  }
	   
	  
	  
	  return -1;
	}

	public static boolean IsComplementary(int k, int dir){
	    if(dir==1 && k==2){//up
	  return true;
	        
	    }
	    if(dir==2 && k==1){//down
	  return true;
	    }
	    
	    if(dir==3 && k==4){//left
	   return true;
	    }
	     if(dir==4 && k==3){//right
	      return true;
	        
	    }
	    return false;
	    
	}
		public static int unswap(int [][]array,int i,int j,int dir){
	    
	    if(dir==1){//up
	  return swap(array,i-1,j,2);
	        
	    }
	    if(dir==2){//down
	  return  swap(array,i+1,j,1);
	    }
	    
	    if(dir==3){//left
	   return swap(array,i,j-1,4);
	    }
	     if(dir==4){//right
	     return swap(array,i,j+1,3);
	        
	    }
	    
	    
	    
	    return 0;
	}
	
	public static int swap(int [][]array,int i,int j,int dir){
	    int temp=-5;
	    if(dir==1){//up
	    if(i==0){
	        return 1;
	    }
	        temp = array[i-1][j];
	        array[i-1][j]=-1;
	        
	    }
	    if(dir==2){//down
	    if(i==3){
	        return 1;
	    }
	        temp = array[i+1][j];
	        array[i+1][j]=-1;
	        
	    }
	    
	    if(dir==3){//left
	    if(j==0){
	        return 1;
	    }
	        temp = array[i][j-1];
	        array[i][j-1]=-1;
	        
	    }
	     if(dir==4){//right
	    if(j==3){
	        return 1;
	    }
	        temp = array[i][j+1];
	        array[i][j+1]=-1;
	        
	    }
	    
	    
	    
	    array[i][j]=temp;
	    return 0;
	}
	public static int check(int[][] array){
	    int error=0;
	    for(int i =0;i<4;i++){
	        for(int j=0;j<4;j++){
	            
	            if(array[i][j]!=4*(i)+j+1) {//check values
	           // System.out.println(j+""+i+" "+array[i][j]);
	            error++;
	              //wrong
	            }
	        }
	    }
	    return error;
	}
    public static int [][] copy(int [][]array){
        int [][] newarr = new int [array.length][array[1].length];
        for(int i =0;i<4;i++){
	        for(int j=0;j<4;j++){
	           newarr[i][j]=array[i][j];
	        }
	        
	      }
        return newarr;
    }
		public static void print(int[][]array){
	      for(int i =0;i<4;i++){
	        for(int j=0;j<4;j++){
	            System.out.print(array[i][j]+",");
	        }
	         System.out.println();
	      }
	}
}
