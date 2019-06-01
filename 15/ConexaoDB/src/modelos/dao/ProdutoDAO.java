package modelos.dao;

import Conexao.ConexaoPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.bean.Produto;

public class ProdutoDAO {
    public void criar(Produto produ) {
        Connection con = ConexaoPrincipal.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao, qtd, preco) VALUES (?, ?, ?)");
            
            stmt.setString(1, produ.getDescricao());
            stmt.setInt(2, produ.getQtd());
            stmt.setDouble(3, produ.getPreco());
            
            stmt.executeUpdate();
            
            System.out.println("Dado salvado com sucesso!");
        } catch (SQLException ex) {
            System.err.println("Não foi possível executar!");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPrincipal.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Produto> ler() {
        Connection con = ConexaoPrincipal.getConnection();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            resultado = stmt.executeQuery();
            
            while(resultado.next()) {
                listaProdutos.add(new Produto(
                        resultado.getString("descrição"),
                        resultado.getDouble("preco"),
                        resultado.getInt("qtd")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPrincipal.closeConnection(con, stmt, resultado);
        }
        return listaProdutos;
    }
}
