package EadAbstrato;

 class Carro extends Veiculo{

     public Carro(String modelo) {
         super(modelo);
     }

     @Override
     public void acelerar() {
         System.out.println("O carro " + modelo + " está acelerando!");
     }


 }
