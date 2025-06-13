import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        System.out.println("*** GENERADOR DE ID UNICO ***");

        //Se declara la consola
        var consola = new Scanner(System.in);

        //Se declara el random
        var aleatorio = new Random();

        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();

        System.out.println("Ingresa tu año de nacimiento(YYYY): ");
        var anioNacimiento = consola.nextInt();

        var numAleatorio = aleatorio.nextInt(9999);

        System.out.println("Hola " + nombre);

        String ultimosDosNum = Integer.toString(anioNacimiento);
        var sufijos = nombre.substring(0, 2) + apellido.substring(0, 2) + ultimosDosNum.substring(2);


        System.out.printf("""
                \t Tu nuevo numero de identificacion (ID) generado por el sistema es:
                \t %s%04d
                \t Felicidades!
                """, sufijos.toUpperCase(), numAleatorio);
    }
}

