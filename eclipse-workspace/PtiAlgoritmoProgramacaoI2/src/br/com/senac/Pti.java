package br.com.senac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Pti {
	
	// Teste se em ordem crescente ou não
	static int ordemCrescente (int[]vetor,int tamanho) {
		for(int i=1;i<vetor.length;i++) {
			if(vetor[i-1]>vetor[i]) {
				return 0;}
		}return 1;		
	}	

	static int tamanho (int numero) {//Solicita a entrada do tamanho do vetor.
		Scanner c = new Scanner(System.in);
		int tamanho = c.nextInt();
		return tamanho;
	}

	public static int diferenca (int[]vetor, int menor, int aux, int maior, int diferenca) {
		//Verifica o maior e menor valor, além da diferença entre eles.
		maior=vetor[0];
		for(int i=1; i<vetor.length;i++) {
			if(vetor[i]>maior) {
				maior=vetor[i];
			}
		}
		menor=vetor[0];
		for(int j=1; j <vetor.length;j++) {
			if(vetor[j]<maior && vetor[j]<menor) {
				menor=vetor[j];
			}
		}
		System.out.println("maior número: "+ maior);
		System.out.println("menor número: "+ menor);
		System.out.println("Maior diferença: "+ (maior-menor));
		return diferenca;	
	}
		//Classe principal
	public static void main(String[] args) {
		boolean n = false;
		Scanner c = new Scanner(System.in);
		System.out.print("Digite o tamanho do vetor: ");
		int vetor[] = new int [tamanho(0)];

		//Alimenta através de entrada do usuário, as posições do vetor.
		for(int i=0; i <vetor.length; i++) {
			System.out.print("Digite um número inteiro: ");	
			vetor[i]=c.nextInt();					
		}

		System.out.println("Vetor: " + Arrays.toString(vetor));
		//Chamada do método que  verifica qual o maior, menor e a diferença entre os valores.
		diferenca(vetor, 0, 0,0, 0);
		
		//Chamada do método que testa se o vetor está em ordem crescente e retorna true ou false
		if(ordemCrescente(vetor, 0)==0){
			System.out.println("O vetor está em ordem crescente? " + n);
		}else {System.out.println("O vetor está em ordem crescente? " + !n);}
	}

}


