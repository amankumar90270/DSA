//********** Print the given Pattern  **********
//* * * *
//* * * *
//* * * *
//* * * *
package Loops.Pattern;

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int num = sc.nextInt();

        for (int i =1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
