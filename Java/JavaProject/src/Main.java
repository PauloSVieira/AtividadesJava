import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Limpeza", "Amaciante", "02/01/2024"));
        produtos.add(new Produto("Limpeza", "Sabonete", "03/02/2026"));
        produtos.add(new Produto("Limpeza", "Shampoo", "20/01/2026"));
        produtos.add(new Produto("Limpeza", "Detergente", "04/01/2025"));
        produtos.add(new Produto("Alimento", "Arroz", "06/06/2025"));
        produtos.add(new Produto("Alimento", "Feijao", "21/04/2024"));
        produtos.add(new Produto("Alimento", "Banana", "12/01/2024"));
        produtos.add(new Produto("Alimento", "Mandioca", "10/10/2025"));
        produtos.add(new Produto("Alimento", "Alface", "10/01/2025"));
        produtos.add(new Produto("Alimento", "Tomate", "05/01/2025"));

        Prateleira prateleiraSuperior = new Prateleira(new ArrayList<>(), "Prateleira superior");
        Prateleira prateleiraInferior = new Prateleira(new ArrayList<>(), "Prateleira inferior");

        ArrayList<Produto> produtosCopia = new ArrayList<>(produtos);

        for (Produto produto : produtosCopia) {
            if (produto.getTipoProduto().equals("Limpeza")) {
                prateleiraInferior.adicionarProduto(produto);
            } else {
                prateleiraSuperior.adicionarProduto(produto);
            }
        }

        System.out.println("Prateleira Superior:");
        for (Produto produto : prateleiraSuperior.getProdutos()) {
            if (produto.isVencido()) {
                System.out.printf("\nProduto: %s \t Vencido \t", produto.getNomeProduto());
            } else {
                System.out.printf("\nProduto: %s", produto.getNomeProduto());
            }
        }

        System.out.println("\n\nPrateleira Inferior:");
        for (Produto produto : prateleiraInferior.getProdutos()) {
            if (produto.isVencido()) {
                System.out.printf("\nProduto: %s \t Vencido \t", produto.getNomeProduto());
            } else {
                System.out.printf("\nProduto: %s", produto.getNomeProduto());
            }
        }
    }
}
