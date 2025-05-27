public class ClienteCredito extends Cliente{
    private double credito;

    public ClienteCredito(String codigo, String nome, double credito){
        super(codigo, nome);
        this.credito = credito;
    }
    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getCredito(){
        return (this.credito);
    }
    public void comprar(double valor){
        if(valor <= this.credito){
            super.comprar(valor);
            this.credito -= valor;
            this.credito += valor * (1 + 0.10);
        }else{
            System.out.println("Compra nao autorizada, seu credito e = "+this.credito);
        }
    }
    public void mostrarDados(){
        System.out.println("- Mostrando dados do ClienteCredito -");
        System.out.println("Codigo = "+getCodigo()+"\nNome = "+getNome()+"\nTotal = "+getTotal()+"\nCredito = "+getCredito());
    }
}
