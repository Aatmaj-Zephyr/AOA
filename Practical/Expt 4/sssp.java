import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] adjustancy={{0,1,2,8},{2,0,1,1},{3,5,0,1000},{2,1000,1000,1000}};
		int[] distance= new int[adjustancy[0].length];
			for(int i=0;i<=distance.length-1;i++){
		    distance[i]=1000;//initialize to Infinity
		}
		ArrayList<Integer> covered= new ArrayList<Integer>();
		path(0,2,adjustancy,distance,covered);
		for(int i=0;i<=distance.length-1;i++){
		    System.out.print(distance[i]+",");
		}
	}
	public static void path(int initialCost, int nodeId,int[][] adjustancy,int [] distance,ArrayList<Integer> covered){
	      covered.add(nodeId);
	         System.out.println("visited="+nodeId);
	    int max=0;
	    int firstUpdate=-1;//to check if the array updates max at least once or not. Else it means all is covered.
	    for(int i=0;i<adjustancy[nodeId].length;i++){
	        if(i==nodeId){
	            continue; // dont check for same element
	        }
	        int cost=initialCost+adjustancy[nodeId][i];
	        System.out.println("cost="+cost);
	        if(distance[i]>cost){
	            distance[i]=cost;
	            System.out.println("updated "+cost);
	        }
	       
	        
	    }
	    for(int i=0;i<adjustancy[nodeId].length;i++){
	         if(adjustancy[nodeId][i]>adjustancy[nodeId][max] ){
	            max=i;
	             System.out.println("max is  "+max);
	           
	        }
	    }
	    if(covered.size()==distance.length){
	           System.out.println("all nodes covered");
	        return;
	    }
	  
	    path(distance[max],max,adjustancy,distance,covered);
	 return;   
	}
}
