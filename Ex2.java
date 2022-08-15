package lista2;

import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		if (n == 0) {
			System.out.println("O número digitado foi zero");
		}else if (n%2 == 0) {
			System.out.println("O número digitado era par");
		}else {
			System.out.println("O numero digitado era impar");
		}
		
		scan.close();
		
	}
}
