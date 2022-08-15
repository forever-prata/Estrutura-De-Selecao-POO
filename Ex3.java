package lista2;

import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o sexo (F ou M): ");
		String text = scan.nextLine();
		String upper = text.toUpperCase();
		
		if (upper.equals("F")) {
			System.out.println("Feminino");	
		}else if (upper.equals("M")) {
			System.out.println("Masculino");
		}else {
			System.out.println("Não definido no sistema");
		}
		
		scan.close();
		
	}
}
