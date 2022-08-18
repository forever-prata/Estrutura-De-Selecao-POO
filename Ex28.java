package lista2;

import java.util.Scanner;
public class Ex28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qualquer dois números");
		float num = scan.nextFloat();
		float num2 = scan.nextFloat();
		
		System.out.println("Digite uma operação (+,-,*,/)");
		String operation = scan.nextLine();
		
		float resultado = 0;
		boolean operacao = true;
		
		if (operation.equals("+")) {
			resultado = num+num2;
		}else if (operation.equals("-")) {
			resultado = num-num2;
		}else if (operation.equals("*")) {
			resultado = num*num2;
		}else if (operation.equals("/")) {
			resultado = num/num2;
		}else {
			System.out.println("Operação não definida");
			operacao = false;
		}
		
		if (operacao) {
			
			if (resultado%1 ==0) {
				System.out.println("É inteiro");
			}else {
				System.out.println("É decimal");
			}
			
			if (resultado > 0) {
				System.out.println("Positivo");
			}else {
				System.out.println("Negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
			System.out.println("--------");
			System.out.println(resultado);
		}
		
		
		scan.close();
			
	}

}
