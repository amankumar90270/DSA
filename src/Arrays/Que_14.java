package Arrays;

import java.util.Scanner;

public class Que_14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        //Input of Array
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Output of Array
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
