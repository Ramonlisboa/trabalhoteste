package com.jefferson.rn;

public class Carreira {

	public double calculaSalario(int experiencia, int idade) {
		double acrescimo = 0;
		
		if(experiencia >= 1 && experiencia < 5 ){
			acrescimo = 5;
		}else if(experiencia >= 5 && experiencia < 10 ){
			acrescimo = 10;
		}else if(experiencia >= 10 && experiencia < 15 ){
			acrescimo = 15;
		}else if(experiencia >= 15 && experiencia < 20 ){
			acrescimo = 20;
		}
		else if(experiencia >=20){
			acrescimo = 25;
		}
		return acrescimo;
	}
}
