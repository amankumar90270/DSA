//********** Write a program to search elements in array  **********

package Arrays;

import java.util.Scanner;

public class Que_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        //input of Array
        System.out.println("Enter Elements of Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Enter number that you have to search
        System.out.println("Enter Element that you have to search");
        int search = sc.nextInt();


        //Search Element in Array
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (search == arr[i]) {
                found = true;
                break;
            }
        }
                if (found) {
                    System.out.println("Exist");
                } else {
                    System.out.println("Not Exist");
                }
    }
}