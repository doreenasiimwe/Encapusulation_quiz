import java.time.LocalDateTime;
//class to manage all the manipulations/the class with the main function
public class HardwareStoreManager {
    public static void main(String[] args) {
        // Create hardware store
        HardwareStore store = new HardwareStore("Furniture City", "+256-456-7890", "Jinja Road");
        Product product1 = new Product(1, "Hammer",300,300000, LocalDateTime.now(),LocalDateTime.of(2022, 6, 13, 15, 56),"https://www.google.com/aclk?sa=l&ai=DChcSEwj9v-2f-tj_AhUmEwYAHRvwAIkYABADGgJ3cw&ase=2&sig=AOD64_26m1RqsEItTxZ2s-jfSGZtO3j5Dw&ctype=5&nis=5&adurl&ved=2ahUKEwjD0uCf-tj_AhVwnCcCHX6LClQQwg96BAgBEHM");
        Product product2 = new Product(2, "Screwdriver",20,200000,LocalDateTime.now(),LocalDateTime.now(),"Image of screw drivers");
        Product product3 = new Product(3, "Cement",20,200000,LocalDateTime.now(),LocalDateTime.now(),"Image of screw drivers");

        System.out.println("StoreName: " + store.getName());
        System.out.println("Contact: " + store.getContact());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Product list " + store.getProducts());
        System.out.println();
        // Add initial products
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        // Update stock for new products
        store.updateProductStock("Hammer", 15);
        store.updateProductStock("Screwdriver", 20);
        store.updateProductStock("Cement",500);

        System.out.println("Product list " + store.getProducts());
        System.out.println();
        System.out.println("Product Name: " + product1.getName());
        System.out.println("Product_id " + product1.getProduct_id());
        System.out.println("Price of product1: " + product1.getPrice());
        System.out.println("Available stock: " + product1.getStock());
        System.out.println("Created at: " + product1.getCreated_at());
        System.out.println("Updated at: " + product1.getUpdated_at() );
        System.out.println("Image of Product1: " + product1.getImage());
        System.out.println();

        System.out.println(" Setting Product2");
        product2.setName("Pangas");
        product2.setPrice(10000);
        product2.setImage("Image of pangas");
        product2.setStock(25);
        product2.setCreated_at(LocalDateTime.of(2023,6,22,12,56));
        product2.setUpdated_at(LocalDateTime.of(2023, 6, 23, 12, 56));

        System.out.println();
        System.out.println("Product Name: " + product2.getName());
        System.out.println("Product_id " + product2.getProduct_id());
        System.out.println("Price of product1: " + product2.getPrice());
        System.out.println("Available stock: " + product2.getStock());
        System.out.println("Created at: " + product2.getCreated_at());
        System.out.println("Updated at: " + product2.getUpdated_at() );
        System.out.println("Image of Product1: " + product2.getImage());
        System.out.println();



        // Display product list and total products
        store.displayProductList();
        System.out.println("Total Products: " + store.getTotalProducts());


    }
    }



