//********** Display this arithmetic progression -  4,7,10,13,16 .. up to 'n' terms**********
package Loops.Number_Print;

import java.util.Scanner;
public class Que_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int last_number = sc.nextInt();
        for (int i = 4; i<=last_number; i+=3){
            System.out.println(i);
        }
    }
}
