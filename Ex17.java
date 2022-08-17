package lista2;

import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int n2 = scan.nextInt();
		
		float media = (n1+n2)/2;
		
		if (media <= 4 ) {
			System.out.println("E");
		}else if (media <= 6 ) {
			System.out.println("D");
		}else if (media <= 7.5 ) {
			System.out.println("C");
		}else if (media <= 9 ) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
		
		
		scan.close();
		
	}

}
