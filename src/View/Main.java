package view;

import controller.Control;
import processing.core.PApplet;

public class Main extends PApplet {
	
	Control control;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}

	public void settings() {
		size(500,500);
	}
	
	public void setup() {
	 control = new Control(this);
	}
	
	public void draw() {
		background(0);
		textAlign(CENTER);
		textSize(25);
		text("Peludos sin hogar", 250,50);
		textAlign(CORNER);
		textSize(12);
		text("ID presiona i, Nombre presiona n, Raza presiona r", 20, 90);
		text("Edad presiona e, Cumpleaños presiona c", 20, 120);
		for (int i = 0; i < control.dogs().size(); i++) {
			control.dogs().get(i).drawList(30+(i*20));
		}
	}
	public void keyPressed() {
		control.sortDogsList(key);
}
}