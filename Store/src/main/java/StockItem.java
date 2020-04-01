
public class StockItem extends Product {

    private int quantity;

    public StockItem(String name, String description, float price, int quantity) {
        SetName(name);
        SetDescription(description);
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
