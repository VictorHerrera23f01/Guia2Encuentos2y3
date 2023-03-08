/*
 Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. La fórmula correspondiente 
es: F = 32 + (9 * C / 5).

 */
package Guia2Encuentros2y3;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        float grados,Fahrenheit;
        System.out.print("Ingrese Los Grados Centígrados: ");
        grados = teclado.nextFloat();
        
        Fahrenheit = 32 + (9 * grados / 5);
        
        System.out.println("Expresado En Fahrenheit: " + Fahrenheit);
        teclado.close();
    }
}
