package lista2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário");
		float salarioAntigo = scan.nextFloat();
		
		float salarioNovo = 0;
		int porcentagem = 0;
		
		if (salarioAntigo <= 280) {
			salarioNovo = (float) (salarioAntigo + (salarioAntigo*0.2));
			porcentagem=20;
		}else if (salarioAntigo < 700) {
			salarioNovo = (float) (salarioAntigo + (salarioAntigo*0.15));
			porcentagem=15;
		}else if (salarioAntigo < 1500) {
			salarioNovo = (float) (salarioAntigo + (salarioAntigo*0.1));
			porcentagem=10;
		}else {
			salarioNovo = (float) (salarioAntigo + (salarioAntigo*0.05));
			porcentagem=5;
		}
		
		System.out.println("Salário antigo: "+salarioAntigo);
		System.out.println("Salario novo: "+salarioNovo);
		System.out.println(porcentagem+"% de acréssimo");
		
		scan.close();

	}

}
