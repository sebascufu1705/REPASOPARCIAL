package Model;

import processing.core.PApplet;

public class Bola extends Thread {
	protected PApplet pro;
	protected int posX, posY, tamX, tamY;
	protected int tipo;

	public Bola( PApplet pro, int tipo, int posX, int posY, int tamX, int tamY) {
		
	}

	public void run() {
	}
	public void pintar() {
		pro.ellipse(this.posX,this.posY,this.tamX,this.tamY);
	}
}
