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
public interface Motor {
    public String getModelo();
    public String getFabricante();
    public int getAno();
    public void setAno(int valor);
    public float getPotencia();
    public void setPotencia(float valor);
}
