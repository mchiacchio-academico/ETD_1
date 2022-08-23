package Questao1;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class questao1 {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);
		questao1 bb = new questao1();
		int numeros[] = gerarNum(10);
		System.out.println(Arrays.toString(numeros));
		int valor, posicao=-1;
		boolean encontrarValor=false;
		System.out.println("Entre com o valor que deseja encontrar: ");
		valor=ler.nextInt();
		int i=0;
		while(i<10 && encontrarValor==false) {
			if(numeros[i]==valor) {
				encontrarValor=true;
			}
			i++;
		}
		if(encontrarValor==false) {
		System.out.println("Valor nao encontrado no vetor.");
		}
		else{
			posicao=i;
			System.out.println("Valor encontrado na posicao: "+posicao);
		}
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