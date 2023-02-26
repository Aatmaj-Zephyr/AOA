import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] a = {5,11,2,3,45,34};
		quickSort(a,0,4);
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int[] a,int start, int end){
	    if(end<start){
	        return;
	    }
	    int pivot=a[start];
	    int i = start+1;
	    int j= end;
	    
	    while(i<j){
	        while(a[i]<pivot){
	            i++;
	            if(i>end){
	                break;
	            }
	        }
	         while(a[j]>pivot){
	            j--;
	            if(j<start){
	                break;
	            }
	        }
            if(i<j){
	        //swap a[i],a[j]
	        int temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
            
	        i++;
	        j--;
            }
	    }
	    //swap pivot and a[j]
	     a[start]=a[j];
	     a[j]=pivot;
	     
	    quickSort(a,start,j-1);
	    quickSort(a,j+1,end);
	}
}
