package model;

import java.util.Comparator;

public class DogsDate implements Comparator<DogsList> {

	public int compare(DogsList p1, DogsList p2) {
		return p1.getDate().compareTo(p2.getDate());
	}
}
