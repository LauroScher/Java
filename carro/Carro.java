
package carro;

public class Carro {

    public static void main(String[] args) {
      Car c = new Car();
      c.cor = "Prata";
      c.modelo = "gol";
      c.km = 0;

      c.status();
      c.km();
    }
    
}
