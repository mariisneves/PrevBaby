package application;

import java.util.Scanner;

public class Pressao{
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		Geral geral = new Geral (0, 0, 0, 0);
		BaseSis basesis = new BaseSis(0, 0, 0, 0);
		BaseDis basedis = new BaseDis(0, 0 , 0 , 0);
		
		
		
		System.out.printf("Informe em qual semana de gest�o est�: ");
		geral.semana = leia.nextFloat();				
		
		System.out.printf("Considerando sua press�o habitual, Informe sua press�o sist�lica: ");
		basesis.ind1 = leia.nextFloat();
		
		System.out.printf("Considerando sua press�o habitual, Informe sua press�o diast�lica:");
		basedis.ind1 = leia.nextFloat();
		
		
		System.out.printf("Informe sua press�o sist�lica atual: ");
		basesis.ind2 = leia.nextFloat();
		
		System.out.printf("Informe sua press�o diast�lica atual: ");
		basedis.ind2 = leia.nextFloat();
		
	
		basesis.trimestre();
		basesis.imprimir();
		
		basedis.trimestre();
		basedis.imprimir();
		
	
  }
}
