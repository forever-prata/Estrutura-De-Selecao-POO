package lista2;

import java.util.Scanner;
public class Ex27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qualquer número");
		float num = scan.nextFloat();
		
		if (num%1 ==0) {
			System.out.println("É inteiro");
		}else {
			System.out.println("É decimal");
		}
		
		scan.close();
			
	}

}
