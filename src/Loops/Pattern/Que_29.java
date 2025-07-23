//********** Print the given Pattern ***********
// * * * * *
//  * * * *
//    * * *
//      * *
//        *

package Loops.Pattern;

import java.util.Scanner;

public class Que_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();

        int nsp=0, nst=n;
        for (int i=1; i<=n; i++){ //lines
            for (int j=1; j<=nsp; j++){ //spaces
                System.out.print("  ");
            }

            for (int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
