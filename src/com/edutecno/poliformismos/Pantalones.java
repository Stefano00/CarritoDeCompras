package com.edutecno.poliformismos;

public class Pantalones extends Articulos{

	public Pantalones(String Articulo, int Precio, String Nombre, int Codigo, int Talla, String Marca, String Modelo,
			String Color, int Bolsillos) {
		super(Articulo, Precio, Nombre, Codigo, Talla, Marca, Modelo, Color, Bolsillos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "" + getArticulo() + "," + getPrecio() + ", "
				+ getNombre() + "," + getCodigo() + "," + getTalla() + ","
				+ getMarca() + "," + getModelo() + "," + getColor() + ","
				+ getBolsillos() + "," + getClass() + "," + hashCode() + ","
				+ super.toString() + "]";
	}
	
	
	
}
