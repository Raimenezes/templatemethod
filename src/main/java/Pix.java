public class Pix extends Pagamento {

    public String verificarTipoPagamento() {
        return "Pix";
    }

    @Override
    public String getTipo() {
        return "Pagamento realizado com sucesso";
    }
}
