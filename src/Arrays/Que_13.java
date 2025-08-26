package Arrays;

import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr= {14,2,38,4,5};

        //Product of Elements
//        int product = 1;
//        for (int i=0; i<arr.length; i++){
//            product *= arr[i];
//        }
//        System.out.println(product);

        //First largest Element in Array
        int max = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]< max){
                max = arr[i];
            }
        }
        System.out.println(max);

        //Second Largest Element in Array
        int second_max = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] < second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }

}
