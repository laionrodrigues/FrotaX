package teste;

import modelo.Carro;
import modelo.GerenciadorVeiculos;
import modelo.Moto;
import modelo.Veiculo;

public class Main {
    static void main() {
        GerenciadorVeiculos gerenciadorVeiculos = new GerenciadorVeiculos();
        Carro carro = new Carro("H12-209", "carro", "HILUX", "TOYOTA",2020, 6);
        gerenciadorVeiculos.adicionarVeiculo(carro);
        System.out.println(gerenciadorVeiculos.calcularAluguel(carro));
        System.out.println(carro);

        Moto moto = new Moto("KDA-12S", "moto", "CJ", "Honda", 2022,7);
        gerenciadorVeiculos.adicionarVeiculo(moto);
        System.out.println(gerenciadorVeiculos.calcularAluguel(moto));
        System.out.println(moto);

    }
}
