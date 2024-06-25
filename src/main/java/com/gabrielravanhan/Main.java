package com.gabrielravanhan;

import com.gabrielravanhan.cliente.Cliente;
import com.gabrielravanhan.conta.Conta;
import com.gabrielravanhan.conta.ContaCorrente;
import com.gabrielravanhan.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
