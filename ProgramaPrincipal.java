package Exercicios;
import java.util.Scanner;
  public class ProgramaPrincipal {
     public static void main(String[] args) {
    	  Scanner entrada = new Scanner(System.in);
          int numero01;
    	  int numero02;
    	 
    	  System.out.println("Informe o primeiro número inteiro: ");
    	 numero01 = entrada.nextInt();
    	 System.out.println("Informe o segundo número inteiro: ");
    	 numero02 = entrada.nextInt();
    	 
    	 
		  int soma = (numero01 + numero02);
		  int subtracao = (numero01-numero02);
		  int multiplicacao = (numero01*numero02);
		  int divisao = (numero01/numero02);
		  
		  System.out.println( numero01+" + "+numero02+" = "+soma);
		  System.out.println( numero01+" - "+numero02+" = "+subtracao);
		  System.out.println( numero01+" x "+numero02+" = "+multiplicacao);
		  System.out.println( numero01+" / "+numero02+" = "+divisao);
		  entrada.close();
	}
}
