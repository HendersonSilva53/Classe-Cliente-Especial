public class MovimentoCompra {
    public static void main(String [] args){
        ClientePontos cp = new ClientePontos("1", "Joao");
        ClienteCredito cc = new ClienteCredito("2", "Maria", 100);
        cp.mostrarDados();
        cc.mostrarDados();
        cp.comprar(50);
        cc.comprar(100);
        cp.mostrarDados();
        cc.mostrarDados();
        cp.comprar(100);
        cc.comprar(111);
        cp.mostrarDados();
        cc.mostrarDados();
        cp.usarPontos(100);
        cp.mostrarDados();
        cc.setCredito(150);
        cc.mostrarDados();
        cc.comprar(150);
        cc.mostrarDados();
    }
}
