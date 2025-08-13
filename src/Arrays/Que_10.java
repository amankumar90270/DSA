//********** Write a program to reverse the array without using extra array  **********

package Arrays;

import java.util.Scanner;

public class Que_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        System.out.println("Enter Elements of Array");

        //Origin Array
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }


        for (int i=0;i<n;i++){
            System.out.println("Original Array:" + arr[i]);
        }
    }
}
