package lista2;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String vetor[] = new String[10];
		String resposta[] = new String[10];
		
		vetor[0]="a";
		vetor[1]="a";
		vetor[2]="b";
		vetor[3]="b";
		vetor[4]="c";
		vetor[5]="c";
		vetor[6]="d";
		vetor[7]="d";
		vetor[8]="e";
		vetor[9]="e";
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a resposta da questão "+i+1);
			resposta[i]= scan.nextLine().toLowerCase();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(resposta[i])) {
				System.out.println("Questão "+i+1+" Correta");
			}else {
				System.out.println("Questão"+i+1+"Errada , (gabarito = "+vetor[i]+")");
			}
		}
		
		scan.close();
	}

}
