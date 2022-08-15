package lista2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = scan.nextInt();
		
		if (num%2 == 0) {
			
			num = num+1;
			System.out.println("O numero era par e agora é impar");
			
		}else {
			
			num = num+1;
			System.out.println("O numero era impar e agora é par");
			
		}
		
		System.out.println(num);
		
		scan.close();
		
	}

}
