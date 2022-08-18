package lista2;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float vetor[] = new float[3];
		float soma = 0;
		
		for (int i = 0; i <3; i++) {
			System.out.println("Escreva a nota "+(i+1));
			vetor[i] = scan.nextFloat();
			soma = soma + vetor[i];
		}
		
		float media = soma/3;
		
		if (media < 7) {
			System.out.println("Reprovado");
		}else if (media <10) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Aprovado com Distinção");
		}
		
		scan.close();

	}

}
