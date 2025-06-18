/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor.e.matriz;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class teste2 {
    public static void main(String[] args) {
        
        Scanner naosei = new Scanner(System.in);
        String [] Nome = new String[4];
        String [] Sobrenome = new String [4];
        
    for (int i = 0; i < Nome.length; i++)
    {
        System.out.println("Digite 4 nomes " + (i) + ": ");
    Nome [i] = naosei.nextLine();
    }
    
        System.out.println("\nNomes armazenados:");
        for (int i = 0; i < Nome.length; i++)
        {
            System.out.println(Nome [i]);
        }
    for (int j = 0; j < Sobrenome.length; j++ )
    {
        System.out.println("Digite 4 sobrenomes " + (j) + ": ");
        Sobrenome [j] = naosei.nextLine();
    }
    
        System.out.println("\nSobrenomes armazenados: ");
        for (int i = 0; i < Sobrenome.length; i++)
        {
            System.out.println(Sobrenome [i]);
        }        
        
        for (int z = 0; z < Nome.length; z++)
        {
            System.out.println("seu nome é: " +Nome[z]+ " "+Sobrenome[z]);
        }
}
    }