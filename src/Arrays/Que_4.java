//********** find the given element in array  **********
package Arrays;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input of array
        System.out.println("Enter Array Size");
        int n = sc.nextInt();



        //output of array
        int []arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

        //Input of Element to be found
        System.out.println("Enter Element to be find");
        int element = sc.nextInt();

        boolean flag = false; //not found
        //Check element in Array
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == element) {
                flag = true; //found
                break;
            }

        }

        if(flag ==false){
            System.out.println("Not found ");
        }else{
            System.out.println("Found");
        }


    }
}
