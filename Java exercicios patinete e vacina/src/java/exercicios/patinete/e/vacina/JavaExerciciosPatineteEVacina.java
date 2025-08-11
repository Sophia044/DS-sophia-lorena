/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.exercicios.patinete.e.vacina;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class JavaExerciciosPatineteEVacina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // número de genes
        int[] genes = new int[N];
        
        // leitura da cadeia genética
        for (int i = 0; i < N; i++) {
            genes[i] = sc.nextInt();
        }
        
        int alvo = sc.nextInt(); // valor genético a ser analisado
        int contagem = 0;

        // contar quantas vezes o valor aparece
        for (int i = 0; i < N; i++) {
            if (genes[i] == alvo) {
                contagem++;
            }
        }

        // verificar o resultado
        if (contagem > 1) {
            System.out.println("Achei o danado");
        } else if (contagem == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }

        sc.close();
    }
    
}
