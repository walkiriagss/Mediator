public class Pessoa {

    public String fazerPedidoCozinha(String mensagem) {
        return Garcom.getInstancia().receberPedidoCozinha(mensagem);
    }

    public String fazerReclamacaoCozinha(String mensagem) {
        return Garcom.getInstancia().receberReclamacaoCozinha(mensagem);
    }

    public String fazerElogioCozinha(String mensagem) {
        return Garcom.getInstancia().receberElogioCozinha(mensagem);
    }

}
