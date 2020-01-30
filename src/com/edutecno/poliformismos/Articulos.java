package com.edutecno.poliformismos;

public class Articulos {
	private String Articulo;
	private int Precio;
	private String Nombre;
	private int Codigo;
	private int Talla;
	private String Marca;
	private String Modelo;
	private String Color;
	private int Bolsillos;
	
	public Articulos(String Articulo, int Precio, String Nombre, int Codigo, int Talla, String Marca, String Modelo, String Color, int Bolsillos) {
		this.Articulo=Articulo;
		this.Precio=Precio;
		this.Nombre=Nombre;
		this.Codigo=Codigo;
		this.Talla=Talla;
		this.Marca=Marca;
		this.Modelo=Modelo;
		this.Color=Color;
		this.Bolsillos=Bolsillos;
	}
	

	@Override
	public String toString() {
		return "Articulos [Articulo=" + Articulo + ", Precio=" + Precio + ", Nombre=" + Nombre + ", Codigo=" + Codigo
				+ ", Talla=" + Talla + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Bolsillos="
				+ Bolsillos + ", getArticulo()=" + getArticulo() + ", getPrecio()=" + getPrecio() + ", getNombre()="
				+ getNombre() + ", getCodigo()=" + getCodigo() + ", getTalla()=" + getTalla() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getColor()=" + getColor() + ", getBolsillos()="
				+ getBolsillos() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public String getArticulo() {
		return Articulo;
	}

	public void setArticulo(String articulo) {
		Articulo = articulo;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getTalla() {
		return Talla;
	}

	public void setTalla(int talla) {
		Talla = talla;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getBolsillos() {
		return Bolsillos;
	}

	public void setBolsillos(int bolsillos) {
		Bolsillos = bolsillos;
	}
	
	

}
