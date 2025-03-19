import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arraylist;

public class ObjetoDados {

    private PreparedStatement obterContasStm = null;
    public ObjetoDados(String url) throws SQLException{
    Connection conexao = DriverManager(url);
    obterContasStm = conexao.prepareStatement("SELECT * FROM contas");
    }

    public List<Conta> obterContas(){
        List<Conta> contas = new ArrayList<>();
        ResultSet rs = obterContasStm.executeQuery();

        while (rs.next()){
            long numero = rs.getLong("nro_conta");
            double saldo = rs.getDouble("saldo");
            Conta c = new Conta(numero, saldo);
            contas.add(c);
        }
        return contas;
    }

    public boolean adicionar(Conta conta) throws SQLException{
        adicionarStm.setLong(1, conta.getNumero());
        adicionarStm.setDouble(2,conta.)
    }
}
