public class Garcom {

    private static Garcom instancia = new Garcom();

    private Garcom() {}

    public static Garcom getInstancia() {
        return instancia;
    }

    public String receberPedidoCozinha(String mensagem) {
        return "Pedido anotado pelo garçom\n"+
                "A Cozinha recebeu o pedido:\n" +
                ">>" + Cozinha.getInstancia().receberPedido(mensagem);
    }

    public String receberReclamacaoCozinha(String mensagem) {
        return "Reclamação anotada pelo garçom\n"+
                "A Chefe sente muito pelo seguinte inconveniente:\n" +
                ">>" + Cozinha.getInstancia().receberReclamacao(mensagem);
    }

    public String receberElogioCozinha(String mensagem) {
        return "Elogio anotado pelo garçom\n"+
                "O Chefe agradece o elogio:\n" +
                ">>" + Cozinha.getInstancia().receberElogio(mensagem);
    }


}
