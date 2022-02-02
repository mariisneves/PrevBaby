package application;

public class Geral {

	protected double semana;
	protected  double ind1;
	protected  double ind2;
	protected double trimestre;

			
	public Geral (double semana, double ind1, double ind2, double trimestre)
	{ 
		this.semana = semana;
		this.ind1 = ind1;//Normal
		this.ind2 = ind2;//Atual
		this.trimestre = trimestre;		
	}


	public double getSemana() {
		return semana;
	}


	public void setSemana(double semana) {
		this.semana = semana;
	}


	public double getInd1() {
		return ind1;
	}


	public void setInd1(double ind1) {
		this.ind1 = ind1;
	}


	public double getInd2() {
		return ind2;
	}


	public void setInd2(double ind2) {
		this.ind2 = ind2;
	}


	public double getTrimestre() {
		return trimestre;
	}


	public void setTrimestre(double trimestre) {
		this.trimestre = trimestre;
	}

	
	
}
