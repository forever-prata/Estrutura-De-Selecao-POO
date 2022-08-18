package lista2;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = scan.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número inpar");
		}
		
		scan.close();
		
	}

}
