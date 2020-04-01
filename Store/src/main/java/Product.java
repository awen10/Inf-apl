
public class Product {

    private String name;
    private String description;
    private float price;

    public String GetName() {
        return this.name;
    }

    public String GetDescription() {
        return this.description;
    }

    public float GetPrice() {
        return this.price;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetDescription(String description) {
        this.description = description;
    }

    public void SetPrice(float price) {
        this.price = price;
    }
}
