package carro;

import Maquinaria.IMaquinaria;
import moto.Moto;
import moto.Ninja;

public class Run {

	public static void main(String[] args) {
		new Carretera(createCarFactory(CarType.SEDAN)).runMaquinarias();
		new Carretera(createCarFactory(CarType.PICKUP)).runMaquinarias();
		new Carretera(createMotoFactory()).runMaquinarias();
		//agregar ducati
	}
	
	
	private enum CarType {
		SEDAN,
		PICKUP
	}
	
	private static Carro createCarFactory(CarType type) {
	  if (type.equals(CarType.SEDAN)) {
		  return new Sedan();
	  }
	  return new Pickup(); 
	}
	
	private static Moto createMotoFactory() {
	   return new Ninja(); 
	}
	
}
