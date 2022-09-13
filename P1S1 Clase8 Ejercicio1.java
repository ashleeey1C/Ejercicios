import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    //crea objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in);

    int numero1; //declaracion de variable, primer numero a sumar
    int numero2; //declaracion de variable, segundo numero a sumar
    int suma; //declaracion de variable, suma de numero1 y numero2
      
    System.out.println("Escriba el primer entero");//Indicador 
    numero1 = entrada.nextInt(); //lee el primero numero del usuario
    numero2 = entrada.nextInt(); //lee el segundo numero del usuario

    suma = numero1 + numero2;// suma los numeros, despues almacena el total en la suma

    System.out.println("La suma es " + suma); //muestra la suma
    
  }
}