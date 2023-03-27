import java.util.*;
public class Main
{
	public static void main(String[] args) {
		double [] profit ={1,2,4,3,5};
		double [] weight = {2,1,4,5,7};
		double capacity=7;
		double[][] ratio = new double[5][5];
		for(int i=profit.length-1;i>=0;i--){

		   ratio[i][0]=profit[i]/weight[i];
		   ratio[i][1]=weight[i];
		}
		
		//sort ArrayList
		
		
		ratio=insetionSort(ratio);
		
		
		
		int i=0;
		while(capacity>0){
		   
		    capacity=capacity-ratio[i][1];
		    if(capacity>0){
		    System.out.println("chosen object with weight "+ratio[i][1]);
		    
		    }
		  i++;
		    if(i==5){//on capacity less than objects
		        break;
		    }
		}
	}
	public static double[][]		insetionSort(double[][] arr1){
	    for(int i=1;i<arr1.length;i++){
	        double key=arr1[i][0];
	        int j=i-1;
	        while(arr1[j][0]<key){
	            //swap ratio
	            double temp=arr1[j+1][1];
	            arr1[j+1][1]=arr1[j][1];
	            arr1[j][1]=temp;
	            //swap weight
	             temp=arr1[j+1][0];
	            arr1[j+1][0]=arr1[j][0];
	            arr1[j][0]=temp;
	            
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
