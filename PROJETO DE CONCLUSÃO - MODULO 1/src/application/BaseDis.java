package application;

public class BaseDis extends Geral {

	// @Override
	public BaseDis(double semana, double ind1, double ind2, double trimestre) {
		super(semana, ind1, ind2, trimestre);


	}


	
	public int trimestre()
	{ 
		if (getSemana() <= 14) 
		{
			trimestre = 1.5;
		} 
		else if (getSemana() >= 15 && getSemana() <= 28) 
		{
			trimestre = 3;
		} 
		else if (getSemana() >= 29 && getSemana() <= 42) 
		{
			trimestre = 0;
		}
		return (int) trimestre;
	}
	
	
	public void imprimir() {
		if (getInd2() < (getInd1() - trimestre) - 3) 
		{
			System.out.println("Sua pressão diastólica esta abaixo do esperada para semana");
		} 
		else if (getInd2() > (getInd1() - trimestre) + 3) 
		{
			System.out.println("Sua pressão diastólica esta acima do esperada para semana");
		} 
		else 
		{
			System.out.println("Sua pressão diastólica esta dentro do esperada para semana");
		}

	}

}
