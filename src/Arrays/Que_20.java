//********** Write a program of Sorted Array in descending order using Bubble sort  **********

package Arrays;
import java.util.Scanner;

public class Que_20 {
    public static  void print(int arr[]){
        for (int ele: arr){
            System.out.print(ele+"");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        //input of Array
        System.out.println("Enter Elements of Array");
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Provided Array");
        print(arr);

        System.out.println("Sorted Array in descending Array");
        for (int i=0; i<n-1; i++){
            int swap =0;
            for (int j=0; j<n-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap ==0) break;
        }
            print(arr);

    }
}
