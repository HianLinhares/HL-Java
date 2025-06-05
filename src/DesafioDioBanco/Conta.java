//package DesafioDioBanco;
//
//public abstract class  Conta implements Iconta {
//    protected static final int AGENCIA_PADRAO = 1;
//    private static int SEQUENCIAL = 1;
//    protected int agencia;
//    protected int numero;
//    protected double saldo;
//
//    public Conta(int agencia, int numero) {
//        this.agencia = Conta.AGENCIA_PADRAO;
//        this.numero = SEQUENCIAL++;
//    }
//
//    public int getAgencia() {
//        return agencia;
//    }
//
//    public void setAgencia(int agencia) {
//        this.agencia = agencia;
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public void setNumero(int numero) {
//        this.numero = numero;
//    }
//
//    @Override
//    public void sacar(double valor) {
//        saldo = saldo - valor;
//    }
//
//    @Override
//    public void depositar(double valor) {
//        saldo = saldo + valor;
//    }
//
//    @Override
//    public void transferir(double valor, Conta conta) {
//    this.sacar(valor);
//    conta.depositar(valor);
//    }
//}
