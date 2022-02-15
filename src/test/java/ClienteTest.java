import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveFazerPedidoPraCozinha() {
        Cliente cliente = new Cliente();
        assertEquals("Pedido anotado pelo garçom\n"+
                        "A Cozinha recebeu o pedido:\n" +
                        ">>Pedido Registrado: File com Fritas",
                cliente.fazerPedidoCozinha("File com Fritas"));

    }

    @Test
    void deveFazerReclacaoPraCozinha() {
        Cliente cliente = new Cliente();
        assertEquals("Reclamação anotada pelo garçom\n"+
                        "A Chefe sente muito pelo seguinte inconveniente:\n" +
                        ">>Reclamação Registrada: Bife muito passado",
                cliente.fazerReclamacaoCozinha("Bife muito passado"));

    }

    @Test
    void deveElogiarCozinha() {
        Cliente cliente = new Cliente();
        assertEquals("Elogio anotado pelo garçom\n"+
                "O Chefe agradece o elogio:\n" +
                ">>O Chefe Agradece: Tudo Perfeito",
                cliente.fazerElogioCozinha("Tudo Perfeito"));
    }

}