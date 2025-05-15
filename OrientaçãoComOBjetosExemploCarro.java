/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientaçãocomobjetos.exemplocarro;

/**
 *
 * @author handroyds
 */
public class OrientaçãoComOBjetosExemploCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    package poo_java;
import java.util.Scanner;
public class Carro {

    String Modelo;
    int ano;
    String Cor;
    float potencia;
    int velocidade;
    boolean porta;
    boolean Aberta;
    boolean Fechada;
    
       
    
    void AbrirPorta(){
        porta = Aberta;
        System.out.println(Modelo+"Abriu a porta, atualmente ela está: "+ porta+" o carro nao ligara");
    
    }
    void FecharPorta(){
        if (porta = Aberta){
         porta = Fechada;
        }
        System.out.println("A porta está fechada, pode começar o trajeto.\n");
    
    }
    
    
    void acelerar(){
        
      velocidade += 20;
        System.out.println(Modelo+" Acelerou, velocidade atual "+velocidade+" km/h");
     }
    void frear() {
            if (velocidade >= 10) {
                velocidade -= 10;
            } else {
                velocidade = 0;
            }
            System.out.println("Freando... Velocidade atual:  " + velocidade + " km/h");
        }
    
    
    
   

     
    void exibirInformacoes() {
            System.out.println("Modelo: " + Modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + Cor);
            System.out.println("Velocidade: " + velocidade + " km/h");
    }
    
}
