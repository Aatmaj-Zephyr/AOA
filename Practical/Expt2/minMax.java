/******************************************************************************

Recursive Max,Min
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] a={45,111,3,5,0,54,2,4,9};
		System.out.println(max(a,0,a.length-1));
			System.out.println(min(a,0,a.length-1));
		
	}
	public static int max(int[]a,int start,int end){
	    if(start==end){
	        return a[start];
	    }
	    int mid=(int)((start+end)/2);
	    int b=max(a,start,mid);
	    int c=max(a,mid+1,end);
	    if(b>c){
	        return b;
	    }
	    else{
	        return c;
	    }
	    
	}
		public static int min(int[]a,int start,int end){
	    if(start==end){
	        return a[start];
	    }
	    int mid=(int)((start+end)/2);
	    int b=min(a,start,mid);
	    int c=min(a,mid+1,end);
	    if(b<c){
	        return b;
	    }
	    else{
	        return c;
	    }
	    
	}
}
