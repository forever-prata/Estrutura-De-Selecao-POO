package lista2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro menor que 1000");
		int num = scan.nextInt();
		
		int centenas = num/100;
		
		int dezenas = (num-centenas*100)/10;
		
		int unidades = (num-(centenas*100)-(dezenas*10));
		
		System.out.println(centenas+" centenas");
		System.out.println(dezenas+" dezenas");
		System.out.println(unidades+" unidades");
		
		scan.close();

	}

}
