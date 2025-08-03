//********** Take Input of Array  **********

package Arrays;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int []arr  = new int[n];

        //Input
        System.out.println("Enter Array Elements");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Output
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+"");
        }
    }
}
