package lista2;

import java.util.Scanner;
public class Ex31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qntTotal = 0;
		
		System.out.println("Digite a quantidade de kilos de morango");
		int qntMorango = scan.nextInt();
		qntTotal = qntTotal + qntMorango;
		float precoMorango = 0;
		
		if (qntMorango > 5 ) {
			precoMorango = (float) (qntMorango*2.2);
		}else {
			precoMorango = (float) (qntMorango*2.5);
		}
		
		System.out.println("Digite a quantidade de kilos de maçã");
		int qntMaca = scan.nextInt();
		qntTotal = qntTotal + qntMaca;
		float precoMaca = 0;
		
		if (qntMaca > 5 ) {
			precoMaca = (float) (qntMaca*1.5);
		}else {
			precoMaca = (float) (qntMaca*1.8);
		}
		
		float total = precoMaca+precoMorango;
		
		if (qntTotal > 8 || total > 25) {
			total = (float) (total - (total*0.10));
		}
		
		System.out.println("Total = "+total);
		
		scan.close();

	}

}
