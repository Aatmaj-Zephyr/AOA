public class Main {
    public static void main(String args[]){
        char [] str1= {'a','b','c','d','e','d'};
        char [] str2 = {'a','b','c','e','d'};
        int arr[][]=new int[str1.length+1][str2.length+1];
        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str1[i]==str2[j]){
                    arr[i+1][j+1]=arr[i][j]+1;
                }
                else{
                    if(arr[i][j+1]<=arr[i+1][j])
                    {arr[i+1][j+1]=arr[i+1][j];}
                
                if(arr[i][j+1]>arr[i+1][j])
                    {arr[i+1][j+1]=arr[i][j+1];}
                }
            }
        }
        int p=0;
        int q=0;
        
        while(0==0){
            if(p>=str1.length-1&q>=str2.length-1){
                if(str1[p]==str2[q]){
                  System.out.println(str1[p]);
                }
                break;
            }
           if(p>=str1.length-1){
               p--;
               q++;
               
               }
               if(q>=str2.length-1){
               q--;
               p++;
            
                 }
             //   System.out.println(str1[p]+","+str2[q]+","+arr[p+1][q+1]+","+p+","+q);
                if(str1[p]==str2[q]){
                  System.out.println(str1[p]);
                  p++;
                  q++;
                //  System.out.print(","+p+","+q+"\n");
                }
                else{
                    if(arr[p][q+1]<=arr[p+1][q])
                    {
                     //  System.out.println(arr[p+1][q]);
                        p++;
                    }
                
                else if(arr[p][q+1]>arr[p+1][q])
                    {
                      //  System.out.println(arr[p][q+1]);
                        q++;
                    }
                }
                
            
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               // System.out.print(arr[i][j]);
            }
         //   System.out.println();
        }
    }
    
}
