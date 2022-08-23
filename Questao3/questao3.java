package Questao3;

import java.util.Arrays;
import java.util.Random;

import Questao1.busca_sequencial;

public class questao3 {

	public static void main(String[] args) {

		busca_sequencial bb = new busca_sequencial();
		int numeros[] = gerarNum(50);
		System.out.println(Arrays.toString(numeros));

	}

	private static int[] gerarNum(int tamanho) {
		int vetor[]=new int[tamanho];
		Random aleatorio = new Random();
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i]=aleatorio.nextInt(100);
		}
		
		return vetor;
	}

}
