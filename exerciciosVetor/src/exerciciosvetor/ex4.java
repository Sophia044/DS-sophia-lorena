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
public class ex4 {
    public static void main(String[] args) {
          Scanner Entrada = new Scanner(System.in);
        System.out.println("Quantas celulas voce deseja?");
        int Quantidade_Celulas = Entrada.nextInt();
        int[] Numeros = new int[Quantidade_Celulas];
        
        System.out.println("Insira os numeros:");
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        for(int i = Quantidade_Celulas - 1; i >= 0; i--)
        {
            System.out.println(Numeros[i]);
        }
    }
}
