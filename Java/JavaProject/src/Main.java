import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Limpeza", "Amaciante", "02/01/2025"));
        produtos.add(new Produto("Limpeza", "Sabonete", "03/02/2026"));
        produtos.add(new Produto("Limpeza", "Shampoo", "20/01/2026"));
        produtos.add(new Produto("Limpeza", "Detergente", "04/01/2025"));
        produtos.add(new Produto("Alimento", "Arroz", "06/06/2025"));
        produtos.add(new Produto("Alimento", "Feijao", "21/04/2024"));
        produtos.add(new Produto("Alimento", "Banana", "12/01/2024"));
        produtos.add(new Produto("Alimento", "Mandioca", "10/10/2025"));
        produtos.add(new Produto("Alimento", "Alface", "10/01/2025"));
        produtos.add(new Produto("Alimento", "Tomate", "05/01/2025"));
        Prateleira prateleiraSuperior = new Prateleira(produtos, "Prateleira superior");
        Prateleira prateleiraInferior = new Prateleira(produtos, "Prateleira inferior");

        for (Produto produto : produtos) {
            if (produto.getTipoProduto().equals("Limpeza")) {
                prateleiraInferior.adicionarProduto(produto);
            } else {
                prateleiraSuperior.adicionarProduto(produto);
            }
        }
        System.out.println("Pratileira Superior");
        for (Produto produto : prateleiraSuperior.getProdutos()) {
            if(){
            System.out.printf("Produto: %s \t ", produto.getNomeProduto,);
            }
        }
    }
}

/*
 * Estou tendo dificuldades com as minhas compras. Será que poderia criar um
 * programa para realizar a organização delas. Separando de limpeza e comestível
 * e por data de vencimento.
 * Mas eu separo as minhas compras por prateleiras. E eu normalmente deixo os
 * produtos de comer em cima e os de limpeza em baixo.
 * Como toda semana vou ao mercado e quero adicionar mais produtos às minhas
 * prateleiras.A média de itens de produtos que eu compro são 10 sendo 6 para
 * consumo e 4 para limpeza.
 */