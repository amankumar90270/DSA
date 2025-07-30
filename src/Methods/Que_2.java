//********** Combination and Permutations **********

package Methods;

import java.util.Scanner;

public class Que_2 {

    public  static int fact(int x){
        int xFact = 1;
        for(int i=1;i<=x;i++){
            xFact *=i;
        }
        return xFact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int nFact = fact(n);
        int rFact = fact(r);
        int nmrFact = fact(n-r);


        int ncr = nFact/(rFact*nmrFact);
        System.out.println(ncr);

    }
}
