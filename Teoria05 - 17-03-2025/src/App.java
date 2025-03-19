import java.sql.*;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class App {

    private static Scanner entrada = new Scanner(System.in);
    private static ObjetoDados objDados = null;
    private static void consultar(){
    private static void adicionar() throws Exception{
        out.println("\n# Adição de nova conta!");
        out.println("\n# Número da nova conta!");
        long n = Long.parseLong(entrada.nextLine());
        out.println("Saldo da nova conta: ");
        double s = Double.parseDouble(entrada.nextLine());
        Conta c = new Conta(n, s);
    };
        List<Conta> contas = objDados.obterContas();
        out.println("\n Lista de Contas: ");
    }
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.txuhncbultubsliskyna&password=";
        ObjetoDados objDados = new ObjetoDados(url);
        boolean sair = false;

        while (!sair){
            out.println("# GERENCIADOR DE CONTAS");
            out.println("(1) Consultar Contas");
            out.println("(9) Sair");
            out.println("Escolha uma opção: ");
            int opcao = Integer.parseInt(entrada.nextLine());

            switch(opcao){
                case 1: consultar(); break;
                case 2: adicionar(); break;
                case 9: sair = true; break;
            }

        }

    }
}
