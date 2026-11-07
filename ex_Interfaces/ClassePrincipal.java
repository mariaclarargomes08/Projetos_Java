package ex_Interfaces;

import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int id;
		float combustivel;
		
		System.out.println("Informe o ID do veículo de passeio: ");
		id = entrada.nextInt();
		System.out.println("Informe a quantidade de combustível no tanque: ");
		combustivel = entrada.nextFloat();
		
		VPasseio vec1 = new VPasseio(id, combustivel);
		
		System.out.println("Para abastecer o veículo, informe a quantidade de combustível desejada: ");
		vec1.reabastecer(entrada.nextFloat());
		
		vec1.dirigir();
		
		System.out.println("Informe o ID do veículo SUV: ");
		id = entrada.nextInt();
		System.out.println("Informe a quantidade de combustível no tanque: ");
		combustivel = entrada.nextFloat();
		
		VSUV vec2 = new VSUV(id, combustivel);
		
		System.out.println("Para abastecer o veículo, informe a quantidade de combustível desejada: ");
		vec2.reabastecer(entrada.nextFloat());
		
		vec2.dirigir();
		
		entrada.close();
	}
	
}
