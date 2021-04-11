package br.com.erickfreire.padraodetabuleirodedamascomasteriscos2;


/**
 * Programa em Java que apresenta um padrão de tabuleiro de damas com asteriscos
 * @author Erick Freire
 * @version 1 - Criado em 11-04-2021 as 19:20
 */

public class PadraoDeTabuleiroDeDamasComAsteriscos2 {
	public static void main(String[] args) {
		
		int contador = 1;
		int contador2 = 1;
		
		while(contador <= 8) {
			
			while(contador2 <= 8) {
				if(contador % 2 == 1) {
					System.out.print("*");
					System.out.print(" ");
				} else {
					System.out.print(" ");
					System.out.print("*");
				}
				contador2++;
			}
			
			contador2 = 1;
			System.out.println();
			contador++;
		}
		
	}

}
