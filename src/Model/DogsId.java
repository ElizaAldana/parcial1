package model;

import java.util.Comparator;

public class DogsId implements Comparator<DogsList> {

	
	public int compare(DogsList p1, DogsList p2) {
		return p1.getId() - p2.getId();
	}

}
