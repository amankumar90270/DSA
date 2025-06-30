//********** Print the table of 'n'. Here 'n' is a integar which user will input**********

package Loops.Number_Print;
import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want to table");
        int num = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(num*i);
        }
    }
}
