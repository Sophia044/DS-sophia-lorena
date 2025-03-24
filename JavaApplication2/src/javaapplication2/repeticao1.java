/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class repeticao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();
        
        for (int i = 0 ; i <= numero; i++)
        {
            System.out.println("o numero é: " +i);
        }
    }
    
    }

