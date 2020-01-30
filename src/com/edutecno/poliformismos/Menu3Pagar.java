package com.edutecno.poliformismos;

import java.util.Scanner;

public class Menu3Pagar {
	
	public void Menu3() {
		MenuAgregarProducto menuinicial = new MenuAgregarProducto();
		Scanner scan = new Scanner(System.in);
		int menu=0;
		while(menu!=3) {
			System.out.println("¿Cuál es su medio de pago?");
			System.out.println("1.- Credito");
			System.out.println("2.- Debito");
			System.out.println("3.- Cancelar");
			menu= scan.nextInt();
			switch(menu) {
				case 1:
					System.out.println("¿Está seguro que desea pagar con credito el total de $15000.0?");
					System.out.println("Ingrese Y para si o N para no");
					System.out.println("¿Con cuantas cuotas desea pagar ? (0-24)");
					System.out.println("¿Está seguro que desea pagar con 10 cuotas?");
					System.out.println("Ingrese Y para si o N para no");
					System.out.println("¿Cuál es la dirección de despacho?");
					System.out.println("¿Cuál es el nombre de quien recibe el producto?");
					System.out.println("Orden de despacho generada correctamente");
					System.out.println("----------------------------------------------------");
				break;
				
				case 2:
					System.out.println("¿Está seguro que desea pagar con débito el total de $15000.0?");
					System.out.println("Ingrese Y para si o N para no");
					System.out.println("¿Cuál es la dirección de despacho?");
					System.out.println("¿Cuál es el nombre de quien recibe el producto");
					System.out.println("Orden de despacho generada correctamente");
					System.out.println("----------------------------------------------------");
				break;
				
				case 3:			
					System.out.println("Saliendo del menú");
				break;
				
				default:
					System.out.println("Opción incorrecta, inténtelo nuevamente");
				break;
			}
		}
		System.out.println("----------------------------------------------------");
	}

}
