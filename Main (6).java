import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
    double catOp, catAdy, hipotenusa;
    System.out.println("Ingrese el valor de catOp");
    catOp = teclado.nextDouble ();
    System.out.println("Ingrese el valor de catAdy");
    catAdy = teclado.nextDouble ();
    hipotenusa = Math.hypot(catOp, catAdy);
  System.out.println("El valo de la hipotenusa es: " + hipotenusa);
  }
}