import java.util.Scanner; //el programa usa la clase Scanner
class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  int numero1; //primero numero a comparar
  int numero2; //segundo numero a comparar

    System.out.println("Escriba el primer entero"); //indicador
    numero1 = entrada.nextInt(); //lee el primer numero del usuario
    System.out.println("Escriba el segundo entero"); //indicador
    numero2 = entrada.nextInt(); //lee el segundo numero del usuario

    if (numero1 == numero2)
      System.out.println("El numero " + numero1 + " es igual a " + numero2);
      
     if (numero1 != numero2)
      System.out.println("El numero " + numero1 + " es distinto a " + numero2);

     if (numero1 < numero2)
      System.out.println("El numero " + numero1 + " es menor a " + numero2);

    if (numero1  > numero2)
      System.out.println("El numero " + numero1 + " es mayor a " + numero2);

    if (numero1 <= numero2)
      System.out.println("El numero " + numero1 + " es menor o igual a " + numero2);

    if (numero1  >= numero2)
      System.out.println("El numero " + numero1 + " es mayor o igual a " + numero2);
  }
}