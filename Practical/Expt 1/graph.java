import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    
        List<List<String>> records = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
   String line = br.readLine();
        String[] data = line.split(",");
    

        for(int len=0;len<1000;len++)
       { 
        int arr[]=new int[len+1];
        for(int i=0;i<=len;i++){
            arr[i]=Integer.parseInt(data[i]);
        }
        
        long TS1 = System.nanoTime();
        selectionSort(arr);
        long TS2 = System.nanoTime();
       
        System.out.println(TS2-TS1);
}
	}
	    catch(Exception ex){
	        ex.printStackTrace();
	    }
	}
public static int[]	selectionSort(int[] arr){
     
	    for(int i=0;i<arr.length-1;i++){
	        for(int j=i+1;j<arr.length;j++)
	       { 
	           if(arr[i]<arr[j]) {
	           //swap
	            int temp=arr[j];
	            arr[j]=arr[i];
	            arr[i]=temp;
	           }
	           
	       }
	    }
	   //  for(int i=0;i<arr.length;i++){
      //    System.out.print(arr[i]+",");
      // }
	return arr;
    
}
public static int[]		insetionSort(int[] arr1){
	    for(int i=1;i<arr1.length;i++){
	        int key=arr1[i];
	        int j=i-1;
	        while(arr1[j]<key){
	            //swap
	            int temp=arr1[j+1];
	            arr1[j+1]=arr1[j];
	            arr1[j]=temp;
	            
	            j--;
	            if(j<0){
	                break;
	            }
	        }
	    }
	 //   for(int i=0;i<arr1.length;i++){
     //     System.out.print(arr1[i]+",");
     //   }
	    return arr1;

	}
}
