/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20_labs.JogoDaVelha;

/**
 *
 * @author Bruno
 */
public class JogoDaVelha {
    char[][] jogoVelha;
    int jogada;

    public JogoDaVelha() {
       char[][] jogoVelha = new char[3][3];
       jogada = 1;
    }
    
    
    
    boolean validarJogada(int linha, int coluna, char sinal){
        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
            return false;
        } else{ //jogada valida
            jogoVelha[linha][coluna] = sinal;
            return true;
        }
    }
    
        void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println( );
        }
    }
    
}
