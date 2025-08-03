//********** Calculate the sum of giver Array  **********
package Arrays;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");

        int n = sc.nextInt();

        int []arr  = new int[n];

        System.out.println("Enter Array Element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.println();
        }

        int sum = 0;
        for (int i=0; i<n; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of array is: " + sum);
    }
}
