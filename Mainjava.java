/**
 *
 * @author Nirmin
 */
import java.util.Scanner;

public class Mainjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, introduce tu edad:");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("¡Ya puedes conducir!");
        } else {
            System.out.println("Aún no puedes conducir.");
        }
        
        scanner.close();
    }
}
