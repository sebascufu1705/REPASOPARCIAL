package View;

import Model.Logica;
import processing.core.PApplet;

public class Main extends PApplet {
	Logica logica;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void setttings() {
		size(1000, 1000);
	}

	public void setup() {
		logica = new Logica(this);

	}

	public void draw() {
		logica.pintar();
	}

}
