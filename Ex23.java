package lista2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[3];
		int soma = 0;
		
		for (int i = 0; i <3; i++) {
			System.out.println("Escreva a idade do "+(i+1)+" aluno");
			vetor[i] = scan.nextInt();
			soma = soma + vetor[i];
		}
		
		float media = soma/3;
		
		if (media < 25) {
			System.out.println("Turma jovem");
		}else if (media <= 40) {
			System.out.println("Turma Adulta");
		}else {
			System.out.println("Turma Idosa");
		}
		
		scan.close();

	}

}
