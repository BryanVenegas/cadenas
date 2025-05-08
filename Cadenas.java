
import java.util.Scanner;

public class Cadenas {
public static void main(String[] args) {
    // Ejercicio 1: Crear un programa que pida al usuario su nombre y apellido y los imprima en la consola.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Introduce tu apellido: ");
    String apellido = scanner.nextLine();
    System.out.print("Introduce tu apellido parterno: ");
    String apellido2 = scanner.nextLine();
    System.out.print("tu nombre es: "+ nombre + " " + apellido + " " + apellido2 +"\n");
}


    
}