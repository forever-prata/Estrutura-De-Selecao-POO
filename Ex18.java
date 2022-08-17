package lista2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[3];
		
		for (int i = 0; i <3; i++) {
			System.out.println("Escreva o "+(i+1)+" lado do triangulo");
			vetor[i] = scan.nextInt();
		}
		
		if ((vetor[0]+vetor[1]+vetor[2])/3==vetor[0]) {
			System.out.println("Equilátero");
		}else if (vetor[0]==vetor[1] || vetor[1]==vetor[2] || vetor[0]==vetor[2]) {
			System.out.println("Isóceles");
		}else {
			System.out.println("Escaleno");
		}
		
		scan.close();

	}

}
