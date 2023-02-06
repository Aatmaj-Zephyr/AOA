//To compare the time required to compute the recursive implementation of binary sort and iterative implementation of binary sort.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 809, 766, 227, 832, 71, 862, 496, 264, 771, 542, 84, 252, 508, 585, 824, 708, 620,
                849, 850, 23, 232, 635, 685, 3, 471, 149, 33, 745, 427, 399, 939, 498, 361, 148, 723, 942, 469, 15, 216,
                397, 165, 227, 250, 267, 117, 373, 719, 845, 231, 135, 821, 254, 89, 664, 691, 425, 100, 654, 482, 804,
                37, 371, 915, 751, 597, 673, 925, 328, 681, 94, 870, 741, 320, 872, 43, 798, 500, 649, 977, 313, 964,
                264, 844, 321, 116, 740, 826, 890, 131, 908, 554, 321, 329, 208, 894, 456, 885, 950, 518, 536, 687, 490,
                474, 877, 73, 753, 925, 297, 113, 295, 965, 17, 270, 532, 591, 779, 709, 666, 194, 986, 767, 399, 591,
                405, 270, 324, 250, 611, 835, 416, 890, 726, 402, 808, 603, 418, 644, 315, 180, 438, 66, 688, 603, 753,
                86, 552, 363, 420, 128, 614, 853, 912, 489, 144, 967, 397, 66, 511, 492, 453, 301, 709, 729, 669, 440,
                289, 365, 100, 659, 602, 659, 560, 615, 606, 689, 929, 971, 966, 939, 74, 796, 77, 628, 489, 154, 832,
                764, 575, 930, 6, 170, 400, 39, 872, 770, 650, 752, 379, 666, 115 };
        selectionSort(arr);
        long TS1 = System.nanoTime();
        System.out.println(recursiveBinarySearch(arr, 0, arr.length - 1, 1));

        long TS2 = System.nanoTime();

        System.out.println(iterativeBinarySearch(arr, 0, arr.length - 1, 1));
        long TS3 = System.nanoTime();
        System.out.println(TS2 - TS1);
        System.out.println(TS3 - TS2);

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
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+",");
        // }
        return arr;

    }

    public static int recursiveBinarySearch(int[] arr, int start, int end, int key) {
        int mid = (int) ((start + end) / 2);
        if (arr[mid] == key) {
            return mid;
        } else if (start > end) {
            return -1;

        }
        if (key > arr[mid]) {
            System.out.println(arr[mid] + " " + key);
            return recursiveBinarySearch(arr, start, mid - 1, key);
        }
        if (key <= arr[mid]) {

            return recursiveBinarySearch(arr, mid + 1, end, key);
        }
        return 0;// never
    }

    public static int iterativeBinarySearch(int[] arr, int start, int end, int key) {
        while (true) {
            int mid = (int) ((start + end) / 2);
            if (arr[mid] == key) {
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
        }
    }
}
