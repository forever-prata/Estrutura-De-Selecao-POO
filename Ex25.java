package lista2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor entre 10 e 600 reais");
		int numero = scan.nextInt();
		
		if (numero>600 || numero<10) {
			System.out.println("Valor inválido");
		}else {
			
			if (numero/100 != 0) {
				int notaCem = numero/100;
				System.out.println("Notas de R$100 = "+notaCem);
				numero = numero - notaCem*100;
			}
			
			if (numero/50 != 0) {
				int notaCinquenta = numero/50;
				System.out.println("Notas de R$50 = "+notaCinquenta);
				numero = numero - notaCinquenta*50;
			}
			
			if (numero/10 != 0) {
				int notaDez = numero/10;
				System.out.println("Notas de R$10 = "+notaDez);
				numero = numero - notaDez*10;
			}
			
			if (numero/5 != 0) {
				int notaCinco = numero/5;
				System.out.println("Notas de R$50 = "+notaCinco);
				numero = numero - notaCinco*5;
			}
			
			System.out.println("Notas de R$1 = "+numero);
		}
		
		scan.close();

	}

}
