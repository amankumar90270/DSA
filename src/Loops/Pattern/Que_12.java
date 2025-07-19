//********** Print the given Pattern  ***********
//1 1 1 1 1
//2 2 2 2
//3 3 3
//4 4
//5

package Loops.Pattern;

import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
