package lista2;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pontos = 0;
		String resposta = "";
		
		System.out.println("Telefonou a vítime?");
		resposta = scan.nextLine().toUpperCase();
		
		if (resposta.equals("S")) {
			pontos = pontos+1;
		}
		
		System.out.println("Esteve no local do crime?");
		resposta = scan.nextLine().toUpperCase();
		
		if (resposta.equals("S")) {
			pontos = pontos+1;
		}
		
		System.out.println("Mora perto da vítima?");
		resposta = scan.nextLine().toUpperCase();
		
		if (resposta.equals("S")) {
			pontos = pontos+1;
		}
		
		System.out.println("Devia para a vítima?");
		resposta = scan.nextLine().toUpperCase();
		
		if (resposta.equals("S")) {
			pontos = pontos+1;
		}
		
		System.out.println("Trabalhou com a vítima?");
		resposta = scan.nextLine().toUpperCase();
		
		if (resposta.equals("S")) {
			pontos = pontos+1;
		}
		
		if (pontos == 5) {
			System.out.println("Assasino");
		}else if (pontos >= 3) {
			System.out.println("Cúmplice");
		}else if (pontos ==2) {
			System.out.println("Suspeito");
		}else {
			System.out.println("Inocente");
		}
		
		scan.close();

	}

}
