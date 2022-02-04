package projetoJava;

public class ImcMulti extends Gravidez{
	
	protected int semana;
	protected double altura;
	protected double pesoAtual;
	protected double pesoPre;
	
	public ImcMulti(int semana, double altura, double pesoAtual, double pesoPre) {
		this.semana = semana;
		this.altura = altura;
		this.pesoAtual = pesoAtual;
		this.pesoPre = pesoPre;
	}

	@Override
	public void calculoImc(int semana, double pesoAtual, double pesoPre, double altura) {
		double imc = pesoPre / (altura * altura);
		double ganho = pesoPre - pesoAtual;
		
		if(imc<=24.9) {
			if(ganho>=16 && ganho<=24) {
				System.out.println("Você está com o peso dentro do esperado.");
			} else if(ganho>24) {
				System.out.println("Você está com o peso acima do esperado.");
			} else {
				System.out.println("Você está com o peso abaixo do esperado.");
			}
		} else if(imc<=29.9) {
			if(ganho>=14 && ganho<=23) {
				System.out.println("\nVocê está com o peso dentro do esperado.");
			} else if(ganho>23) {
				System.out.println("\nVocê está com o peso acima do esperado.");
			} else {
				System.out.println("\nVocê está com o peso abaixo do esperado.");
			}
		} else {
			if(ganho>=11 && ganho<=19) {
				System.out.println("\nVocê está com o peso dentro do esperado.");
			} else if(ganho>19) {
				System.out.println("\nVocê está com o peso acima do esperado.");
			} else {
				System.out.println("\nVocê está com o peso abaixo do esperado.");
			}
		}
		
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPesoAtual() {
		return pesoAtual;
	}

	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}

	public double getPesoPre() {
		return pesoPre;
	}

	public void setPesoPre(double pesoPre) {
		this.pesoPre = pesoPre;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	
	
	

}
