
public class ReceiptItem {

    private String productname;
    private float ppUnit;
    private int quantity;
    private float total;

    public ReceiptItem(String name, float ppUnit, int quantity) {
        this.productname = name;
        this.ppUnit = ppUnit;
        this.quantity = quantity;
    }

    public String GetProductName() {
        return this.productname;
    }

    public float GetppUnit() {
        return this.ppUnit;
    }

    public int GetQuantity() {
        return this.quantity;
    }

    public float GetTotal() {
        return this.total;
    }

    public void SetProductName(String productname) {
        this.productname = productname;
    }

    public void SetppUnit(float ppUnit) {
        this.ppUnit = ppUnit;
    }

    public void SetQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void SetTotal(float total) {
        this.total = quantity * ppUnit;
    }
}
