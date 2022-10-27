import java.util.Scanner;
public class Reality {
    public static void main(String[] args) {
        double[] prices = new double[]{ 1.00, 2.00, 3.00, 4.00, 5.00 };
        String[] stock = new String[]{ "Pen", "Baseball", "Stress Ball", "Small Watch", "USB Drive" };
        String shopName = "Small Things";

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How much money do you have? ");
        double money = input.nextDouble();

        Shop shop = new Shop(prices, stock, shopName);
        Customer buyer = new Customer(name, money);

        buyer.exists();
        int walkIn = 1;
        while (walkIn == 1) {
            walkIn = buyer.walkIn(shop, input);
            System.out.println(buyer);
        }
        input.close();
    }
}
