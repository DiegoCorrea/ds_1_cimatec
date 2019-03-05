package programa_conta_private;

public class Conta {
    private final int NUMERO;
    private final String TITULAR;
    private double saldo;
    private double limite;
    private double limiteFixo;
    private int tipoConta; // [0 - 3] Estudante, Trabalhador, Especial, Ilimitado
    
    Conta(int numero, String titular, double saldo) {
        this.NUMERO = numero;
        this.TITULAR = titular;
        this.saldo = saldo;
        this.limite = 0.0;
        this.limiteFixo = 0.0;
        this.tipoConta = 1;
    }

    Conta(int numero, String titular, double saldo, double limiteFixo) {
        this.NUMERO = numero;
        this.TITULAR = titular;
        this.saldo = saldo;
        this.limite = limiteFixo;
        this.limiteFixo = limiteFixo;
        this.tipoConta = 1; // Trabalhador
    }
    
    Conta(int numero, String titular, double saldo,double limiteFixo, int tipoConta) {
        this.NUMERO = numero;
        this.TITULAR = titular;
        this.saldo = saldo;
        this.limite = limiteFixo;
        this.limiteFixo = limiteFixo;
        this.tipoConta = tipoConta;
    }
    // gets
    
    public String getTitular(){
        return this.TITULAR;
    }
    
    public int getNumero(){
        return this.NUMERO;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public double getLimiteFixo() {
        return this.limiteFixo;
    }
    
    public int getTipoConta() {
        return this.tipoConta;
    }
    
    // Metodos
    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;  
            return true;
        } else if((this.saldo + this.limite) >= valor){
            double valorRestanteParaSacar = valor - this.saldo;
            this.saldo = 0.0;
            this.limite = this.limiteFixo - valorRestanteParaSacar;            
            return true;
        } else {
            return false;
        }
    }
    
    public void depositar(double valor) {
        if (this.limite == this.limiteFixo) {
            this.saldo += valor;
        } else {
            double paraDepositarNoLimite = this.limiteFixo - this.limite;
            this.limite = this.limiteFixo;
            this.saldo += (valor - paraDepositarNoLimite);
        }
    }
    
    public boolean transferir(Conta destino, double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;  
            destino.depositar(valor);
            return true;
        } else if((this.saldo + this.limite) >= valor){
            double valorRestanteParaSacar = valor - this.saldo;
            this.saldo = 0.0;
            this.limite = this.limiteFixo - valorRestanteParaSacar;     
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public void exibeInformacoes() {
        System.out.println("Conta: " + this.NUMERO);
        System.out.println("Titular da Conta: " + this.TITULAR);
        System.out.println("Saldo disponível: " + this.saldo);
        System.out.println("Limite disponível: " + this.limite);
        System.out.println("Limite Máximo: " + this.limiteFixo);
    }
    
    public void alterarLimite(double valor) {
        if (valor >= this.limiteFixo) {
            this.limite += valor;
        } else {
            this.limite -= (this.limiteFixo - valor);
        }
        this.limiteFixo = valor;
    }
}
