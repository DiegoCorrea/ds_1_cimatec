package programa_conta_private;

public class Conta {
    int numero;
    String titular;
    double saldo;
    double limite;
    double limiteFixo;
    int tipoConta; // [0 - 3] Estudante, Trabalhador, Especial, Ilimitado
    
    Conta(){
        System.out.println("Construtor da classe");
    }
    
    Conta(int numero, String titular, double saldo, double limiteFixo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limiteFixo;
        this.limiteFixo = limiteFixo;
        this.tipoConta = 0;
    }
    
    Conta(int numero, String titular, double saldo,double limiteFixo, int tipoConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limiteFixo;
        this.limiteFixo = limiteFixo;
        this.tipoConta = tipoConta;
    }
    
    Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = 500.0;
        this.limiteFixo = 500.0;
        this.tipoConta = 0;
    }
    
    void saca(double valor) {
        this.saldo = this.saldo - valor;
    }
    
    boolean sacaValor(double valor) {
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
    
    void deposita(double valor) {
        if (this.limite == this.limiteFixo) {
            this.saldo += valor;
        } else {
            double paraDepositarNoLimite = this.limiteFixo - this.limite;
            this.limite = this.limiteFixo;
            this.saldo += (valor - paraDepositarNoLimite);
        }
    }
    
    void exibeSaldo() {
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular da Conta: " + this.titular);
        System.out.println("Saldo disponível: " + this.saldo);
        System.out.println("Limite disponível: " + this.limite);
        System.out.println("Limite Máximo: " + this.limiteFixo);
    }
    
    boolean transferencia(Conta destino, double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;  
            destino.deposita(valor);
            return true;
        } else if((this.saldo + this.limite) >= valor){
            double valorRestanteParaSacar = valor - this.saldo;
            this.saldo = 0.0;
            this.limite = this.limiteFixo - valorRestanteParaSacar;     
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}
