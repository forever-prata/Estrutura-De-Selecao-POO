package lista2;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		if (ano%4 ==0) {
			System.out.println("Ano Bissexto");
		}else {
			System.out.println("Ano não bissesxto");
		}
		
		scan.close();
	}
}
