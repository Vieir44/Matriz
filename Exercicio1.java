package ExerciciosMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int par[][] = new int [5][5];
		
		for(int i=0; i<4; i++) {
			for( int j=0; j<4; j++) {
				par[i][j] = (int)Math.round(Math.random()*100);
				if (par[i][j] % 2 == 0) {
					System.out.println(par[i][j]);
					
				}
			}
		}
			

	}

}
