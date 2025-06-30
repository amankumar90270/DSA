//********** Print table of 19**********
package Loops.Number_Print;
import  java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number whose table you want");
        int n = sc.nextInt();

        for (int i = 1; i<=10; i++){
            int table  = n*i;
            System.out.println(n + " x " + i + " = " + table);
        }
    }
}

