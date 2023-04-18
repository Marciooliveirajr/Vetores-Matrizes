package Vetores_Matrizes;

import java.util.Scanner;

public class exercicio2_matrizes {

	public static void main(String[] args) {
		

			Scanner leia = new Scanner(System.in);
			
			int numeros[][] = new int [3][3];
			
			int linha,coluna,somaPr=0,somaSec=0;
			
			String VLDiagonal="",DiagonalSec1="";
			
			for(linha=0;linha<3;linha++) {
				
				for(coluna=0;coluna<3;coluna++) {
					
					System.out.printf("\nDigite um número : ",linha, coluna); 
					
					numeros[linha][coluna] = leia.nextInt();
					
					if(linha == coluna) {
						
						somaPr += numeros[linha][coluna];
						
						VLDiagonal += numeros[linha][coluna]+" ";
						
					}
					
					if(linha+coluna == 2) {
						somaSec += numeros[linha][coluna];
						
						DiagonalSec1 += numeros[linha][coluna]+" ";				}
				}
			}
			System.out.println("\nElementos da Diagonal Principal: "+VLDiagonal);
			
			System.out.println("\nElementos da Diagonal Secundária: "+DiagonalSec1);
			
			System.out.println("\nSoma dos Elementos da Diagonal Principal: "+somaSec);
			
			System.out.println("\nSoma dos Elementos da Diagonal Secundária: "+somaPr);
		
		}
	}


	