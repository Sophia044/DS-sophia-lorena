/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laçoserepetições;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class ex11 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        int N;
        do {
            // Ler o valor de N
            System.out.print("Digite um valor para N (maior que zero): ");
            N = scanner.nextInt();

            // Verificar se N é maior que zero
            if (N <= 0) {
                System.out.println("Valor inválido! N deve ser maior que zero.");
            }
        } while (N <= 0); // Repetir enquanto N não for maior que zero

        // Laço for para imprimir os valores de 1 a N
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
