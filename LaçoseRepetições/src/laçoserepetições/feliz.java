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
public class feliz {
    public static void main(String[] args) {
        Scanner batata = new Scanner (System.in);
        System.out.println("Voce gosta da sophia? (sim/nao)");
        String resposta = batata.nextLine().trim().toLowerCase();
        
        
        if (resposta.equals ("sim")) {
            System.out.println("todos gostam :)");
        } else {
            System.out.println("na verdade voce gosta sim :)");
        }
    }
}
