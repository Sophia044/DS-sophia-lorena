/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex8 {
     public static void main(String args[]) {
        
        // TODO code application logic here
        Scanner Idade = new Scanner(System.in);
        System.out.println("Escreva a sua idade :");
        
        int UserIdade = Idade.nextInt();
        
        int Dias;
        int Meses;
        
        Dias = UserIdade * 365;
        Meses = UserIdade * 12;
        System.out.println("Você Tem :"+Dias+" Dias, ou :"+Meses+"Meses, ou :"+UserIdade+" Anos");
        
        
    }
}
