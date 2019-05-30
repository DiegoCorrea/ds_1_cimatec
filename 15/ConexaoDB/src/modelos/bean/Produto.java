package modelos.bean;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private int qtd;

    public Produto(int id, String descricao, double preco, int qtd) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    public Produto(String descricao, double preco, int qtd) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }        
}
