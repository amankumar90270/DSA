//********** Print the given Pattern ***********
//      *
//    * * *
//  * * * * *
//* * * * * * *
//  * * * * *
//    * * *
//      *
package Loops.Pattern;

import java.util.Scanner;

public class Que_30 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n= sc.nextInt();

    int nsp =n-1, nst=1;
    for (int i=1; i<=n; i++){//rows
        for (int j=1; j<=nsp; j++){ //space
            System.out.print("  ");
        }
        for (int j=1; j<=nst; j++){ //stars
            System.out.print("* ");
        }
        nsp--;
        nst+=2;
        System.out.println();
    }
        nsp =1;
        nst=2*n-3;
        for (int i=1; i<=n-1; i++){//rows
            for (int j=1; j<=nsp; j++){ //space
                System.out.print("  ");
            }
            for (int j=1; j<=nst; j++){ //stars
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }


    }
}
