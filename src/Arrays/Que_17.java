// Two Sum
package Arrays;

import java.util.Scanner;

public class Que_17 {
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

        //target value
        System.out.println("Enter Target Value");
        int target = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j =i+1; j<n; j++){
                if (arr[i] + arr[j] == target);
            }
        }
        System.out.println(target);
    }
}
