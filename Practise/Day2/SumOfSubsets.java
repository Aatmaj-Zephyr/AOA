/******************************************************************************

Sum of Subsets

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int [] array={1,2,3,4,5};
		int max=9;
		solve(0,9,0,array," ");
	}
	public static void solve(int i,int max,int sum,int[] array,String a){
	    if(sum==max){
	         System.out.print("Found solution "+a+"\n");
	    }
	    else if(sum>=max){
	        //bound
	    }
	    else if(i>array.length-1){
	        // length over
	    }
	    else{
	        solve(i+1,max,sum+array[i],array,a+array[i]+",");
	        solve(i+1,max,sum,array,a);
	    }
	}
	
}
