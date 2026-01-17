//********** Write a program to move all zero in end using Bubble sort  **********

package Arrays;

import java.util.Scanner;

public class Que_21 {
    public static void print(int arr[]){
        for (int ele: arr){
            System.out.print(ele + "");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();

        System.out.println("Enter elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Provided Array");
        print(arr);

        System.out.println("Sorted Array with Zero in end");
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if(arr[j]==0){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= swap;
                }
            }
        }
                print(arr);
    }
}
