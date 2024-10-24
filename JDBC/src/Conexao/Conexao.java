package src.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.Class;

public class Conexao {

    static private Connection conexao = null;

    final private static String MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final private static int DB_PORT = 3306;
    final private static String DB_HOST = "localhost";
    final private static String DB_NAME = "JDBC";

    public static Connection getConnection(){
        try {
            Class.forName(MYSQL_JDBC_DRIVER);
        } catch (ClassNotFoundException e){
            System.out.println("Erro");
            e.getMessage();
            return null;
        }

        String url = "jdbc:mysql:// " + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
        String usuario = "root";
        String senha = "sglpass";

        try {
            if (conexao == null) {
                conexao = DriverManager.getConnection(url, usuario, senha);
            }
            System.out.println(conexao);
            return conexao;
        } catch (SQLException e){
            System.out.println("Erro driver");
            e.getMessage();
            return null;
        }

    }
}
