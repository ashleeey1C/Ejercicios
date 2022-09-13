import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int altas, bajas, x, nota;

    altas = 0;
    bajas = 0;
    x= 0;
    while (x<=9) {
      System.out.println("Ingrese su nota");
      nota = teclado.nextInt();
      if (nota>=7) {
        altas = altas + 1;
      } else {
        bajas = bajas + 1;
      }
      x = x + 1;
    }
    System.out.println("Cantidad de alumnos con notas mayores o iguales a 7:" + altas);
    System.out.println("Cantidad de alumnos con notas menores a 7:" + bajas);
  }
}