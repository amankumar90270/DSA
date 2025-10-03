//********** Write a program to reverse elements in an array  **********

package Arrays;

import java.util.Scanner;

public class Que_19 {
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

        //Reverse of Array
        int i=0, j=n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       for (int ele: arr){
           System.out.print(ele+" ");
       }
    }
}
