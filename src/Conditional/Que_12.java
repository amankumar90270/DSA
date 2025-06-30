//********** Write a Program to determine the yougenst of three **********
package Conditional;

import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of Ram");
        int ram = sc.nextInt();
        System.out.println("Enter Age of Shyam");
        int shyam = sc.nextInt();
        System.out.println("Enter Age of Ajay");
        int ajay = sc.nextInt();

        if (ram > shyam && ram > ajay) {
            System.out.println("Ram is Youngest");
        } else if (shyam > ram && shyam > ajay) {
            System.out.println("Shyam is Yougest");
        } else {
            System.out.println("Ajay is Youngest");

        }
    }
}
