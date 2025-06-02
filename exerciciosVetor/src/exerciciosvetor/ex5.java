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
public class ex5 {
    public static void main(String[] args) {
          int Quantidade_Pares = 0;
        int Quantidade_Impares = 0;
        Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        System.out.println("Insira os numeros:");
        for(int i = 0; i < Numeros.length; i++ )
        {
            int Numero = Entrada.nextInt();
            if(Numero %2 == 0)
            {
                Quantidade_Pares+=1;
            }
            else{
                Quantidade_Impares +=1;
            }
        }
        
        System.out.println("Foram inseridos "+Quantidade_Pares+" numeros pares");
        System.out.println("Foram inseridos "+Quantidade_Pares+" numeros impares");
    }
}
