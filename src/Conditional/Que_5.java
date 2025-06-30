package Conditional;
//Print profit / loss if SP and CP are given
import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost ");
        int cost = sc.nextInt();
        System.out.println("Enter Selling Price");
        int selling_price = sc.nextInt();
        int profit = selling_price-cost;
        int loss = cost-selling_price;

        if (cost>selling_price){
            System.out.println("You are in loss of Rs. " + loss);
        }
        else if(cost==selling_price){
            System.out.println("NO Profit No Loss");
        }
        else{
            System.out.println("Your are in profit of Rs. " + profit);
        }
    }
}
