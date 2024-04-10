import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private String tipoProduto;
    private String nomeProduto;
    private Date dataVencimento;

    public Produto(String tipoProduto, String nomeProduto, String dataVencimento) {
        this.tipoProduto = tipoProduto;
        this.nomeProduto = nomeProduto;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataVencimento = formatoData.parse(dataVencimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isVencido(){
        Date dataHoje = new Date();
        if(dataVencimento.before(dataHoje)){
            return true;
        }else{
            return false;
        }
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

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

}
