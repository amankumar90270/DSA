//********** Print the given Pattern ***********
//        *
//      * *
//    * * *
//  * * * *
//* * * * *

package Loops.Pattern;

import java.util.Scanner;

public class Que_22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

//< - - - - - - - - - --Method 1-- - - - - - - - - - >
    for (int i =1; i<=n; i++){ //Spaces
        for (int j =1; j<=n-i; j++){
            System.out.print("  ");
        }
        for ( int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }


//< - - - - - - - - - --Method 2-- - - - - - - - - - >
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n; j++){
//                if(i+j<=n) System.out.print("  ");
//                else System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
