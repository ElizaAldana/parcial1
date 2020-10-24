package model;

import java.util.Comparator;

public class DogsRace implements Comparator<DogsList>{

	public int compare(DogsList p1, DogsList p2) {
		return p1.getRace().compareTo(p2.getRace());
		}
}
