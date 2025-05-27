public class ClientePontos extends Cliente{
    private double pontos;

    public ClientePontos(String codigo, String nome){
        super(codigo, nome);
        this.pontos = 0;
    }
    public double getPontos(){
        return (this.pontos);
    }
    public void comprar(double valor){
        super.comprar(valor);
        this.pontos += valor;
    }
    public void usarPontos(double valor){
        this.pontos -= valor;
    }
    public void mostrarDados(){
        System.out.println("- Mostrando dados do ClientePontos -");
        System.out.println("Codigo = "+getCodigo()+"\nNome = "+getNome()+"\nTotal = "+getTotal()+"\nPontos = "+getPontos());
    }
}
