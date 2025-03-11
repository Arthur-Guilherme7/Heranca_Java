package EadEstatica;

public class MainFinan {
    public static void main(String[] args) {

        double capital = 1000.0;
        double taxa = 0.05;
        int tempo = 2;

        double jurosSimples = Financeira.CalcularJurosSimples(capital, taxa, tempo);
        System.out.println("Juros Simples: " + jurosSimples);


        double valorEmReal = 500.0;
        double taxaCambio = 5.2;

        double valorConvertido = Financeira.ConverterMoeda(valorEmReal, taxaCambio);
        System.out.println("Valor convertido: " + valorConvertido);

    }
}
