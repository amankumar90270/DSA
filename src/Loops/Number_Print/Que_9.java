//********** Display this Geometric Progression -  1,2,4,8,16,32........ up to 'n' terms**********
package Loops.Number_Print;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int last_number = sc.nextInt();

        int a = 1, d = 2;
        for (int i = 1; i <= last_number; i++) {

            System.out.println(a);
            a *= d;
        }
    }
}
