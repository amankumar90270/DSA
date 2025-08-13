//********** find the doublet in the Array whose sum is equal to the given value x. (Two Sum)  **********

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();

        System.out.println("Enter Elements of Array");
        int []arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number which you want to test");
        int target = sc.nextInt();

        int []ans = new int[2];
        boolean found = false;

        for (int i =0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]+ arr[j]== target){
                    ans[0] = i;
                    ans[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

      if(found){
          System.out.println("Indices: " + Arrays.toString(ans));
          System.out.println("Values: " + arr[ans[0]] + " + " + arr[ans[1]]+ "=" + target);
      }else {
          System.out.println("No value found");
      }



    }
}
