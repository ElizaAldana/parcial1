package model;

import java.util.Comparator;

public class DogsName implements Comparator<DogsList> {

	public int compare(DogsList p1, DogsList p2) {
		return p1.getName().compareTo(p2.getName());
		}
}
