import java.util.ArrayList;

public class Prateleira {

    private ArrayList<Produto> produtos;
    private String posicao;

    public Prateleira(ArrayList<Produto> produtos, String posicao) {
        this.produtos = produtos;
        this.posicao = posicao;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
