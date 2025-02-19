import banco.Conta;

public class ContaEspecial extends Conta{
    
    private double limite;

    public ContaEspecial(){
        super(10,"",0);
    }

    public ContaEspecial(int numero, String correntista, double saldo, double limite){
        super(numero, correntista, saldo);
        this.limite = limite;
    }


    @Override
    public void depositar(double valor){}


    @Override
    public boolean sacar(double valor){
        return getValor();
    }

    //@Override
    public String toString(){
        return "";
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
}