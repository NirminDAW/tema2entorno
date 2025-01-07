/**
 *
 * @author Nirmin
 */
import java.util.Scanner;

public class CalculadoraPrecio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Es usted cliente frecuente? (true/false): ");
        boolean esClienteFrecuente = scanner.nextBoolean();

        double precioOriginal = 100.0;
        double precioFinal;

        if (esClienteFrecuente) {
            precioFinal = precioOriginal * 0.9;
        } else {
            precioFinal = precioOriginal;
        }

        System.out.println("El precio final es: " + precioFinal);

        scanner.close();
    }
}
