package TratamentoDeExceções.Excecoes;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    private double saldo = 100.0;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + valor);
        }
        saldo -= valor;
    }

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new Conta();
        conta.sacar(200); // Vai lançar a exceção
    }
}


class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); // passa a mensagem para Exception
    }
}




class Conta{
    public void sacar(int valor){
        System.out.println("sucesso");
    }

}
