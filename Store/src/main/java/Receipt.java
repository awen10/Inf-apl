
import java.util.ArrayList;
import java.util.*;

public class Receipt {

    public List<ReceiptItem> recitems;

    public Receipt() {
        recitems = new ArrayList<ReceiptItem>();
    }

    public float GetTotalPerProduct(int i) {
        return (recitems.get(i).GetQuantity() * recitems.get(i).GetppUnit());
    }

    public float GetTotal() {
        float sum = 0;
        for (int i = 0; i < recitems.size(); i++) {
            sum = sum + (recitems.get(i).GetQuantity() * recitems.get(i).GetppUnit());
        }
        return sum;
    }

    public void Add(String name, float price, int quantity) {
        recitems.add(new ReceiptItem(name, price, quantity));
    }

    public float GetPrice(String name, Stock stock) {
        float n = 0;
        for (int i = 0; i < stock.stockitems.size(); i++) {
            if (stock.stockitems.get(i).GetName().equals(name)) {
                n = stock.stockitems.get(i).GetPrice();
            }
        }
        return n;
    }
}
