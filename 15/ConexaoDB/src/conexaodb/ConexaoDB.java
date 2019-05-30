package conexaodb;

import modelos.bean.Produto;
import modelos.dao.ProdutoDAO;

public class ConexaoDB {

    public static void main(String[] args) {
        Produto p = new Produto("descrição da descrita", 200.5, 10);
        ProdutoDAO pDAO = new ProdutoDAO();
        
        pDAO.criar(p);
    }
}
