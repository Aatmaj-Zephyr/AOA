import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length-1;i++){
           arr[i]= sc.nextInt();
        }
        insetionSort(arr);
        for(int i=0;i<arr.length-1;i++){
          System.out.println(arr[i]);
        }
	}
public static void	insetionSort(int[] arr){
	    for(int i=1;i<arr.length;i++){
	        int key=arr[i];
	        int j=i-1;
	        while(arr[j]<key){
	            //swap
	            int temp=arr[j+1];
	            arr[j+1]=arr[j];
	            arr[j]=temp;
	            
	            j--;
	            if(j<0){
	                break;
	            }
	        }
	    }
	}
}
