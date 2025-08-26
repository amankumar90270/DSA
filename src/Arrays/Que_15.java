//********** Write a program to Multiply odd indexed elements by 2 and add 10 to even indexed elements  **********

package Arrays;

import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        //input of Array
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //output
        System.out.println("Modified Array");
        for (int i=0; i<n; i++){
           if(i%2 ==0){
               System.out.println(arr[i]+10);
           }else{
               System.out.println(arr[i]*2);
           }
        }
    }
}
