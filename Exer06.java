/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_labs.JogoDaVelha;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exer06 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        JogoDaVelha jogodaVelha = new JogoDaVelha();
        
        System.out.println("Jogador 1 = X ");
        System.out.println("Jogador 2 = O ");
        
        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;
        
        while (!ganhou) {
            if (jogodaVelha.vezJogador1()) {
                
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3). ");
                sinal = 'X';
            } else{
                System.out.println("vez do jogador 2. Escolha linha e coluna (1-3). ");
                sinal = 'O';
            }
            
            linha = valor("linha", scan);
            coluna = valor("coluna", scan);
            
        if(!jogodaVelha.validarJogada(linha, coluna, sinal)){
            System.out.println("Posição ja usada, tente novamente.");
        }
            
            jogodaVelha.imprimirTabuleiro();
            
            if (jogodaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            }else if (jogodaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            }else if (jogodaVelha.getJogada() > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
            
        }
    }
    
    static int valor(String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a "+ tipoValor +" (1,2,3) ");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else{
                System.out.println("Entrada invalida, tente novamente. ");
            }
        }
        valor--;
        return valor;
    }

}
