import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float altura, suma, promedio;
    int x, n;

    suma = 0;
    x = 1;
    System.out.println("Ingrese la cantidad de personas a procesar");
    n = teclado.nextInt();
    while (x<=n) {
      System.out.println("ingrese la altura");
      altura = teclado.nextFloat();
      suma = suma + altura;
      x = x + 1;
     }
    promedio = suma / n;
    System.out.println("La altura promedio de las personas es: " + promedio);
  }
}