import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] a = {11,2,3,45};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] mergeSort(int[] a){
	    System.out.println(Arrays.toString(a));
	    if(a.length==1){
	        return a;
	    }
	    int[] b=mergeSort(Arrays.copyOfRange(a, 0, a.length/2));
	    int [] c=mergeSort(Arrays.copyOfRange(a, a.length/2,a.length));
	    
	    int i=0;int j=0;
	    while((i+j)<=a.length-1){
	    
	    if(i>=b.length){
	        //first array is now over
	        while((i+j)<=a.length-1){
	            a[i+j]=c[j];
	            j++;
	        }
	    }
	    if(j>=c.length){
	        //second array is now over
	        while((i+j)<=a.length-1){
	            a[i+j]=b[i];
	             i++;
	        }
	    }
	    else{
	    
	    if(b[i]>c[j]){
	        a[i+j]=b[i];
	        i++;

	    }
	    else{
	        a[i+j]=c[j];
	        j++;
	    }
	    }
	    }
	    
	    
	    return a;
	}
}
