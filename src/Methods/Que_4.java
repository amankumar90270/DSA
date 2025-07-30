//********** Pascal Triangle **********
//            1
//          1   1
//        1   2   1
//      1   3   3   1
//    1   4   6   4   1
//  1   5   10   10   5   1

package Methods;

import java.util.Scanner;

public class Que_4 {

    public  static int fact(int x){
        int xFact =1;
        for (int i=1; i<=x; i++){
            xFact *=i;
        }
        return xFact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();


        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n-i; j++) { //spaces
                int icj = fact(i)/(fact(j) * fact(i-j));
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                int icj = fact(i)/(fact(j) * fact(i-j));
                System.out.print(icj +"   ");
            }
            System.out.println();
        }
    }
}
