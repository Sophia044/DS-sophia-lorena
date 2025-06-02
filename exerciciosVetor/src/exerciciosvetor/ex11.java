/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosvetor;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author CAMARGO
 */
public class ex11 {
    public static void main(String[] args) {
         Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        
        
        
        System.out.println("Insira os numeros:");
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
           
            
        }
        
        System.out.println("--------------------------");
        
        Arrays.sort(Numeros);
        for(int i = 0; i < Numeros.length; i++)
        {
            System.out.println(Numeros[i]);
        }
    }
}
