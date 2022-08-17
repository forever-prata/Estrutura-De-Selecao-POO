package lista2;

import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor da hora");
		float valHora = scan.nextFloat();
		
		System.out.println("Digite a quantidade de horas trabalhadas");
		int horas = scan.nextInt();
		
		float salarioBruto = valHora * horas;
		
		float ir = 0;
		
		if (salarioBruto <= 900 ) {
			ir = 0; 
		}else if (salarioBruto<=1500) {
			ir = (float) (salarioBruto * 0.05);
		}else if (salarioBruto<=2500) {
			ir =  (float) (salarioBruto * 0.10);
		}else {
			ir = (float) (salarioBruto * 0.20);
		}
		
		float inss = (float) (salarioBruto * 0.10);
		float fgts = (float) (salarioBruto * 0.11);
		
		float salarioLiquido = salarioBruto-ir-inss;
		
		System.out.println("Salario Bruto = R$"+salarioBruto);
		System.out.println("----------------------");
		System.out.println("Descontos");
		System.out.println("IR = R$"+ir);
		System.out.println("INSS = R$"+inss);
		System.out.println("FGTS = R$"+fgts);
		System.out.println("Total = R$"+(inss+ir));
		System.out.println("----------------------");
		System.out.println("Salario liquido = R$"+salarioLiquido);
		
		scan.close();
	}

}
