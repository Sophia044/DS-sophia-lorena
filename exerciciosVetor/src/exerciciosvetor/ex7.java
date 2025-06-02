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
public class ex7 {
    public static void main(String[] args) {
         Scanner Entrada = new Scanner(System.in);
        int[] Numeros = new int[10];
        float Soma = 0;
        System.out.println("Insira os numeros:");
        for(int i = 0; i < Numeros.length; i++)
        {
            Numeros[i] = Entrada.nextInt();
            Soma+=Numeros[i];
            
        }
        System.out.println(Soma);
        float Media = Soma/10;
        System.out.println("A media dos valores inseridos e igual a :"+Media);
    }
}
