//********** Print the given Pattern  ***********
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
package Loops.Pattern;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
