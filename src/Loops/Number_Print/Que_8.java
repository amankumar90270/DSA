//********** Display this arithmetic progression -  4,7,10,13,16 .. up to 'n' terms**********
package Loops.Number_Print;

import java.util.Scanner;
public class Que_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Last Number");

        int a=4,d=3;
        int last_number = sc.nextInt();
        for (int i = 4; i<=last_number; i++){
            System.out.println(a);
            a+=d;
        }
    }
}
