package com.edutecno.poliformismos;

import java.util.ArrayList;

public class Menu1ProductosDisponibles {
	
	public void menu1() {
		
			//Productos disponibles
				ArrayList<Pantalones> PantsList = new ArrayList<>();
				ArrayList<Polerones> pullover = new ArrayList<>();
				ArrayList<Zapatos> shoes = new ArrayList<>();
				ArrayList<Articulos> ArticulosList = new ArrayList<>();
				
				ArticulosList.add(new Pantalones("Pantalón", 15000, "Variant Caqui Corto", 1000, 30, "Variant", "-", "Caqui", 2));
				ArticulosList.add(new Pantalones("Pantalón", 15000, "Variant Caqui Corto", 1000, 30, "Variant", "-", "Caqui", 2));
				ArticulosList.add(new Pantalones("Pantalón", 19000, "Variant Negro Largo", 1001, 30, "Variant", "-", "Negro", 2));
				ArticulosList.add(new Polerones("Polerón", 9000, "Variant Rojo", 2002, 29, "Variant", "-", "Rojo", 0));
				ArticulosList.add(new Zapatos("Zapato", 25000, "Mega CZ50", 3003, 34, "Mega", "CZ50", "-", 0));
				ArticulosList.add(new Zapatos("Zapato", 20000, "Mega CX50", 3004, 40, "Mega", "CX50", "-", 0));
				
				for(Articulos lista: ArticulosList) {
					System.out.println(lista.toString());					
				}
				
				
				
				System.out.println("----------------------------------------------------");
		
	}

}
