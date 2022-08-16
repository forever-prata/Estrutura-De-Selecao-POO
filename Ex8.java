package lista2;

import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int n2 = scan.nextInt();
		
		float media = (n1+n2)/2;
		
		if (media>= 7 ) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		scan.close();
		
	}

}
