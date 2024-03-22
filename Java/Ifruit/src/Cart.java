public class Cart {
    private Double grossPrice;
    private Double tax;
    private Double totalPrice;
    private Product[] prodList;

    public Cart(Double tax, Product[] prodList) {
        this.tax = tax;
        this.prodList = prodList;
        this.totalPrice = 0.00;
        this.grossPrice = 0.00;
    }

    public Double getGrossPrice() {
        calculateTotalPrice();
        return this.totalPrice + this.tax;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPrice() {
        calculateTotalPrice();
        return this.totalPrice;
    }

    public Product[] getProdList() {
        return prodList;
    }

    public void setProdList(Product[] prodList) {
        this.prodList = prodList;
    }

    public void checkout() {
        System.out.println("Compra finalizada!");
        this.prodList = null;
    }

    private void calculateTotalPrice() {
        this.totalPrice = 0.00;
        if (this.prodList != null && this.prodList.length >= 1) {
            for (Product product : this.prodList) {
                this.totalPrice += product.getPrice();
            }
        }
    }

    public void listingProducts() {
        if (this.prodList != null && this.prodList.length >= 1) {
            for (Product product : this.prodList) {
                System.out.println(
                        "Nome: " + product.getName() + " Preco: " + product.getPrice() + " Peso: " + product.getWeight()
                );
            }
        } else {
            System.out.println("Sem produtos!");
        }
    }
}
