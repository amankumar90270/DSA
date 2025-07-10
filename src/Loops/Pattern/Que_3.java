//********** Print the given Pattern **********
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5

package Loops.Pattern;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        for (int i= 1; i<=num; i++){
            for (int j=1; j<=num; j++){

            System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}