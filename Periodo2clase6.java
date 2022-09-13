import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // programa Java para demostrar el uso de un
    // string para controlar una declaración switch
    String str = "dos";
    switch(str)
    {   
      case "uno":
         System.out.print("uno");
         break; 
      case "dos":
         System.out.print ("dos");
         break;
      case "tres":
         System.out.print ("tres");
         break;
      default:
        System.out.print ("no coincide");
        }
    }
}