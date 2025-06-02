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
public class ex10 {
    public static void main(String[] args) {
         Scanner Entrada = new Scanner(System.in);
        System.out.println("Insira os numeros:");
        
        int[] Numeros = new int[10];
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
        }
        
        System.out.println("-----------------------------");
        
        for(int i = 0; i < Numeros.length; i++)
        {
            if(Numeros[i] < 0)
            {
                Numeros[i] = 0;
                System.out.println(Numeros[i]);
            }
            else{
            System.out.println(Numeros[i]);
            }
        }
    }
}
