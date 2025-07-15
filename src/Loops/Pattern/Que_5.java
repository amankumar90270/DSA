//********** Print the given Pattern **********
//A B C D
//A B C D
//A B C D
package Loops.Pattern;

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
