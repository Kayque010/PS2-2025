import banco.Conta;

public class ContaBancaria extends Conta {

    public ContaBancaria(int n, double s){
        super(s,n);
    }

    public ContaBancaria(int numero, String correntista, double saldo){
        super(numero, correntista, saldo);
    };


    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    //@Override
    public String toString(){
        return "";
    }
 

}