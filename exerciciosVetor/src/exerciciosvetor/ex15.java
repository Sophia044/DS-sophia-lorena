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
public class ex15 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        
        System.out.println("Insira os numeros no vetor:");
        
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        System.out.println("-----------------\nNumeros em posicoes impares:");
        
        for(int i  = 0; i < Numeros.length; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(Numeros[i]);
            }
        }
    }
}
