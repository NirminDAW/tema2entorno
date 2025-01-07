/**
 *
 * @author Nirmin
 */
public class Numerospares {
    public static void main(String[] args) {
        int count = 0;
        int num = 2; // Empezamos desde el primer número par

        while (count < 5) {
            System.out.println(num);
            num += 2; // Sumamos 2 para obtener el siguiente número par
            count++;
        }
    }
}