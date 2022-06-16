public abstract class Pagamento {

    private String nomeProduto;
    private int valor;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public abstract String verificarTipoPagamento();

    public String getTipo() {
        return "Pagamento";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nomeProduto=" + this.nomeProduto +
                ",valor=" + this.valor +
                '}';
    }
}
