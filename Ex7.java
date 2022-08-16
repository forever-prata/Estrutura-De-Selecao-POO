package lista2;

import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n1 = scan.nextInt();
		
		int maior = n1;
		int segundo = 0;
		int ultimo=0;
		
		System.out.println("Digite um número");
		int n2 = scan.nextInt();
		
		if (n2>maior) {
			
			segundo=maior;
			maior=n2;
			
			
		}else {
			
			segundo=n2;
			
		}
		
		System.out.println("Digite um número");
		int n3 = scan.nextInt();
		
		if (n3>maior) {
			
			ultimo=segundo;
			segundo=maior;
			maior=n3;
			
		}else if (n3>segundo) {
			
			ultimo = segundo;
			segundo = n3;
			
		}else {
			
			ultimo = n3;
			
		}
		
		System.out.println(maior+" "+segundo+" "+ultimo);
		
		scan.close();

	}

}
