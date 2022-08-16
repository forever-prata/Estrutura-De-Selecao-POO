package lista2;

import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu turno (M, V, N)");
		String turno = scan.nextLine().toUpperCase();
		
		if (turno.equals("M")) {
			System.out.println("Bom dia");
		}else if (turno.equals("V")) {
			System.out.println("Boa tarde");
		}else if (turno.equals("N")) {
			System.out.println("Boa noite");
		}else {
			System.out.println("Entrada inválida");
		}
		
		scan.close();

	}

}
