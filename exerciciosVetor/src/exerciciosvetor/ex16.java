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
public class ex16 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[20];
        
        System.out.println("Insira os numeros no vetor:");
        
        for(int i  = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        System.out.println("Escolha um numero para procurar dentro do vetor:");
        int Numero_Escolhido = Entrada.nextInt();
        boolean Numero_Encontrado = false; 
       for(int i = 0; i < Numeros.length; i++)
       {
           if(Numero_Escolhido == Numeros[i])
           {
               Numero_Encontrado = true;
               System.out.println("O numero "+Numero_Escolhido+" foi encontrado na posicao "+i);
               break;
           }
       }
    }
}
