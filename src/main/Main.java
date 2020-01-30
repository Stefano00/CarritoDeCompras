package main;

import java.util.ArrayList;

import com.edutecno.poliformismos.Pantalones;

import configuracion.LectorConfiguracion;
import implementaciones.ExportadorExcel;
import implementaciones.ExportadorTexto;
import interfaces.Exportador;

public class Main {
	private static Exportador exportador;

	public static void main(String[] args) {
		
		ArrayList<Pantalones> pantalones = new ArrayList<Pantalones>();
		//ArrayList<Object> lista = new ArrayList<Object>();
		
		pantalones.add(new Pantalones("Pantalón", 15000, "Variant Caqui Corto", 1000, 30, "variant", "", "Caqui", 2));
			
	    System.out.println(pantalones.get(0));
		
		
		//System.out.println(pantalones);
		
		if (null == pantalones || pantalones.size() == 0) {
			System.out.println("No existen datos para exportar");
		} else {
			try {
				ArrayList<Object> lista = new ArrayList<Object>();
				for (String arg : args[0].split(",")) {
					lista.add(arg);
				}
				if (LectorConfiguracion.formatoSalida().equals("xls")) {
					exportador = new ExportadorExcel();
				} else if (LectorConfiguracion.formatoSalida().equals("txt")) {
					exportador = new ExportadorTexto();
				}
				
				exportador.exportar(pantalones);  //exportando lista de pántalones, no lista normal
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
