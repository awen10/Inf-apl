
import java.util.ArrayList;
import java.util.*;

public class CashRegister {

    private int currentRecpNo;
    public List<Receipt> receipts;
    private String storename;
    private String fiscalIdentifier;

    public CashRegister() {
        receipts = new ArrayList<Receipt>();
    }

    public CashRegister(int crNo,String name) {
        this.currentRecpNo = crNo;
        this.storename=name;
    }

    public void StartNewSell() {
        receipts.add(new Receipt());
        this.currentRecpNo++;
    }

    public void RegisterNewProduct(String name, int quantity, Stock stock) {
        float n = -1;
        for (int i = 0; i < stock.stockitems.size(); i++) {
            if (stock.stockitems.get(i).GetName().equals(name)) {
                n = stock.stockitems.get(i).GetPrice();
            }
        }
    }

    public void RemoveProductFromSell(String name, Receipt receipt) {
        for (int i = 0; i < receipt.recitems.size(); i++) {
            if (receipt.recitems.get(i).GetProductName().equals(name)) {
                receipts.remove(i);
            }
        }
    }

    public void FinalizeSell(String name, Stock stock, int quantity) {

        this.currentRecpNo++;
        for (int i = 0; i < stock.stockitems.size(); i++) {
            if (stock.stockitems.get(i).GetName().equals(name)) {
                stock.stockitems.get(i).SetQuantity(stock.stockitems.get(i).GetQuantity() - quantity);
            }
        }
    }

    public float GetTotal1() {
        float sum = 0;
        for (int i = 0; i < receipts.get(0).recitems.size(); i++) {
            sum = sum + (receipts.get(0).recitems.get(i).GetQuantity() * receipts.get(0).recitems.get(i).GetppUnit());
        }
        return sum;
    }
    
    public int GetCrNo()
    {
        return this.currentRecpNo;
    }
    
}
