package EadAbstrato;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Fusca");
        Veiculo moto = new Moto("XJ6");


        carro.acelerar();
        moto.acelerar();
    }
}
