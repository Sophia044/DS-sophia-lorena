/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex2 {
     public static void main(String[] args) {
        
        
        Scanner calculo = new Scanner(System.in);
        System.out.println("Escreva a quantidade combustivel: ");
        int combustivel = calculo.nextInt();  
        System.out.println("Escreva o km percorrido: ");
        int kmpercorrido = calculo.nextInt();
        
        
        int TotalGasto = combustivel / kmpercorrido;
        System.out.println("O consumo medio de Litros por km é: "+ TotalGasto);
    }
}
