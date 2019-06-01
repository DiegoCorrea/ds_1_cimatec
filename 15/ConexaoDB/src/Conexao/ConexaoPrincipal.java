package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoPrincipal {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_NAME = "aula_coneaxao";
    private static final String DB_PORT = "3306";
    private static final String DB_PREFIX = "jdbc:mysql://";
    private static final String HOST_NAME = "localhost";
    private static final String DB_USER = "diego_";
    private static final String DB_PW = "123456";
    private static final String URL = DB_PREFIX + HOST_NAME + ":"+ DB_PORT +"/" + DB_NAME + "/";

    public static Connection getConnection() {
        try {
            System.out.println("Iniciando Conexão!");
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, DB_USER, DB_PW);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro de conexão: " + e);
        }
    }
    
    public static void closeConnection(Connection CON) {
        try {
            if (CON != null) {
                CON.close();
                System.out.println("Conexão Fechan!");
            }
        } catch (SQLException e) {
            Logger.getLogger(ConexaoPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void closeConnection(Connection CON, PreparedStatement stmt) {
        try {
            if (CON != null && stmt != null) {
                closeConnection(CON);
                stmt.close();
            }
        } catch (SQLException e) {
          Logger.getLogger(ConexaoPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void closeConnection(Connection CON, PreparedStatement stmt, ResultSet result) {
        try {
            if (CON != null && stmt != null) {
                closeConnection(CON, stmt);
                result.close();
            }
        } catch (SQLException e) {
          Logger.getLogger(ConexaoPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
