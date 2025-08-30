package exercicio1;

public class Cliente extends Pessoa{
    private String dataCompra;
    private String formaPagamento;

    public Cliente(String nome, String idade, String dataCompra, String formaPagamento) {
        super(nome, idade);
        this.dataCompra = dataCompra;
        this.formaPagamento = formaPagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataCompra='" + dataCompra + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
