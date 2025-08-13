//********** Write a program to reverse the array  **********

package Arrays;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        System.out.println("Enter Elements of Array");

        //Origin Array
        int []origin = new int[n];
        for (int i=0; i<n; i++){
          origin[i]= sc.nextInt();
        }

        //Reverse Array
        int[]reverse = new int[n];
        for (int i=0; i<n; i++){
            reverse[i] = origin[n-1-i];
        }

       for (int i=0;i<n;i++){
           System.out.println("Reversed Array:" + reverse[i]);
       }
    }
}
