//********** Display this arithmetic progression  =1,3,5,7,9.. up to 'n'**********
package Loops.Number_Print;

import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last n number");
        int last_number = sc.nextInt();

        int a =1, d=2;
        for (int i = 1; i <= last_number; i++) {
            System.out.println(a);
            a=a+d;
        }
    }
}
