//********** Write a program to print the second Maximum element in  array  **********

package Arrays;

import java.util.Scanner;

public class Que_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();

        //input of array
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        //first Maximum Element in Array
        int first_max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]> first_max){
               first_max = arr[i];
            }
        }
        System.out.println("First Maximum Element: " + first_max);

        //first Maximum Element in Array
        int second_max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>second_max && arr[i]!=   first_max){
                second_max = arr[i];
            }
        }

        System.out.println("Second Maximum Element: " + second_max);
    }
}
