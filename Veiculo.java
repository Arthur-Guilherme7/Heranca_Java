package EadAbstrato;

abstract class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void acelerar();


}
