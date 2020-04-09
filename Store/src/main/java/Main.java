
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String store_name = "MiniMarket";
        Store store = new Store(store_name);
        Stock stock = new Stock();
        Receipt rec = new Receipt();
        store.AddNewAdmin("Admin", "0786541234", "CaleaBucuresti");
        store.AddNewCashRegister(0);
        store.AddNewSeller("Seller", "0771654039", "PetreIspirescu");

        
        int i = -1;
        float total;
        System.out.println("What do you want?");
        Scanner f = new Scanner(System.in);
        System.out.println("What quantity?");
        int j = -1;
        int k = -1;
        String name;
        String description;
        float price;
        int quant;

        while (i != 0) {
            System.out.println("0.Exit");
            System.out.println("1.Use as Administrator");
            System.out.println("2.Use as Seller");
            i = n.nextInt();
            switch (i) {
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    System.out.println("Use as Administrator");
                    while (j != 0){
                        System.out.println("0.Back");
                        System.out.println("1.Stock");
                        System.out.println("2.Cash register");
                        j = n.nextInt();
                        switch (j) {
                            case 0:
                                System.out.println("Back");
                                break;
                            case 1:
                                System.out.println("Stock");
                                k=-1;
                                while (k != 0) {
                                    System.out.println("0.Back");
                                    System.out.println("1.Add product");
                                    System.out.println("2.Remove product");
                                    System.out.println("3.Chech stock");
                                    k = n.nextInt();
                                    switch (k) {
                                        case 0:
                                            System.out.println("Back");
                                            break;
                                        case 1:
                                            System.out.println("Add product");
                                            name = n.nextLine();
                                            description = n.nextLine();
                                            price = n.nextFloat();
                                            quant = n.nextInt();
                                            store.admin.get(0).AddProductsToStock(name, description, price, quant, stock);
                                            break;
                                        case 2:
                                            System.out.println("Remove product");
                                            name = n.nextLine();
                                            store.admin.get(0).RemoveProductsFromStock(name, stock);
                                            break;
                                        case 3:
                                            for (int p = 0; p < stock.stockitems.size(); p++) {
                                                System.out.println(stock.stockitems.get(p).GetNameItem() + stock.stockitems.get(p).GetPrice() + stock.stockitems.get(p).GetQuantity());
                                            }
                                            break;
                                        default:
                                            System.out.println("Enter another value");
                                            i = n.nextInt();
                                    }
                                }
                            case 2:
                                k=-1;
                                System.out.println("Cash Register");
                                while (k != 0) {
                                    System.out.println("0.Back");
                                    System.out.println("1.Add Cash register");
                                    System.out.println("2.Remove Cash register");
                                    System.out.println("3.View cash register");
                                    k = n.nextInt();
                                    switch (k) {
                                        case 0:
                                            System.out.println("Back");
                                            break;
                                        case 1:
                                            store.AddNewCashRegister(0);
                                            break;
                                        case 2:
                                            store.RemoveCashRegister();
                                            break;
                                        case 3:
                                            for (int p = 0; p < store.CR.size(); p++) {
                                                System.out.println(store.CR.get(p).GetCrNo());
                                            }
                                            break;
                                        default:
                                            System.out.println("Enter another value");
                                            i = n.nextInt();
                                    }
                                }
                            default:
                                System.out.println("Enter another value");
                                i = n.nextInt();
                        }
                    }
                case 2:
                    k=-1;
                    while (k != 0) {
                        System.out.println("0.Back");
                        System.out.println("1.Start sell");
                        System.out.println("2.Search product");
                        System.out.println("3.View stock");
                        k = n.nextInt();
                        switch (k) {
                            case 0:
                                System.out.println("Back");
                                break;
                            case 1:
                                k=-1;
                                System.out.println("Start sell");
                                while (k != 0) {
                                    System.out.println("Back");
                                    System.out.println("1.AddToSell");
                                    System.out.println("2.Remove product");
                                    System.out.println("3.Finalize sell");
                                    k = n.nextInt();
                                    switch (k) {
                                        case 0:
                                            System.out.println("Back");
                                            break;
                                        case 1:
                                            name = n.nextLine();
                                            quant = n.nextInt();
                                            store.seller.get(0).AddToSell(name, store.CR.get(0), stock, quant);
                                            break;
                                        case 2:
                                            name = n.nextLine();
                                            store.seller.get(0).ReturnProducts(name, rec);
                                            break;
                                        case 3:
                                            name = n.nextLine();
                                            quant = n.nextInt();
                                            store.seller.get(0).Sell(name, store.CR.get(0), stock, quant);
                                            break;
                                        default:
                                            System.out.println("Enter another value");
                                            i = n.nextInt();
                                    }
                                }
                            case 2:
                                name = n.nextLine();
                                store.seller.get(0).CheckProductStock(name, stock);
                                break;
                            case 3:
                                for (int p = 0; p < stock.stockitems.size(); p++) {
                                    System.out.println(stock.stockitems.get(p).GetName() + stock.stockitems.get(p).GetPrice() + stock.stockitems.get(p).GetQuantity());
                                }
                                break;
                            default:
                                System.out.println("Enter another value");
                                i = n.nextInt();
                        }

                    }
                default:
                    System.out.println("Enter another value");
                    i = n.nextInt();
            }
        }
        System.out.print("The total is: ");
        total = rec.GetTotal();
        System.out.println(total);
    }

}
