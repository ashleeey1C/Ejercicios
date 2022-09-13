import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int cont1, cont2, x, n;
    float sueldo, gastos;

    cont1 = 0;
    cont2 = 0;
    gastos = 0;
    x = 1;
    System.out.println("Cantidad de empleados: ");
    n = teclado.nextInt();
    while (x<=n) {
      System.out.println("Ingrese el sueldo del empleado: ");
      sueldo = teclado.nextFloat(); 
      if (sueldo <=300) {
        cont1 = cont1 + 1;
      } else {
        cont2 = cont2 + 1;
      }
      gastos = gastos + sueldo;
      x = x + 1;
      
    }
    System.out.println("Cantidad de empleados con sueldo menor o igual a 300: " + cont1);
    System.out.println("Cantidad de empleados con sueldo mayor a 300: " + cont2);
    System.out.println("Gastos total en sueldos: " + gastos);
  }
}