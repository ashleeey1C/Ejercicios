import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float nota1, nota2, nota3, promedio;
    System.out.println("Ingrese la primer nota");
    nota1 = entrada.nextFloat ();
    System.out.println("Ingrese la segunda nota");
    nota2 = entrada.nextFloat ();
    System.out.println("Ingrese la tercer nota");
    nota3 = entrada.nextFloat ();
    promedio = (nota1 + nota2 + nota3) / 3;
    System.out.println("El promedio es: " + promedio);
    if (promedio >= 7) {
      System.out.println("Promocionado");
    } else if (promedio >= 4) {
      System.out.println("Regular");
    } else {
      System.out.println("Reprobado");
    }
  }
}