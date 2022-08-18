package lista2;

import java.util.Scanner;
public class Ex30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dige o tipo de combustível (A ou G)");
		String tipo = scan.nextLine().toUpperCase();
		
		if (tipo.equals("A")||tipo.equals("G")) {
			System.out.println("Digite a quantidade em litros");
			int litros = scan.nextInt();
			
			float valor = 0;
			
			if (tipo.equals("A")) {
				valor = (float) (litros*1.9);
			}else if (tipo.equals("G")) {
				valor = (float) (litros*25.5);
			}
			
			System.out.println("Valor total = "+valor);
		}else {
			System.out.println("tipo n definido");
		}
		
		scan.close();
		
	}

}
