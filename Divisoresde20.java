/**
 *
 * @author Nirmin
 */
public class Divisoresde20 {
    public static void main(String[] args) {
        int numero = 20;
        int contador = 0;
        
        System.out.println("Los primeros 5 divisores de " + numero + " son:");
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
                contador++;
            }
            
            if (contador == 5) {
                break;
            }
        }
    }
}
