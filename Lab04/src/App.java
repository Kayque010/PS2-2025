import java.math.BigDecimal;
import java.sql.*;

public class App {

    public static void create() throws SQLException{
        System.out.println("Número para a nova conta: ");
        long nro = Long.parseLong(System.console().readLine());
        System.out.println("Saldo da nova conta: ");
        BigDecimal saldo = new BigDecimal(System.console().readLine());
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.txuhncbultubsliskyna&password=";
        Connection c = DriverManager.getConnection(url);
        String sql = "INSERT INTO contas VALUES (?,?)";
        PreparedStatement prepstm = c.prepareStatement(sql);
        prepstm.setLong(1, nro);
        prepstm.setBigDecimal(2, saldo);
        int ret = prepstm.executeUpdate();
        System.out.println("Número de registros inseridos: " + ret);
        c.close();
    }


    public static void update() throws SQLException {
        System.out.println("Número de uma conta já existente: ");
        long nro = Long.parseLong(System.console().readLine());
        System.out.println("Novo saldo para esta conta: ");
        BigDecimal saldo = new BigDecimal(System.console().readLine());
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.txuhncbultubsliskyna&password=K@yque2025";
        Connection c = DriverManager.getConnection(url);
        String sql = "UPDATE contas SET saldo=? WHERE nro_conta=?";
        PreparedStatement prepstm = c.prepareStatement(sql);
        prepstm.setBigDecimal(1, saldo);
        prepstm.setLong(2, nro);
        int ret = prepstm.executeUpdate();
        System.out.println("Número de registros alternados: " + ret);
        c.close();
    }

    public static void delete() throws SQLException {
        System.out.println("Número de uma conta já existente: ");
        long nro = Long.parseLong(System.console().readLine());
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.txuhncbultubsliskyna&password=K@yque2025";
        Connection c = DriverManager.getConnection(url);
        String sql = "DELETE FROM contas WHERE nro_conta=?";
        PreparedStatement prepstm = c.prepareStatement(sql);
        prepstm.setLong(1, nro);
        int ret = prepstm.executeUpdate();
        System.out.println("Número de registros apagados: " + ret);
        c.close();
    }


    public static void read() throws SQLException{
        String url = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.txuhncbultubsliskyna&password=K@yque2025";
        Connection c = DriverManager.getConnection(url);
        String sql = "SELECT * FROM contas";
        PreparedStatement stm = c.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()){
            long nro = rs.getLong("nro_conta");
            BigDecimal saldo = rs.getBigDecimal("saldo");
            System.out.println("Conta número: " + nro + " tem saldo de R$ " + saldo);
        }
        c.close();
    }

    public static void main(String[] args) throws Exception {

        create();
        read();
        update();
        delete();
        }
    }

