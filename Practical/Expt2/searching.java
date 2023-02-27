import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size=3000;
        int[] arr = new int[size];
        Random rd = new Random(); // creating Random object
        for(int i=0;i<size;i++){
            arr[i]=rd.nextInt(1000);
        }
        selectionSort(arr);
        for(int i=0;i<=arr.length-1;i++){
        long TS1 = System.nanoTime();
        iterativeBinarySearch(arr, 0, i, arr[i],0);

       
        long TS2 = System.nanoTime();
        System.out.println(TS2 - TS1);
        }

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
   
        return arr;

    }

    public static int recursiveBinarySearch(int[] arr, int start, int end, int key,int times) {
        int mid = (int) ((start + end) / 2);
        if (arr[mid] == key) {
           // System.out.println(times+1);
            return mid;
        } else if (start > end) {
            return -1;

        }
        if (key > arr[mid]) {
            return recursiveBinarySearch(arr, start, mid - 1, key,times+1);
        }
        if (key <= arr[mid]) {

            return recursiveBinarySearch(arr, mid + 1, end, key,times+1);
        }
        return 0;// never
    }

    public static int iterativeBinarySearch(int[] arr, int start, int end, int key,int times) {
        while (true) {
            int mid = (int) ((start + end) / 2);
            if (arr[mid] == key) {
               // System.out.println(times+1);
                return mid;
            }
            if (arr[mid] > key) {
                start = mid + 1;
            }
            if (arr[mid] < key) {
                end = mid - 1;
            }
            if (start > end) {
                return -1;

            }
            times++;
        }
    }
}
