import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int purchasePrice;
        double totalPrice;
        double SHIPPING_PCT=.02;
        double shippingCost;

        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Price of Item $: ");
            purchasePrice = scan.nextInt();


            if (purchasePrice < 100) ;
                { shippingCost = (purchasePrice * SHIPPING_PCT);
                  totalPrice = shippingCost + purchasePrice;   }


            if (purchasePrice > 100)  ;
                { totalPrice = purchasePrice;
                 shippingCost = 0;    }


        System.out.println("The total price of your item is: " + totalPrice);
        System.out.println("and the shipping cost is " + shippingCost);


        }
        }
    }
