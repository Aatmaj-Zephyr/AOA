import java.util.*;
public class Main {
    public static void main(String args[]){
        char [] str1= {'d','b','c','d','e','d'};
        char [] str2 = {'d','b','c','e','d'};
        ArrayList<Character> output= new ArrayList();
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
        int p=str1.length-1;
        int q=str2.length-1;
        
        while(p>=0&q>=0){
           
             //   System.out.println(str1[p]+","+str2[q]+","+arr[p+1][q+1]+","+p+","+q);
                if(str1[p]==str2[q]){
                //  System.out.println(str1[p]);
                  output.add(str1[p]);
                  p--;
                  q--;
                //  System.out.print(","+p+","+q+"\n");
                }
                else{
                    if(arr[p][q-1]<=arr[p-1][q])
                    {
                     //  System.out.println(arr[p+1][q]);
                        p--;
                    }
                
                else if(arr[p][q-1]>arr[p-1][q])
                    {
                      //  System.out.println(arr[p][q+1]);
                       q--;
                    }
                }
                
            
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.print("common string is " );
         for(int j=1;j<=output.size();j++){
                System.out.print(output.get(output.size()-j));
            }
    }
    
}
