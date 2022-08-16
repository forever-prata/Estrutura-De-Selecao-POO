package lista2;

import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura");
		float altura = scan.nextFloat();
		
		System.out.println("Digite o peso");
		float peso = scan.nextFloat();
		
		scan.nextLine();
		
		System.out.println("Digite o sexo");
		String sexo = scan.nextLine().toUpperCase();
		
		double pesoIdeal = 0;
		
		if (sexo.equals("F")) {
			pesoIdeal = ((62.1*altura) - 44.7);
		}else if (sexo.equals("M")) {
			pesoIdeal = ((72.7*altura) - 58);
		}
		
		if (peso == pesoIdeal) {
			System.out.println("Está no peso ideal");
		}else if (peso < pesoIdeal) {
			System.out.println("Está abaixo do peso");
		}else {
			System.out.println("Está acima do peso");
		}
		
		System.out.println(altura+" "+peso+" "+sexo);
		System.out.println("Peso ideal = "+pesoIdeal);
		
		scan.close();
		
	}

}
