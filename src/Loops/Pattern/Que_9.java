//********** Print the given Pattern 1  ***********
//1
//A B
//1 2 3
//A B C D
//1 2 3 4 5
package Loops.Pattern;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
               if (i%2!=0){
                   System.out.print(j+" ");
               } else{
                   System.out.printf((char)(j+64)+" ");
               }
            }
            System.out.println( );
        }

    }
}
