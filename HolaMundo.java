
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Santiago Vanegas!");

        System.out.print("cuanto es 1+1? ");
        System.out.print(2);
        System.out.printf("Aqui va una cadena: %s %n", "santiago");

        System.out.println("ingrese un numero entero: ");
        var entrada = new Scanner(System.in);
        var entero = entrada.nextInt();
        
        System.out.println("su numero es: "+entero);


        entrada.close();
        
    }
}