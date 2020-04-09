
public class Seller extends EmployeeInfo {

    public Seller(String name, String phoneNo, String address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String GetName() {
        return this.name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int CheckProductStock(String name, Stock stock) {
        for (int i = 0; i < stock.stockitems.size(); i++) {
            if (stock.stockitems.get(i).GetName().equals(name)) {
                return stock.stockitems.get(i).GetQuantity();
            }
        }
        return 0;
    }

    public void ReturnProducts(String name, Receipt rec) {
        for (int i = 0; i < rec.recitems.size(); i++) {
            if (rec.recitems.get(i).GetProductName().equals(name)) {
                rec.recitems.remove(i);
            }
        }
    }

    public void Sell(String name, CashRegister CR, Stock stock, int quantity) {
        CR.FinalizeSell(name, stock, quantity);
    }
    
    public void AddToSell(String name, CashRegister CR, Stock stock, int quantity)
    {
        CR.receipts.add(new Receipt(name,CR.receipts.get(0).GetPrice(name, stock),quantity));
    }
    
}
