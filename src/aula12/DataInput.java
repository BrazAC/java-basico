package aula12;
import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Insira texto: ");
		String armazen = scan.nextLine();
		
		System.out.println("Texto inserido: " + armazen);
		
		System.out.println("Insira seu nome: ");
		String primeiroNome = scan.next();
		System.out.println("Primeiro nome: " + primeiroNome);
		*/
		System.out.println("Insira seu nome completo, idade, altura se namora: ");
		
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		//float altura = scan.nextFloat();
		//boolean namora = scan.nextBoolean();
		
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		//System.out.println("Altura: " + altura);
		//System.out.println("Namora: " + namora);
		
	}

}
