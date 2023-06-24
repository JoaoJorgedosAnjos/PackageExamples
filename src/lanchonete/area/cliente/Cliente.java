package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public void fazerPedido() {
        System.out.println("FAZENDO O PEDIDO");
    }
    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }
    private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
    /*refatorando
    esse metodo não deveria existir
    ele vai ser servido pelo atendente

    public void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }*/
}