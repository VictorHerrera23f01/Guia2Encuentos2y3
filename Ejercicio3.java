/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 

Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 
*/
package Guia2Encuentros2y3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        System.out.print("Ingrese Una Frase: ");
        frase = teclado.next();
        
        System.out.println("La Frase Toda En Minusculas Es: " + frase.toLowerCase());
        System.out.println("La Frase Toda En Mayusculas Es: " + frase.toUpperCase());
        teclado.close();
    }
}
