package modelos.dao;

import Conexao.ConexaoPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
