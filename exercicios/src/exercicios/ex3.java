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
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("escreva um numero");
        int Numero1 = scanner.nextInt();
        
        System.out.println("Numeros pares de 1 a " +Numero1);
        int i = 1;
        while (i <= Numero1) {
        if (i % 2 ==0){
            System.out.println(i+"");
             
        }
        i++;
    }
        System.out.println("Numeros ímpares de 1 a " +Numero1);
        i=1;
        while (i <= Numero1){
            if (i% 2 != 0){
                System.out.println(i+"");
               
            }
            i++;
        }
    }
    
}
