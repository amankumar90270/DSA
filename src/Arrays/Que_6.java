//********** find the 2nd largest element in given array  **********

package Arrays;

import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input of Array
        System.out.println("Enter Array Size");
        int n = sc.nextInt();

        //output of Array
        System.out.println("Enter Array Elements");
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //find largest element
        int max = Integer.MIN_VALUE;
        for (int i =0; i<arr.length; i++){
            if (arr[i]>max)
                max= arr[i];
        }
        System.out.println("Max Element is:" + max);


        //find second-largest element
        int second_max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length; i++){
            if (arr[i]>second_max && arr[i]!=max){
                second_max= arr[i];
            }
        }
        System.out.println("Second Max Element is:" + second_max);
    }
}
