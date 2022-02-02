package application;

import java.util.Scanner;

public class Pressao{
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		Geral geral = new Geral (0, 0, 0, 0);
		BaseSis basesis = new BaseSis(0, 0, 0, 0);
		BaseDis basedis = new BaseDis(0, 0 , 0 , 0);
		
		
		
		System.out.printf("Informe em qual semana de gestão está: ");
		geral.semana = leia.nextFloat();				
		
		System.out.printf("Considerando sua pressão habitual, Informe sua pressão sistólica: ");
		basesis.ind1 = leia.nextFloat();
		
		System.out.printf("Considerando sua pressão habitual, Informe sua pressão diastólica:");
		basedis.ind1 = leia.nextFloat();
		
		
		System.out.printf("Informe sua pressão sistólica atual: ");
		basesis.ind2 = leia.nextFloat();
		
		System.out.printf("Informe sua pressão diastólica atual: ");
		basedis.ind2 = leia.nextFloat();
		
	
		basesis.trimestre();
		basesis.imprimir();
		
		basedis.trimestre();
		basedis.imprimir();
		
	
  }
}
