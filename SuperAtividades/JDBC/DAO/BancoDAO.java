package DAO;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDAO { 
    public static void createTable(){
        Connection conexao = Conexao.getConnection();

        try{
            Statement stmt = conexao.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Bancos (id INT PRIMARY KEY, nome VARCHAR(64),numeroAgencia INT);";
            stmt.execute(sql);
        } catch (SQLException e){
            e.getMessage();
        }

    }
}