package lista2;

import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int resposta = 0;
		int quantidade = 0;
		double total = 0;
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o tipo de carne");
			System.out.println("(1- Filé Duplo)");
			System.out.println("(2- Alcatra)");
			System.out.println("(3- Picanha)");
			resposta = scan.nextInt();
			
			
			if (resposta == 1) {
				
				System.out.println("Digite a quantidade");
				quantidade = scan.nextInt();
				
				if (quantidade > 5) {
					total = total + (quantidade*5.8);
				}else {
					total = total + (quantidade*4.9);
				}
			}else if (resposta == 2) {
				
				System.out.println("Digite a quantidade");
				quantidade = scan.nextInt();
				
				if (quantidade > 5) {
					total = total + (quantidade*6.8);
				}else {
					total = total + (quantidade*5.9);
				}
			}else if (resposta == 3) {
				
				System.out.println("Digite a quantidade");
				quantidade = scan.nextInt();
				
				if (quantidade > 5) {
					total = total + (quantidade*7.8);
				}else {
					total = total + (quantidade*6.9);
				}
			}else {
				System.out.println("Código inválido");
			}
			
		}
		
		System.out.println("Preço total = "+total);
		System.out.println("Cartão fidelidade? (S ou N)");
		scan.nextLine();
		String fidelidade = scan.nextLine().toUpperCase();
		
		if (fidelidade.equals("S")) {
			total = total - (total*0.05);
			System.out.println("Nomo preço = "+total);
		}else {
			System.out.println("Sem desconto");
		}
		
		scan.close();
	
	}

}
