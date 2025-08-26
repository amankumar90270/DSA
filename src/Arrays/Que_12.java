//********** Write a program to Print sum of element of array  **********

package Arrays;

import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();

        //input
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//       Sum of Elements
        int sum = 0;
        for (int i =0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum Of Elements are:" + sum);


    }
}
