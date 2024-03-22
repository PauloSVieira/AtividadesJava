public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Banana", false, 0.4, 4.00),
                new Product("Repolho", true, 0.9, 20.00),
                new Product("Tomate", false, 0.2, 3.00)
        };

        Cart cart = new Cart(0.1, products);

        User cliente = new User("Paulo", "paulo@email.com", 19, cart);

        System.out.println("Dados do Usuario:");
        System.out.println("Nome: " + cliente.getName());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Idade: " + cliente.getAge());

        System.out.println("\nProdutos no Carrinho:");
        cart.listingProducts();

        System.out.println("\nTotal a Pagar: " + cart.getTotalPrice());

        cliente.pay();
    }
}
