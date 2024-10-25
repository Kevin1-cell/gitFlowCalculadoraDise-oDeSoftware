import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numUno = validarNumeros(sa);

        System.out.println("Ingrese un numero");
        int numDos = validarNumeros(sa);

        int suma = numUno + numDos;
        int resta = numUno - numDos;
        float division = (float) numUno / numDos; // Asegúrate de hacer la división como float
        int modulo = numUno % numDos;
        int producto = numUno * numDos;

        System.out.println("Suma: " + suma +
                           "\nResta: " + resta +
                           "\nDivision: " + division +
                           "\nModulo: " + modulo +
                           "\nMultiplicación: " + producto);
    }

    public static int validarNumeros(Scanner sa) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog("Ingrese un número mayor o igual a 0"); // Cambia a showInputDialog
            numero = Integer.parseInt(input); // Convierte la entrada en un entero
            if (numero < 0) {
                System.out.println("Ingrese un número válido."); // Mensaje de error si el número es negativo
            }
        } while (numero < 0); // Repetir hasta que se ingrese un número válido
        return numero; // Devuelve el número válido
    }
}
