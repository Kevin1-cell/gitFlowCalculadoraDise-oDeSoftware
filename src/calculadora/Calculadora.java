
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Kevin Santiago Aguirre Giraldo
 * @date 25 de Octubre de 2024
 */
public class Calculadora {

   
    public static void main(String[] args) {
        
        Scanner sa = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int numUno = sa.nextInt();
        
        System.out.println("Ingrese un numero");
        int numDos = sa.nextInt();
        
        int suma = numUno + numDos;
        int resta = numUno - numDos;
        float divicion = numUno / numDos;
        int modulo = numUno % numDos;
        int producto = numUno * numDos;
        
        System.out.println("Suma "+suma+"\nResta "+resta+"\nDivision "+divicion+"\nModulo "+modulo+"\nMultiplicación "+producto);
        
    }
    
}
