package teste;

import modelo.Carro;
import modelo.GerenciadorVeiculos;

public class Main {
    static void main() {
        GerenciadorVeiculos gerenciadorVeiculos = new GerenciadorVeiculos();
        Carro carro = new Carro("H12-209", "carro", "HILUX", "TOYOTA",2020, 4);
        gerenciadorVeiculos.adicionarVeiculo(carro);
        System.out.println(gerenciadorVeiculos.calcularAluguel(carro));
    }
}
