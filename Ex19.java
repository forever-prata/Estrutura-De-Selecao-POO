package lista2;

import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(ax²+bx+c) Digite a,b,c da equação");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("Raiz de primeiro grau");
			System.out.println("Desligando....");
		}else {
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int delta = (b*b) - (4*a*c);
			int raiz1 = (int) (((b*-1) + Math.sqrt(delta))/2*a);
			int raiz2 = (int) (((b*-1) - Math.sqrt(delta))/2*a);
			
			if (delta<0) {
				System.out.println("Equação sem raizes");
				System.out.println("Desligando....");
			}else if (delta == 0) {
				System.out.println("Somente uma raiz");
				System.out.println(raiz1);
			}else {
				System.out.println("Duas raizes");
				System.out.println(raiz1);
				System.out.println(raiz2);
			}
			
		}
		
		scan.close();

	}

}
