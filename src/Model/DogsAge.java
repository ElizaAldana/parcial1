package model;

import java.util.Comparator;

public class DogsAge implements Comparator<DogsList> {

	public int compare(DogsList p1, DogsList p2) {
		return p1.getAge() - p2.getAge();
	}
}
