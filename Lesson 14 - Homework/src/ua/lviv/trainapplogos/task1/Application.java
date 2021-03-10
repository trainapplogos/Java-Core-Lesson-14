package ua.lviv.trainapplogos.task1;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application {
	public static void main(String[] args) {
		LinkedHashSet <Person> persons = new LinkedHashSet<>();
		TreeSet <Person> personsSorted = new TreeSet<>();
		
		persons.add(new Person("Onufrios", "Kalos", 34));
		persons.add(new Person("Tarasios", "Oudos", 22));
		persons.add(new Person("Eustratios", "Protos", 24));
		persons.add(new Person("Trifonos", "Kalidos", 25));
		persons.add(new Person("Andreas", "Deuteros", 47));
		persons.add(new Person("Eustratios", "Protos", 24)); //copy
		persons.add(new Person("Eustratios", "Hagios", 26));
		persons.add(new Person("Eustratios", "Protos", 23)); //2nd ver
		persons.add(new Person("Andreas", "Deuteros", 36)); //2nd
		persons.add(new Person("Spiridonos", "Pantostauros", 51));
		persons.add(new Person("Petros", "Deuteros", 12));
		persons.add(new Person("Antonios", "Megas", 55));
		
		System.out.println("> Initial List:");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		personsSorted.addAll(persons);
		
		System.out.println("\n> Sotred TreeSet by firstname:");
		for (Person person : personsSorted) {
			System.out.println(person);
		}
		
		System.out.println("\n> TreeSet builded by comparison all fields:");
		TreeSet <Person> personsall = new TreeSet<>(new PersonAllFieldsComparator());
		personsall.add(new Person("Onufrios", "Kalos", 34));
		personsall.add(new Person("Tarasios", "Oudos", 22));
		personsall.add(new Person("Eustratios", "Protos", 24));
		personsall.add(new Person("Trifonos", "Kalidos", 25));
		personsall.add(new Person("Andreas", "Deuteros", 47));
		personsall.add(new Person("Eustratios", "Protos", 24)); //copy
		personsall.add(new Person("Eustratios", "Hagios", 26));
		personsall.add(new Person("Eustratios", "Protos", 23)); //2nd ver
		personsall.add(new Person("Andreas", "Deuteros", 36)); //2nd
		personsall.add(new Person("Spiridonos", "Pantostauros", 51));
		personsall.add(new Person("Petros", "Deuteros", 12));
		personsall.add(new Person("Antonios", "Megas", 55));
		
		for (Person person : personsall) {
			System.out.println(person);
		}
		
	}
	
}
