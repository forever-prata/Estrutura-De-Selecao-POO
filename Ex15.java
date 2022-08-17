package lista2;

import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço: ");
		
		float preco = scan.nextInt();
		
		System.out.println("Digite o codigo: ");
		
		int codigo = scan.nextInt();
		
		
		if (codigo == 1) {
			System.out.println("Sul");
		}else if (codigo == 2) {
			System.out.println("Norte");
		}else if (codigo == 3) {
			System.out.println("Leste");
		}else if (codigo == 4) {
			System.out.println("Oeste");
		}else if (codigo == 5|| codigo == 6) {
			System.out.println("Nordeste");
		}else if (codigo == 7 || codigo == 8) {
			System.out.println("Centro-Oeste");
		}
		
		System.out.print("R$"+preco);
		
		scan.close();
		
	}

}
