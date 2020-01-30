package com.edutecno.poliformismos;

import java.util.Scanner;

public class MenuAgregarProducto {
	
	public void Menu() {
		Scanner scan = new Scanner(System.in);	
		Menu1ProductosDisponibles menu1 = new Menu1ProductosDisponibles();
		Menu2AgregarCarritoAlCarro menu2 = new Menu2AgregarCarritoAlCarro();
		Menu3Pagar menu3 = new Menu3Pagar();
		int menu=0;
		


		while(menu!=4) {
			System.out.println("Menú: Ingrese opción");
			System.out.println("1.- Mostrar productos disponibles");
			System.out.println("2.- Agregar producto al carrito");
			System.out.println("3.- Pagar");
			System.out.println("4.- Salir");
			menu= scan.nextInt();
			switch(menu) {
			case 1:
				menu1.menu1();
				
			break;
			
			case 2:
				menu2.Menu2();
				
			break;
			
			case 3:
				menu3.Menu3();
			break;
			
			case 4:
				System.out.println("Saliendo del programa");
				
			break;
		
			default:
					System.out.println("Opción incorrecta, inténtelo nuevamente");
			break;
			
		}
		
				
	}
		
		
		
}

}
