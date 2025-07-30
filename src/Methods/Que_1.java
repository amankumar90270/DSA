//********** Take 3 Numbers as Input and print greatest of them **********
package Methods;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        double num1 = sc.nextDouble();
        System.out.println("Enter Number 2");
        double num2 = sc.nextDouble();
        System.out.println("Enter Number 3");
        double num3 = sc.nextDouble();
        System.out.println("Enter Number 4");
        double num4 = sc.nextDouble();

        System.out.println(Math.min(Math.min(num1,num2), Math.min(num3,num4)));
    }
}
