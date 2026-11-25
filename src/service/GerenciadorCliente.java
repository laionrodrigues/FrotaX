package service;

import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private final List<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inexistente.");
        }
        if (buscarPorCpf(cliente.getCpf()) != null) {
            throw new IllegalArgumentException("Já existe um cliente com esse CPF.");
        }
        cliente.setId(proximoId++);
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inexistente.");
        }
        clientes.remove(cliente);
    }

    public Cliente buscarPorCpf(String cpf) {
        if (cpf == null) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        String cpfLimpo = cpf.replace(".", "").replace("-", "");
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfLimpo)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listarClientes() {
        return List.copyOf(clientes);
    }
}
