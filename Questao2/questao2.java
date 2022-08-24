package Questao2;

import java.util.Random;

public class questao2 {

	public static void main(String[] args) {
		
		Random nmsAleat = new Random();
		
		int matriz[][] = new int[3][4];

		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				matriz[i][j]=nmsAleat.nextInt(100);
			}
		}	
	}
}
