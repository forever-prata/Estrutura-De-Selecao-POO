package lista2;

import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite uma data no formato dd/mm/aaaa");
			System.out.println("Digite o dia");
			int dia = scan.nextInt();
			
			System.out.println("Digite o mês");
			int mes = scan.nextInt();
			
			System.out.println("Digite o ano");
			int ano = scan.nextInt();
			
			if (dia>0&&dia<31&&mes>0&&mes<12&&ano>0) {
				System.out.println("Data válida");
			}else {
				System.out.println("Data inválida");
			}
			
			scan.close();

	}

}
