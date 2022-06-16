import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PixTest {

    @Test
    public void deveRetornarPix() {
        Pix pagamento = new Pix();
        assertEquals("Pix", pagamento.verificarTipoPagamento());
    }

    @Test
    public void deveRetornarInformacoes() {
        Pix pagamento = new Pix();
        pagamento.setNomeProduto("whey");
        pagamento.setValor(100);
        assertEquals("Pagamento realizado com sucesso{nomeProduto=whey,valor=100}", pagamento.getInfo());
    }
}
