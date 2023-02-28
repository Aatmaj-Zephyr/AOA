import java.util.*;
public class main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] adjustancy={ { 1000, 4, 1000, 1000, 1000, 1000, 1000, 8, 1000 },
        { 4, 1000, 8, 1000, 1000, 1000, 1000, 11, 1000 },
        { 1000, 8, 1000, 7, 1000, 4, 1000, 1000, 2 },
        { 1000, 1000, 7, 1000, 9, 14, 1000, 1000, 1000 },
        { 1000, 1000, 1000, 9, 1000, 11000, 1000, 1000, 1000 },
        { 1000, 1000, 4, 14, 10, 1000, 2, 1000, 1000 },
        { 1000, 1000, 1000, 1000, 1000, 2, 1000, 1, 6 },
        { 8, 11, 1000, 1000, 1000, 1000, 1, 1000, 7 },
        { 1000, 1000, 2, 1000, 1000, 1000, 6, 7, 1000 } };

		int[] distance= new int[adjustancy[0].length];
			for(int i=0;i<=distance.length-1;i++){
		    distance[i]=1000;//initialize to Infinity
		}
		ArrayList<Integer> covered= new ArrayList<Integer>();
		path(0,0,adjustancy,distance,covered);
		for(int i=0;i<=distance.length-1;i++){
		    System.out.print(distance[i]+",");
		}
	}
	public static void path(int initialCost, int nodeId,int[][] adjustancy,int [] distance,ArrayList<Integer> covered){
	      covered.add(nodeId);
	         System.out.println("visited="+nodeId);
	  
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
	   
	    if(covered.size()==distance.length){
	           System.out.println("all nodes covered");
	        return;
	    }
        int max=-1;
        for(int i=0;i<distance.length;i++){
            if(i==nodeId){
                continue;
            }
            if(!covered.contains(i)){
                if(max==-1){
                    max=i;
                }
                else
            
	         if(distance[i]<distance[max] ){
                
	            max=i;
	             System.out.println("max is  "+max);
	           
	        }
        }
	    }
	  
	    path(distance[max],max,adjustancy,distance,covered);
	 return;   
	}
}
