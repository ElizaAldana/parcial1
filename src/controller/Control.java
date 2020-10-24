package controller;

import java.util.LinkedList;

import model.DogsList;
import model.Logic;
import processing.core.PApplet;

public class Control {

	private Logic logic;

	
	public Control(PApplet app) {
		this.logic = new Logic(app);
	}
	
	public void sortDogsList(char c) {
		logic.sortList(c);
	}
	
	
	public LinkedList<DogsList> dogs() {
		return logic.getDogsList();
	} 

}
