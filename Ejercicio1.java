/*Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. El programa deberá después mostrar 
el resultado de la suma
 */
package Guia2Encuentros2y3;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[]args){
        Scanner teclado=new Scanner(System.in);
        int num1, num2, resultado;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese El Segundo: ");
        num2 = teclado.nextInt();
        resultado = num1 + num2;
        
        System.out.println("El Resultado De La Suma Es De: "+resultado);
        teclado.close();
    }
}