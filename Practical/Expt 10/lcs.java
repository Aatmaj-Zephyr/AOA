public class lcs {
    public static void main(String args[]){
        char [] str1= {'a','b','c','d','d','d'};
        char [] str2 = {'a','d','c'};
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
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
