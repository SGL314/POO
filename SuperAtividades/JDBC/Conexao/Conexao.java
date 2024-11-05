package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    final private static String MYSQL_JDBC_DRIVER = "mvn archetype:generate -DgroupId=com.exemplo -DartifactId=meu_projeto_maven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false\r\n" + //
                "";
    final private static int DB_PORT = 3306;
    final private static String DB_HOST = "localhost";
    final private static String DB_NAME = "coltec";
    
    // Bloco estático para carregamento do driver
    // static {
    //     try {
    //         Class.forName(MYSQL_JDBC_DRIVER);
    //     } catch (ClassNotFoundException ex) {
    //         System.err.println("Falha ao carregar o Driver do JDBC MySQL");
    //     }
    // }

    static private Connection conexao = null;

    private Conexao() {}

    public static Connection getConnection(){

        // Configurações de conexão
        String url = "jdbc:mysql:// " + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
        String usuario = "root";
        String senha = "senhaSuperSegura";

        try {
            if (conexao == null) {
                conexao = DriverManager.getConnection(url, usuario, senha);
            }
            return conexao;
        } catch (SQLException e) {
            System.out.println("Going null");
            return null;
        }
    }

    public static void fechaConexao() {
        try {
        if (conexao != null) conexao.close();
        } catch (SQLException e) {
            // Faço nada
        }
    }



}