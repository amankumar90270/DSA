//********** Write a program of Bubble sort  **********

package Arrays;

import java.util.Scanner;

public class Bubble_sort {
    public static void  print(int [] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int n = sc.nextInt();

        //input of array
        System.out.println("Enter elements of Array");
        int []arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //sorted array
        System.out.println("Provided Array");
        print(arr);


        //Sorted Array
        System.out.println("Sorted Array");

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        print(arr);
    }
}
