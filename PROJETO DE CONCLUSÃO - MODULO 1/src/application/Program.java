package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Sistema de leitura e analise de press�o //
		
		Scanner leia = new Scanner(System.in);
		
		float pressaoNs, pressaoNd, pressaoAs, pressaoAd, semana;
		//pressaoNs = press�o normal sist�lica
		//pressaoNd = press�o normal diast�lica
		//pressaoAs = press�o atual sist�lica
		//pressaoAd = press�o atual diast�lica
		
		System.out.printf("Informe em qual semana de gest�o est�: ");
		semana = leia.nextFloat();				
		
		System.out.printf("Considerando sua press�o habitual, Informe sua press�o sist�lica: ");
		pressaoNs = leia.nextFloat();
		
		System.out.printf("Considerando sua press�o habitual, Informe sua press�o diast�lica:");
		pressaoNd = leia.nextFloat();
		
		
		System.out.printf("Informe sua press�o sist�lica atual: ");
		pressaoAs = leia.nextFloat();
		
		System.out.printf("Informe sua press�o diast�lica atual: ");
		pressaoAd = leia.nextFloat();
		
		
		//--------------------PRIMEIRO TRIMESTRE-----------------------
		
		if (semana <= 14)
		{ 
			if (pressaoAs != pressaoNs)//sist�lica
			{ 
				if (pressaoAs < ((pressaoNs - 1.5)- 3))
				{ 
					System.out.println("Sua press�o sist�lica esta abaixo do esperada para semana");
				}
				else if (pressaoAs > ((pressaoNs - 1.5)+ 3))
				{ 
					System.out.println("Sua press�o sist�lica esta acima do esperada para semana");
				}
				else 
				{ 
					System.out.println("Sua press�o sist�lica esta dentro do esperada para semana");
				}
			}
			
			else 
			{ 
				System.out.println("\nSua press�o sist�lica esta dentro do esperada para semana.");

			}
			
			
			
			
			if (pressaoAd != pressaoNd)//diast�lica
			{ 
				{ 
					if (pressaoAd < ((pressaoNd - 1.5)- 1.5))
					{ 
						System.out.println("Sua press�o diast�lica esta abaixo do esperada para semana");
					}
					else if (pressaoAd > ((pressaoNd - 1.5)+ 1.5))
					{ 
						System.out.println("Sua press�o diast�lica esta acima do esperada para semana");
					}
					else 
					{ 
						System.out.println("Sua press�o diast�lica esta dentro do esperada para semana");
					}
			
		          }	
			}
			
			else 
			{ 
				System.out.println("\nSua press�o diast�lica esta dentro do esperada para semana.");

			}
		}
		
		//--------------------SEGUNDO TRIMESTRE-----------------------
		
		if (semana >= 15 && semana <= 28)
		{ 
			if (pressaoAs != pressaoNs)//sist�lica
			{ 
				if (pressaoAs < ((pressaoNs - 3)- 3))
				{ 
					System.out.println("Sua press�o sist�lica esta abaixo do esperada para semana");
				}
				else if (pressaoAs > ((pressaoNs - 3)+ 3))
				{ 
					System.out.println("Sua press�o sist�lica esta acima do esperada para semana");
				}
				else 
				{ 
					System.out.println("Sua press�o sist�lica esta dentro do esperada para semana");
				}
			}
			
			else 
			{ 
				System.out.println("\nSua press�o sist�lica esta dentro do esperada para semana.");

			}
			
			
			
			
			if (pressaoAd != pressaoNd)//diast�lica
			{ 
				{ 
					if (pressaoAd < ((pressaoNd - 3)- 1.5))
					{ 
						System.out.println("Sua press�o diast�lica esta abaixo do esperada para semana");
					}
					else if (pressaoAd > ((pressaoNd - 3)+ 1.5))
					{ 
						System.out.println("Sua press�o diast�lica esta acima do esperada para semana");
					}
					else 
					{ 
						System.out.println("Sua press�o diast�lica esta dentro do esperada para semana");
					}
			
		          }	
			}
			
			else 
			{ 
				System.out.println("\nSua press�o diast�lica esta dentro do esperada para semana.");

			}
		}
		
		
		//--------------------TERCEIRO TRIMESTRE-----------------------

		if (semana >= 29 && semana <= 42)
		{ 
			if (pressaoAs != pressaoNs)//sist�lica
			{ 
				if (pressaoAs < (pressaoNs - 3))
				{ 
					System.out.println("Sua press�o sist�lica esta abaixo do esperada para semana");
				}
				else if (pressaoAs > (pressaoNs + 3))
				{ 
					System.out.println("Sua press�o sist�lica esta acima do esperada para semana");
				}
				else 
				{ 
					System.out.println("Sua press�o sist�lica esta dentro do esperada para semana");
				}
			}
			
			else 
			{ 
				System.out.println("\nSua press�o sist�lica esta dentro do esperada para semana.");

			}
			
			
			
			
			if (pressaoAd != pressaoNd)//diast�lica
			{ 
				{ 
					if (pressaoAd < (pressaoNd - 1.5))
					{ 
						System.out.println("Sua press�o diast�lica esta abaixo do esperada para semana");
					}
					else if (pressaoAd > (pressaoNd + 1.5))
					{ 
						System.out.println("Sua press�o diast�lica esta acima do esperada para semana");
					}
					else 
					{ 
						System.out.println("Sua press�o diast�lica esta dentro do esperada para semana");
					}
			
		          }	
			}
			
			else 
			{ 
				System.out.println("\nSua press�o diast�lica esta dentro do esperada para semana.");

			}
		}
		
		
		
		
  }

}
