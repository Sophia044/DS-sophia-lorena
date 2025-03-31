/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        double maior = Double.MIN_VALUE;
        
        System.out.println("Digite 10 números:");
        
        while (contador <= 10) {
            System.out.print("Número " + contador + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > maior) {
                maior = numero;
            }
            
            contador++;
        }
        
        System.out.println("\nO maior número digitado foi: " + maior);
        scanner.close();
    }
   
           
}
