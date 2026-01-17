package Arrays;

import java.util.Scanner;

public class Selection_sort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of An Array ");
        int n = sc.nextInt();

        //input of array
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Given Array
        System.out.println("Given Array");
        print(arr);

        //Sorted Array
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;

            for (int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
            }
        }

        print(arr);

    }
}
