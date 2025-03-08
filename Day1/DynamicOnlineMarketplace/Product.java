package Day1.DynamicOnlineMarketplace;

class Product<T extends ProductCategory> {
    final private String name;
    private double price;
    final private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }
    public T getCategory() {
        return category;
    }
 }
 
