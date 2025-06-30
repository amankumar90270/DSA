//********** Print Hello World 'n' times. Take 'n' as input from use**********


package Loops.Number_Print;
import java.util.Scanner;

public  class Que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last n number");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Hello World");
        }
    }

}



















