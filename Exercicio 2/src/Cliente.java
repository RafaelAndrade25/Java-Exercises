public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public double saldo;


    //Construtor
    public Cliente(int numeroConta, int numeroAgencia, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(int deposito) {
        if (deposito < 0) {
            System.out.println("Não pode depositar valor negativo!");
        } else if (deposito > 0) {
            double atualizaSaldo = deposito;
            System.out.println("Depósito concluido! Seu saldo está em: " + atualizaSaldo);
        }
    }

    public void realizarSaque(int saque) {
        if (this.saldo < 0) {
            System.out.println("Saldo negativo. Saque indisponivel!");
        } else if (this.saldo > 0) {
            double atualizaSaldo = this.saldo - saque;
            System.out.println("Saque realizado!" + " Sua conta está com o saldo de: " + atualizaSaldo);
        }
    }
}

