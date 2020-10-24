package model;

import processing.core.PApplet;


public class DogsList implements Comparable<DogsList> {

	PApplet app;
	private String race, name;
	private int id, age, date, posX, posY;
	
	
	public DogsList(int id,String race,String name, int age, int date, int posX, PApplet app) {
		super();
		this.app = app;
		this.id = id;
		this.name = name;
		this.race = race;
		this.age = age;
		this.date = date;
		this.posX = 130;
	
	}



	public void drawList(int posY, PApplet app) {
		app.fill(255);
		app.text(id, posX, posY);
		app.text(name, posX+100, posY);
		app.text(race, posX+30, posY);
		app.text(age, posX+250, posY);
		app.text(date, posX+300, posY);
	}



	public PApplet getApp() {
		return app;
	}


	public void setApp(PApplet app) {
		this.app = app;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int compareTo(DogsList p ) {
		return this.id - p.getId();
	}

}
