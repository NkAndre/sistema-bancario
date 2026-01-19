package service;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class BancoService {

    private List<Cliente> clientes = new ArrayList<>();

    public void criarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    private Cliente buscarClientePorConta(int numeroConta) {
        for (Cliente c : clientes) {
            if (c.getNumeroConta() == numeroConta) {
                return c;
            }
        }
        return null;
    }

    public void depositar(int numeroConta, double valor) {
        Cliente cliente = buscarClientePorConta(numeroConta);

        if (cliente == null) {
            System.out.println("Conta não encontrada");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        cliente.depositar(valor);
        System.out.println("Depósito realizado");
    }

    public void sacar(int numeroConta, double valor) {
        Cliente cliente = buscarClientePorConta(numeroConta);

        if (cliente == null) {
            System.out.println("Conta não encontrada");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (cliente.getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }

        cliente.sacar(valor);
        System.out.println("Saque realizado");
    }

    public void transferir(int origemConta, int destinoConta, double valor) {
        Cliente origem = buscarClientePorConta(origemConta);
        Cliente destino = buscarClientePorConta(destinoConta);

        if (origem == null || destino == null) {
            System.out.println("Conta de origem ou destino não encontrada");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (origem.getSaldo() < valor) {
            System.out.println("Saldo insuficiente na conta de origem");
            return;
        }

        origem.sacar(valor);
        destino.depositar(valor);

        String mensagem = "Transferência de " + valor + " para conta " + destinoConta;
        origem.adicionarHistorico(mensagem);
        destino.adicionarHistorico("Recebido " + valor + " da conta " + origemConta);

        System.out.println("Transferência realizada");
    }

    public void consultarSaldo(int numeroConta) {
        Cliente cliente = buscarClientePorConta(numeroConta);

        if (cliente == null) {
            System.out.println("Conta não encontrada");
            return;
        }

        System.out.println("Saldo atual: " + cliente.getSaldo());
    }

    public void mostrarHistorico(int numeroConta) {
        Cliente cliente = buscarClientePorConta(numeroConta);

        if (cliente == null) {
            System.out.println("Conta não encontrada");
            return;
        }

        System.out.println("Histórico de operações da conta " + numeroConta + ":");
        for (String registro : cliente.getHistorico()) {
            System.out.println(registro);
        }
    }
}

