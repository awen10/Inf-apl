
import java.util.ArrayList;
import java.util.*;

public class Stock {

    public List<StockItem> stockitems;

    public Stock() {
        stockitems = new ArrayList<StockItem>();
    }

    public void Add(String name, String description, float price, int quantity) {
        for (int i = 0; i < stockitems.size(); i++) {
            if (stockitems.get(i).GetName().equals(name)) {
                System.out.println("Error");
            } else {
                stockitems.add(new StockItem(name, description, price, quantity));
            }
        }
    }

    public void Remove(String name) {
        for (int i = 0; i < stockitems.size(); i++) {
            if (stockitems.get(i).GetName().equals(name)) {
                stockitems.remove(i);
            }
        }
    }

    public void UpdateProductPrice(String name, float price) {
        for (int i = 0; i < stockitems.size(); i++) {
            if (stockitems.get(i).GetName().equals(name)) {
                stockitems.get(i).SetPrice(price);
            }
        }
    }
}
