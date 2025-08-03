package Arrays;

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input of Array
        System.out.println("Enter size of Array");
        int n = sc.nextInt();

        //output of Array
        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

        int max =0;
        //Maximum value of Element
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=arr.length){
                System.out.println(arr[i]);
            }
        }
    }
}
