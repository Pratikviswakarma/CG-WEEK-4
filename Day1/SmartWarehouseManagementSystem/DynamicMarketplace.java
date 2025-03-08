package Day1.SmartWarehouseManagementSystem;

public class DynamicMarketplace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("Java Programming", 50));
        bookCatalog.addProduct(new Book("Data Structures", 40));
 
 
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 20));
        clothingCatalog.addProduct(new Clothing("Jeans", 50));
 
 
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 300));
        gadgetCatalog.addProduct(new Gadget("Laptop", 800));
 
 
        System.out.println("Books:");
        for (Book book : bookCatalog.getProducts()) {
            System.out.println(book);
        }
 
 
        System.out.println("\nApplying 10% discount on first book...");
        MarketplaceUtil.applyDiscount(bookCatalog.getProducts().get(0), 10);
        System.out.println(bookCatalog.getProducts().get(0));
    }
 }
 
