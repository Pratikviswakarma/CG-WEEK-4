package Day1.SmartWarehouseManagementSystem;


import java.util.*;

class ProductCatalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();
 
 
    public void addProduct(T product) {
        products.add(product);
    }
 
 
    public List<T> getProducts() {
        return products;
    }
 }
 