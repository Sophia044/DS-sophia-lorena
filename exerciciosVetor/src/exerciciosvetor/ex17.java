/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosvetor;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex17 {
    public static void main(String[] args) {
         Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[20];
        System.out.println("Insira os numeros no vetor:");
        
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        
        System.out.println("------------------\nVetor ordenado");
        
        for(int i = 0; i < Numeros.length - 1 ; i++ )
        {
            for(int j = 0; j < Numeros.length - i - 1; j++)
            {
                int temp = Numeros[j];
                Numeros[j] = Numeros[j+1];
                Numeros[j+1] = temp;
            }
        }
        
         for (int num : vetor) {
            System.out.print(num + " ");
        }

    }
}
