/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][]a={{0,4,1},{1,0,5},{1,2,0}};
		int[] nodeList ={1,1,1};
		obj my=TSP(a,nodeList,0);
		System.out.println("Path is "+my.node+" distance is "+my.value);
		
		
	}
	public static obj TSP(int[][]a, int[] nodeList,int startNode){
	    
	    //terminsting condition
	    int j=0;
	    for(int i=0;i<nodeList.length;i++){
	        j=j+nodeList[i];
	    }
	    if(j==0){
	        return new obj(a[startNode][0],"");
	    }
	    
	    
	    int min=10000;//Infinity
	    String minNode=new String();;
	    int value=0;
	    for(int node=0;node<nodeList.length;node++){ //selected node
	    
	    if(nodeList[node]==0){
	        continue;//already covered
	    }
	        nodeList[node]=0;
	        obj rcr = TSP(a,nodeList,node);
	        value = a[startNode][node]+rcr.value;
	        
	        nodeList[node]=1;
	        if(value<min){
	           min = value;
	           minNode=node+""+rcr.node;
	           //System.out.println(value+" for node "+node);
	        }
	    }
	    return new obj(min,minNode);
	}
}
