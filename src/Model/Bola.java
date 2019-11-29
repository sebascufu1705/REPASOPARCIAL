package Model;

import processing.core.PApplet;

public class Bola extends Thread {
	protected PApplet pro;
	protected int posX, posY, tamX, tamY;
	protected int tipo;

	public Bola( PApplet pro, int tipo, int posX, int posY, int tamX, int tamY) {
		this.tipo = tipo;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
	}

	public void run() {

	}
}
