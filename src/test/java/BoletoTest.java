import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoletoTest {

    @Test
    public void deveRetornarBoleto(){
        Boleto pagamento = new Boleto();
        assertEquals("Boleto", pagamento.verificarTipoPagamento());
    }

    @Test
    public void deveRetornarInformacoes() {
        Boleto pagamento = new Boleto();
        pagamento.setNomeProduto("creatina");
        pagamento.setValor(120);
        assertEquals("Pagamento{nomeProduto=creatina,valor=120}", pagamento.getInfo());
    }
}
