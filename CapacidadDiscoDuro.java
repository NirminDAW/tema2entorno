/**
 *
 * @author Nirmin
 */
import java.util.Scanner;

public class CapacidadDiscoDuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el tamaño del disco duro en GB
        System.out.println("Ingrese el tamaño del disco duro en gigabytes (GB): ");
        double tamañoGB = scanner.nextDouble();

        // Calcular la capacidad en terabytes (TB) y megabytes (MB)
        double capacidadTB = tamañoGB / 1024;
        double capacidadMB = tamañoGB * 1024;

        // Mostrar los resultados
        System.out.println("Capacidad del disco duro:");
        System.out.println("En terabytes (TB): " + capacidadTB);
        System.out.println("En megabytes (MB): " + capacidadMB);

        scanner.close();
    }
}
