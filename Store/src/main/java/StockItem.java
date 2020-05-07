
public class StockItem extends Product {

    private int quantity;

    public StockItem(String name, float price, int quantity) {
        SetName(name);
        SetPrice(price);
        this.quantity = quantity;
    }

    public int GetQuantity() {
        return this.quantity;
    }

    public void SetQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String GetNameItem() {
        return GetName();
    }

    public void SetPriceItem(float price) {
        SetPrice(price);
    }
}
