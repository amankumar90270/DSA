//********** Print the given Pattern **********
//1111
//2222
//3333
//4444

package Loops.Pattern;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        for (int i =1; i<=num; i++){
            for ( int j=1; j<=num; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
