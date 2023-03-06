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
        for(int i=10;i<size;i=i+1){
		mergeSort(Arrays.copyOfRange(a, 0, i));
		System.out.println(time);
		time=0;
        }
	}
	
	public static int[] mergeSort(int[] a){
	    //System.out.println(Arrays.toString(a));
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
	            time++;
	        }
	    }
	    if(j>=c.length){
	        //second array is now over
	        while((i+j)<=a.length-1){
	            a[i+j]=b[i];
	             i++;
	             time++;
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
