package model;

import java.util.Collections;
import java.util.LinkedList;
import processing.core.PApplet;

public class Logic {
	
	//Atributos
	PApplet app;
	private LinkedList<DogsList> dogslist;
	//Clases
	private DogsId id;
	private DogsName name;
	private DogsRace race;
	private DogsAge age;
	private DogsDate date;
	String[] textOne, textTwo, textSplit, text2Split;
	//string int imp
	private String nameD, raceD;
	private int idD, dateD, ageD;
	
	public Logic(PApplet app) {
		super();
		this.app = app;
		this.dogslist = new LinkedList <DogsList>();
		this.age = new DogsAge();
		this.date = new DogsDate();
		this.id = new DogsId();
		this.name = new DogsName();
		this.race = new DogsRace();
		
		//Cargar textos
		textOne = app.loadStrings("../text/datosUno.txt");
		textTwo = app.loadStrings("../text/datosDos.txt");
		
		//imprimir texto
		for (int i = 0; i < textOne.length; i++) {
			textSplit = textOne[i].split(",");
			for (int j = 0; j < textTwo.length; j++) {
				text2Split = textTwo[j].split(",");
				if(textTwo[0].equals(textSplit[0])) {
					idD = Integer.parseInt(textSplit[0]);
					nameD = textSplit[1];
					ageD = Integer.parseInt(textSplit[2]);
					raceD = text2Split[1];
					dateD = Integer.parseInt(text2Split[2]);
					dogslist.add(new DogsList(idD, raceD, nameD, ageD, dateD, j, app));
				}
			}
		}
		
	}

	public void sortList(char c) {
		switch (c) { 
		case 't':
			Collections.sort(dogslist);
			break;
		case 'r':
			Collections.sort(dogslist,race);
			break;
		case 'a':
			Collections.sort(dogslist,age);
			break;
		case 'd':
			Collections.sort(dogslist,date);
		break;
		case 'i':
			Collections.sort(dogslist, id);
	
		break;
		case 'n':
			Collections.sort(dogslist,name);
		break;
		default:
			break;
		}
	}
	public LinkedList<DogsList> getDogsList() {
		return dogslist;
	}

	public void setDogsList(LinkedList<DogsList> dogslist) {
		this.dogslist = dogslist;
	}
	
}
