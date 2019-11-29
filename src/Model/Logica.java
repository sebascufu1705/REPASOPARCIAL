package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	private PApplet app;
	private String[] datos;
	private ArrayList<Bolita> arregloBolitas;

	public Logica(PApplet app) {
		this.app = app;
		/////////////////////////
		/////////////////////////
///// MANEJAR ARREGLOS Y LISTAS/////////
		/////////////////////////
		////////////////////////
		//guardar el texto
		datos = app.loadStrings("../data/archivo.txt");
		//INICIAR ARREGLO
		arregloBolitas = new ArrayList<Bolita>();
		//cargar texto
		for (int i = 0; i < datos.length; i++) {
			String[] datosTemp = datos[i].split(",");
			int tipo = Integer.parseInt(datosTemp[0]);
			int posX = Integer.parseInt(datosTemp[1]);
			int posY = Integer.parseInt(datosTemp[2]);
			int tamX = Integer.parseInt(datosTemp[3]);
			int tamY = Integer.parseInt(datosTemp[4]);
			
			if(tipo == 1) {
				Bolita temp = new Bolita(app,tipo,posX,posY,tamX,tamY);
				temp.start();
				arregloBolitas.add(temp);
			}
			
		}
	}
	public void pintar() {
		app.background(0);
		for (int i = 0; i < arregloBolitas.size(); i++) {
			Bolita temp = arregloBolitas.get(i);
			temp.pintar();
			
		}
		
		
	}

}
