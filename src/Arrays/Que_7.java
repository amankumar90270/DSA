//********** Count the Number of elements in given array greater than a giver number x  **********

package Arrays;

import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //input of Array
        System.out.println("Enter Array Size");
        int n = sc.nextInt();

        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the element that you want to compare that other element");
        int element = sc.nextInt();

        int count =0;
         for (int i =0; i<n; i++){
             if (arr[i]>element){
                 count++;
             }
         }
        System.out.println(count+ " numbers are greater than " + element);
    }
}
