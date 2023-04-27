package view;

import controller.Recursiva02;

public class Principal {

	public static void main(String[] args) {
			
		Recursiva02 ControllerVet= new Recursiva02();
			int [] vt = {9,5,12,4,20};
			int tam = vt.length;
			int Ultmenor= vt[tam -1];
			int menor = ControllerVet.menorvalor(vt, tam,Ultmenor );
			System.out.println("Menor valor do vetor é " + menor);
			
		}

	}


