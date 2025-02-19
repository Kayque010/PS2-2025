package banco;

public abstract class Conta {


    // Atributos
    protected double saldo;
    //private String correntista;
    private int numero;


    // Construtor sem Parâmetros
    public Conta(int n, double s){
        numero = n;
        saldo = s;
    };

    // Construtor com Parâmetros
    public Conta(int numero, String correntista, double saldo){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    // Métodos

    public double consultar(){
        return saldo;
    }

    public String toString(){
        return String.format("[%s,%s]", numero, saldo);
    };

    public int getNumero(){
        return numero;
    }

    public abstract void depositar(double valor);

    public abstract boolean sacar(double valor);

}
