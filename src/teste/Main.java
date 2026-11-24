package teste;

import modelo.*;

public class Main {
    static void main() {
        GerenciadorVeiculos gerenciadorVeiculos = new GerenciadorVeiculos();
        Carro carro = new Carro("H124209", "carro", "HILUX", "TOYOTA",2020, 6);
        gerenciadorVeiculos.adicionarVeiculo(carro);
        System.out.println(gerenciadorVeiculos.calcularAluguel(carro));
        System.out.println(carro);

        Moto moto = new Moto("KDA312S", "moto", "CJ", "Honnda", 2022,7);
        gerenciadorVeiculos.adicionarVeiculo(moto);
        System.out.println(gerenciadorVeiculos.calcularAluguel(moto));
        System.out.println(moto);

        Camionete camionete = new Camionete("DAS2123", "camionete", "SW4", "hilux", 2025, 20);
        gerenciadorVeiculos.adicionarVeiculo(camionete);
        System.out.println(gerenciadorVeiculos.calcularAluguel(camionete));
        System.out.println(camionete);

        Caminhao caminhao = new Caminhao("FBS3453", "caminhão", "MERCEDES", "MERCEDES", 2025, 20);
        gerenciadorVeiculos.adicionarVeiculo(caminhao);
        System.out.println(gerenciadorVeiculos.calcularAluguel(caminhao));
        System.out.println(caminhao);

    }
}
