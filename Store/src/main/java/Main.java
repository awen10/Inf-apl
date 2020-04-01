
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Store store = new Store("MiniMarket");
        Stock stock = new Stock();
        Receipt rec = new Receipt();
        store.AddNewAdmin("Admin", "0786541234", "CaleaBucuresti");
        store.AddNewCashRegister(0);
        store.AddNewSeller("Seller", "0771654039", "PetreIspirescu");

        store.admin.get(0).AddProductsToStock("Paine", "feliata", (float) 1.8, 30, stock);
        store.admin.get(0).AddProductsToStock("Faina", "alba", (float) 3.2, 52, stock);
        store.admin.get(0).AddProductsToStock("Ulei", "masline", (float) 8.3, 12, stock);
        int i = -1;
        float total;
        System.out.println("What do you want?");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println("What quantity?");
        Scanner j = new Scanner(System.in);
        int quant = j.nextInt();

        if (store.seller.get(0).CheckProductStock(name, stock) - quant >= 0) {
            System.out.println("we have the desired quantity in stock");
        } else {
            while (store.seller.get(0).CheckProductStock(name, stock) - quant < 0) {
                System.out.println("we don't have the desired quantity in stock,give another quantity");
                j = new Scanner(System.in);
                quant = j.nextInt();
            }
        }
        store.seller.get(0).Sell(name, store.CR.get(0), stock, quant);
        store.CR.get(0).RegisterNewProduct(name, quant, stock);
        rec.Add(name, rec.GetPrice(name, stock), quant);

        while (i != 0) {
            System.out.println("Anything else?");
            Scanner l = new Scanner(System.in);
            i = l.nextInt();
            switch (i) {
                case 1:
                    System.out.println("YES");
                    System.out.println("What do you want?");
                    n = new Scanner(System.in);
                    name = n.nextLine();
                    System.out.println("What quantity?");
                    j = new Scanner(System.in);
                    quant = j.nextInt();
                    if (store.seller.get(0).CheckProductStock(name, stock) - quant > 0) {
                        System.out.println("we have the desired quantity in stock");
                    } else {
                        while (store.seller.get(0).CheckProductStock(name, stock) - quant > 0) {
                            System.out.println("we don't have the desired quantity in stock,give another quantity");
                            j = new Scanner(System.in);
                            quant = j.nextInt();
                        }
                    }
                    store.seller.get(0).Sell(name, store.CR.get(0), stock, quant);
                    store.CR.get(0).RegisterNewProduct(name, quant, stock);
                    rec.Add(name, rec.GetPrice(name, stock), quant);

                    break;
                case 0:
                    System.out.println("NO");
                    break;
                default:
                    System.out.println("Enter another value");
                    i = l.nextInt();
            }
        }
        System.out.print("The total is: ");
        total = rec.GetTotal();
        System.out.println(total);
    }

}
