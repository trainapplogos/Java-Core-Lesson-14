package ua.lviv.trainapplogos.task1;

import java.util.Comparator;

public class PersonAllFieldsComparator implements Comparator <Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int firstres = o1.getFirstName().compareTo(o2.getFirstName());
		int lastres = o1.getLastName().compareTo(o2.getLastName());
		int ageres = o1.getAge() - o2.getAge();
		
		
		if  (firstres == 0) {
			if (lastres == 0) {
				if (ageres == 0) {
					return 0;
				} else return ageres;
			} return lastres;
		} return firstres;
	}
}
