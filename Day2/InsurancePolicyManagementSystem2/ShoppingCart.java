package Day2.InsurancePolicyManagementSystem2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class ShoppingCart {
    private HashMap<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedByPrice = new TreeMap<>();
 
 
    public void addProduct(String name, double price) {
        productPrices.put(name, price);
        cart.put(name, cart.getOrDefault(name, 0) + 1);
        sortedByPrice.put(price, name);
    }
 
 
    public Map<String, Integer> getCartItems() {
        return cart;
    }
 
 
    public Map<Double, String> getProductsSortedByPrice() {
        return sortedByPrice;
    }
 }
 