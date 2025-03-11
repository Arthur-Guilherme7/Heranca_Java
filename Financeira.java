package EadEstatica;

public class Financeira {
    public static double CalcularJurosSimples(double capital, double taxa, int tempo) {
        return capital * taxa * tempo;
    }

    public static double ConverterMoeda(double valor, double taxaCambio) {
        return valor * taxaCambio;
    }
}
