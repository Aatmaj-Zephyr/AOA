import java.util.*;
public class Main
{   
    static int time;

	public static void main(String[] args) {
	 int size=3000;
        int[] a = new int[size];
        Random rd = new Random(); // creating Random object
        for(int i=0;i<size;i++){
            a[i]=rd.nextInt(1000);
        }
         for(int i=0;i<size;i++){
		quickSort(a,0,i);
		System.out.println(time);
         }
		
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
	            time++;
	            i++;
	            if(i>end){
	                break;
	            }
	        }
	         while(a[j]>pivot){
	             time++;
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
