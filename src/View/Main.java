package View;

import processing.core.PApplet;
import Controler.Control;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}

	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		
	}
	
	public void draw() {
		background(0);
		textAlign(CENTER);
		textSize(25);
		text("Peludos sin hogar", 250,50);
		textAlign(CORNER);
		textSize(15);
		text("ID presiona i, Nombre presiona n, Edad presiona e", 30, 90);

	}
}
