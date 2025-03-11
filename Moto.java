package EadAbstrato;

 class Moto extends Veiculo{

     public Moto(String modelo) {
         super(modelo);
     }

     @Override
     public void acelerar() {
         System.out.println("A moto " + modelo + " está acelerando!");
     }
 }
