package Methods;

import java.util.Scanner;

public class Que_3 {

    public static  int fact(int x){
        int Xfact =1;
        for(int i=1;i<=x;i++){
            Xfact=Xfact*i;
        }
        return Xfact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int r = sc.nextInt();

        int nFact = fact(n);




        int nmrFact = fact(n-r);

        int npr = nFact/nmrFact;
        System.out.println(npr);
    }
}
