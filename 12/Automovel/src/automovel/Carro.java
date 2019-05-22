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
public class Carro implements Veiculo,Motor{
    private String id;
    private String nome;
    private String fabricante;
    private String modelo;
    private float potencia;
    private int ano;
    private double velocidade;
    
    Carro(String id, String nome, String fabricante, String modelo, float potencia, int ano) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.potencia = potencia;
        this.ano = ano;
        this.velocidade = 0.0;
    }
 
    @Override
    public String getId() {
        return this.id;
   }
 
    @Override
    public String getNome() {
        return this.nome;
    }
 
    @Override
    public String getFabricante() {
        return this.fabricante;
    }
 
    @Override
    public String getModelo() {
        return this.modelo;
    }
    
    @Override
    public void acelerar(double valor) {
        if (this.velocidade + valor < 180.0){
            this.velocidade += valor;
            System.out.println("Velocidade atual: " + this.velocidade);
        } else
            System.out.println("Velocidade Máxima");
    }
    
    @Override
    public void frear(double valor) {
        if (this.velocidade - valor > 0.0) {
            this.velocidade -= valor;
            System.out.println("Velocidade atual: " + this.velocidade);
        } else {
            this.velocidade = 0.0;
            System.out.println("Carro Parado");
        }
    }
    
    @Override
    public int getAno(){
        return this.ano;
    }
    
    @Override
    public void setAno(int valor) {
        this.ano = valor;
    }
    
    @Override
    public float getPotencia() {
        return this.potencia;
    }
    
    @Override
    public void setPotencia(float valor) {
        this.potencia = valor;
    }
}
