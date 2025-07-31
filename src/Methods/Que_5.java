//********** Swap 2 numbers without 3rd Variable **********
package Methods;

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a  = sc.nextInt();
        System.out.println("Enter second Number");
        int b  = sc.nextInt();


        a = b-a;
        b= b-a;
        a = a+b;

        System.out.println("First Number = "+a);
        System.out.println("Second Number = "+b);
    }
}
