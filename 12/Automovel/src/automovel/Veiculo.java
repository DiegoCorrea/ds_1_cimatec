/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovel;

/**
 *
 * @author lowe
 */
public interface Veiculo {
    public String getNome();
    public String getId();
    public void acelerar(double valor);
    public void frear(double valor);
}
