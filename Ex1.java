package lista2;

import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o proximo número: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			
			System.out.println("O maior número é :"+n1);
			
		}else {
			System.out.println("O maior número é :"+n2);
		}
		
		scan.close();
		
	}

}
