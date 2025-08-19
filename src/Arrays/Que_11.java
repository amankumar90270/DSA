//********** print Negative Elements only  **********

package Arrays;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        //input
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            if (arr[i]<=0){
                System.out.println("Negative Numbers:" + arr[i]);
        }

    }
}
