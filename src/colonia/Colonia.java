package colonia;

import colonia.model.Ant;
import colonia.model.Colony;

import java.util.Arrays;
import java.util.HashSet;

public class Colonia {

	public static void main(String[] args) {
		Colony myColony = new Colony();
		myColony.setName("AlphaColony");
		myColony.setJobs(new HashSet<>(Arrays.asList("Queen", "Worker", "Scout")));
		Ant myAnt = new Ant(true);
		myAnt.setName("Morty");

		System.out.println(myAnt);
		System.out.println("My Colony Name: " + myColony.getName());
		System.out.println("My Colony Jobs: " + myColony.getJobs());
	}

}
