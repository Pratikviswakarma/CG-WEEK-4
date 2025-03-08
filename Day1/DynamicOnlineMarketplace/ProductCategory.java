package Day1.DynamicOnlineMarketplace;

abstract class ProductCategory {
    final private String name;
    public ProductCategory(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
 }
 
