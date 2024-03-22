public class Product {
    private String name;
    private Boolean discount;
    private Double weight;
    private Double price;

    public Product(String name, Boolean discount, Double weight, Double price) {
        this.name = name;
        this.discount = discount;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return calcDiscount();
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double calcDiscount() {
        return this.discount ? this.price * 0.60 : this.price;
    }
}
