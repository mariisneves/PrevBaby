package Familia44;

public class Glicose {
	
    //atributos
	private int glicose;
	
	//metodo
	
	 public int getGlicose(){
		   return glicose;
 }

	public void setGlicose(int glicose) {
		 this.glicose = glicose;
		
  }
  	public void medirGlicose(int glicose) {	 
  		System.out.print("Informe o valor da Glicose: ");
			
		if(glicose<=91) {
		System.out.println("O valor esta dentro do esperado: "+glicose+" Mg/dl ");
				
	   }else {
		System.out.println("O valor esta fora do esperado: "+glicose+" Mg/dl " );
		
  	}
 }
}


