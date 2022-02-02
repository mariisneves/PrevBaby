package projetoJava;

import java.util.Scanner;

public class classJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;
		double altura,peso;
		
		
		System.out.println("Entre com seu Nome: ");
		nome = leia.nextLine();
		System.out.println("Digite sua Idade: ");
		idade = leia.nextInt();
		System.out.println("Digite sua Altura: ");
		altura = leia.nextDouble();
		System.out.println("Digite seu Peso: ");
		peso = leia.nextDouble();
		
		System.out.printf("\nSeu Nome: %s",nome);
		System.out.printf("\nSua Idade: %d",idade);
		System.out.printf("\nSua Altura é: %f",altura);
		System.out.printf("\nSeu Peso é: %f",peso);
		
		
		
		

	}

}
