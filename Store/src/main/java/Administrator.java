
public class Administrator extends EmployeeInfo {

    public Administrator(String name, String phoneNo, String address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public void AddProductsToStock(String name, String description, float price, int quantity, Stock stock) {
        stock.stockitems.add(new StockItem(name, description, price, quantity));
    }

    public int CheckProductStock(String name, Stock stock) {
        for (int i = 0; i < stock.stockitems.size(); i++) {
            if (stock.stockitems.get(i).GetName().equals(name)) {
                return stock.stockitems.get(i).GetQuantity();
            }
        }
        return 0;
    }

    public void RemoveProductsFromStock(String name, Stock stock) {
        for (int i = 0; i < stock.stockitems.size(); i++) {
            if (stock.stockitems.get(i).GetName().equals(name)) {
                stock.Remove(name);
            }
        }
    }
}
