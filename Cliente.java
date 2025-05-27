abstract class Cliente {
    private String codigo;
    private String nome;
    private double total;

    public Cliente(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.total = 0;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return (this.codigo);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return (this.nome);
    }
    public double getTotal(){
        return (this.total);
    }
    public void comprar(double valor){
        this.total += valor;
    }
    public void mostrarDados(){
        System.out.println("- Mostrando Dados -");
        System.out.println("Codigo = "+getCodigo()+"\nNome = "+getNome()+"\nTotal = "+getTotal());
    }
}
