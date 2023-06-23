//write a java program that manages a hardware store. The store must have a name,contact and where it is located.The store
//consists of different products. new products can be added to the store each new day and the store manager keeps track of all these
//new products.The store manager always updates these products based on the number in stock once  a new product has been brought.
//The manager presents a list of these products to his boss with the total products in the store
import java.util.*;


class HardwareStore {
    private String name;
    private String contact;
    private String location;
    private List<Product> products;

    public HardwareStore(String name, String contact, String location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }

    //function to add new products to the product collection
    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProductStock(String productName, double quantity) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.updateStock(quantity);
                break;
            }
        }
    }

    public void displayProductList() {
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Stock: " + product.getStock());
        }
    }

    public double getTotalProducts() {
        return products.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

