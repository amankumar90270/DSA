//********** Print the given Pattern  ***********
//        A
//      A B C
//    A B C D E
//  A B C D E F G
//A B C D E F G H I
package Loops.Pattern;

import java.util.Scanner;

public class Que_28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){ //rows
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=2*i-1; j++){
                System.out.print((char)+(j+64)+" ");
            }
            System.out.println();
        }
    }
}
