package Day1.DynamicOnlineMarketplace;

public class OnlineMarketplace {
    public static void main(String[] args) {
        //products with specific categories
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new
                BookCategory());
        System.out.println(book.getName());
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 30.0, new
                ClothingCategory());
        System.out.println(shirt.getCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, new
                GadgetCategory());
        // Apply discount dynamically
        MarketplaceUtils.applyDiscount(book, 10); // 10% off
        MarketplaceUtils.applyDiscount(shirt, 15); // 15% off
        MarketplaceUtils.applyDiscount(phone, 5); // 5% off
    }
 }
 
