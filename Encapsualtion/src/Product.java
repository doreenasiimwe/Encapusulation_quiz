import java.time.LocalDate;


import java.time.LocalDateTime;
class Product {
       private int product_id;

        private String name;
        private double stock;

        private double price;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;
        private String image;


        public Product(int product_id,String name, double stock,double price, LocalDateTime created_at,LocalDateTime updated_at,String image) {
            this.product_id = product_id;
            this.name = name;
            this.stock = stock;
            this.price = price;
            this.created_at = created_at;
            this.updated_at = updated_at;
        }

        //getters and setters
    public int getProduct_id() {
        return product_id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    //function to update the stock and add to the store
    public void updateStock(double quantity) {
        stock += quantity;
    }

}


