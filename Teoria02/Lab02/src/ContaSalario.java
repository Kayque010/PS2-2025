import banco.Conta;

public class ContaSalario extends Conta{

    private String cnpjContratante;
    private int numSaques;

    public ContaSalario(){
        super(30,"",0);
    }

    public ContaSalario(int numero, String correntista, double saldo, String cnpjContratante){
        super(numero, correntista, saldo);
        this.cnpjContratante = cnpjContratante;
    }

    @Override
    public void depositar(double valor){}

    @Override
    public boolean sacar(double valor){
        return getValor();
    }

    @Override
    public String toString(){
        return "";
    }

    public void setCnpjContratante(String cnpjContratante){}
            

}