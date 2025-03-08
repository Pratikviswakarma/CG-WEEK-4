package Day1.DynamicOnlineMarketplace;

class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" +
                product.getPrice());
    }
 }
 
