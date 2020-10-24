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
	private String nameD, raceD, dateD;
	private int idD, ageD;
	
	public Logic(PApplet app) {
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
		for (int i = 0; i < textTwo.length; i++) {
			text2Split = textTwo[i].split(",");
			for (int j = 0; j < textOne.length; j++) {
				textSplit = textOne[j].split(",");
				if(text2Split[0].equals(textSplit[0])) {
					idD = Integer.parseInt(textSplit[0]);
					nameD = textSplit[1];
					ageD = Integer.parseInt(textSplit[2]);
					raceD = text2Split[1];
					dateD = text2Split[2];
					dogslist.add(new DogsList(idD, raceD, nameD, ageD, dateD, app));
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
