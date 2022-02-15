public class Cozinha implements Setor {

    private static Cozinha instancia = new Cozinha();

    private Cozinha() {}

    public static Cozinha getInstancia() {
        return instancia;
    }

    public String receberPedido(String mensagem) {
        return "Pedido Registrado: " + mensagem;
    }

    public String receberReclamacao(String mensagem) {
        return "Reclamação Registrada: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Chefe Agradece: " + mensagem;
    }

}
