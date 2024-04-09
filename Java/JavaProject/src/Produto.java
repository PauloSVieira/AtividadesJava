import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private String tipoProduto;
    private String nomeProduto;
    private String dataVencimento;

    public Produto(String tipoProduto, String nomeProduto, String dataVencimento) {
        this.tipoProduto = tipoProduto;
        this.nomeProduto = nomeProduto;
        this.dataVencimento = dataVencimento;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean vencido() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = new Date();

        try {
            Date dataVencimentoDate = formato.parse(this.dataVencimento);
            return dataVencimentoDate.before(dataAtual);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
}