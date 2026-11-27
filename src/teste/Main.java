package teste;

import modelo.*;
import service.GerenciadorCliente;
import service.GerenciadorVeiculos;

import java.time.LocalDate;

public class Main {
    static void main() {
        GerenciadorVeiculos gerenciadorVeiculos = new GerenciadorVeiculos();
        Carro carro = new Carro("H124209", "Carro", "Mercedes", "Rico", 2020,20);
        gerenciadorVeiculos.adicionarVeiculo(carro);
        System.out.println(gerenciadorVeiculos.calcularAluguel(carro));
        System.out.println(carro);
        System.out.println();
        Moto moto = new Moto("KDA312S", "Moto", "Honda", "CJ", 2022, 7);
        gerenciadorVeiculos.adicionarVeiculo(moto);
        System.out.println(gerenciadorVeiculos.calcularAluguel(moto));
        System.out.println(moto);
        System.out.println();
        Camionete camionete = new Camionete("DAS2123", "Camionete", "Toyta", "SW4", 2020, 20);
        gerenciadorVeiculos.adicionarVeiculo(camionete);
        System.out.println(gerenciadorVeiculos.calcularAluguel(camionete));
        System.out.println(camionete);
        System.out.println();
        Caminhao caminhao = new Caminhao("FBS3453", "Caminhão", "Volks", "A30", 2025,20);
        gerenciadorVeiculos.adicionarVeiculo(caminhao);
        System.out.println(gerenciadorVeiculos.calcularAluguel(caminhao));
        System.out.println(caminhao);

        System.out.println();


        GerenciadorCliente gerenciadorCliente = new GerenciadorCliente();
        Cliente cliente = new Cliente("Matheus","Rosa", LocalDate.of(2000, 5, 10), "04903206009", "67821509566");
        System.out.println(cliente);
        gerenciadorCliente.adicionarCliente(cliente);
        gerenciadorCliente.buscarPorCpf("04903206009");
        gerenciadorCliente.listarClientes();
    }
}
