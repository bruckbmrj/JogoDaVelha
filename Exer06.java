/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_labs;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char[][] jogoVelha = new char[3][3];
        
        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;
        
        while(!ganhou){
            
            if (jogada % 2 == 1) { //jogador 1
                System.out.println("Vez do jogador 1. Escolha linhae coluna (1-3). ");
                sinal = 'X';
            }else{ //jogador 2
                System.out.println("Vez do jogador 2. Escolha linhae coluna (1-3). ");
                sinal = 'O';
            }
            //continua a logica
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Entre com a linha (1,2 ou 3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else{
                    System.out.println("Entrada invalida, tente novamente.");
                }
            }
            
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1,2 ou 3) ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else{
                    System.out.println("Entrada invalida, tente novamente.");
                }
            }
            
            
            
        }
                
    }
}
