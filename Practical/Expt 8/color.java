/******************************************************************************
Need to put number of colors in colorsnum feild;
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [][] adjustancyMatrix={{0, 1, 1, 1},
                         {1, 0, 1, 0},
                         {1, 1, 0, 1},
                         {1, 0, 1, 0}};
        int colorsnum=2;
		int [] color = new int [4];
		if(color(0,adjustancyMatrix,color,colorsnum)==false){
		 System.out.println("In sufficiant number of colors")   ;
		}
		

	}
	static boolean color(int node, int [][] adjustancyMatrix,int[]color, int colorsnum){
	    for(int i=1;i<=colorsnum;i++){ //iterate over colors
	    if(checkAdjusantVerticesColor(i,node,adjustancyMatrix,color)==true){
	        //color not used, set color
	        color[node]=i;
	        System.out.println("Node "+node+" is colored "+i);
	        

	    
	    if(AllNodesColored(color)==true){
	        System.out.println("All nodes exausted");

	        return true;
	        
	    }
	    else{
	        //recur
	        if(color(node+1,adjustancyMatrix,color,colorsnum)==true){//adjusant node
	            return true;
	        }
	        else{
	            //forward tracking failed, so try next color
	           System.out.println("Went wrong!");

	            continue;
	        }
	    }
	    }
	    }
	    //all color exausted.
	    //backtrack
	    System.out.println("All colors exausted");
	    return false;
	    
	}
	static boolean checkAdjusantVerticesColor(int currrentColor,int node, int [][] adjustancyMatrix,int[]color){
	    for(int i=0;i<adjustancyMatrix[0].length;i++){ //iterate nodes
	    
	        if(color[i]==currrentColor & adjustancyMatrix[node][i]==1){
	            return false;
	        }
	    }
	    return true;
	}
	static boolean AllNodesColored(int [] color){
	    for (int i=0;i<color.length;i++){ //iterate nodes
	         if(color[i]==0){

	            return false;
	        }
	    }
	    return true;
	}
}
