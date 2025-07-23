//********** Print the given Pattern ***********
//        1
//      1 2 3
//    1 2 3 4 5
//  1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8 9
package Loops.Pattern;

import java.util.Scanner;

public class Que_27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();


//Method 1
//        for (int i=1; i<=n; i++){ //rows
//            for (int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//
//            for (int j=1; j<=2*i-1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//Method 2
        int  /*(number of spaces*/nsp  =n-1, /*(Number of Stars*/nst= 1;
        for (int i=1; i<=n; i++){ //lines
            for (int j=1; j<=nsp; j++) { //spaces
                System.out.print("  ");
            }
            for (int j=1; j<=nst; j++) { //spaces
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
        System.out.println();
        }


    }
}
