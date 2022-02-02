package IMC;

public class IMC2 extends ClassIMC {
	
	private Double imcm;
	
	public IMC2 (Integer semana, Double altura,Double pesoI,Double pesoAtual, Double imcm) {
		super(semana, altura, pesoI,pesoAtual);
		this.imcm = imcm;
		
	}

	public double getImcm() {
		return imcm;
	}

	public void setImcm(Double imcm) {
		this.imcm = imcm;
	}
	public Double getImc2() {
		Double Imc2 = getPesoI() / (getAltura()*getAltura());
		if(Imc2<18.5) {
			System.out.println("\nVoc� est� com baixo peso! \nO ganho esperado se for multipla/n�o, � de 12 a 18kg");
		}else if(Imc2>18.5 && Imc2<24.9) {
			System.out.println("\nVoc� est� com Adequado! \nO ganho esperado � de 11 a 15kg \nO ganho esperado se for gesta��o multipla � de 16 a 24kg");
		}else if(Imc2>25.0 && Imc2<29.9) {
			System.out.println("\nVoc� est� com sobrepeso! \nO ganho esperado � de 7 a 11kg \nO ganho esperado se for gesta��o multipla � de 14 a 23kg");
		}else if(Imc2>30){
			System.out.println("\nVoc� est� com obesidade! \nO ganho esperado � de 5 a 9kg \nO ganho esperado se for gesta��o multipla � de 11 a 19kg");
		}
		return Imc2;
	}
}
