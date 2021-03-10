package ua.lviv.trainapplogos.task1;

public class Person implements Comparable <Person> {
	private String firstname;
	private String lastname;
	private int age;
	
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	//priority field: lastname
	@Override
	public int compareTo(Person o) {
		return this.firstname.compareTo(o.firstname); 
		
	/*	int lastres = this.lastname.compareTo(o.lastname);
		int firstres = this.firstname.compareTo(o.firstname);
		int ageres = this.age - o.age;

		if (lastres == 0) {
			if (firstres == 0) {
				return ageres;
			} return firstres;
		} else return lastres;
		*/
//		return (lastres == 0) ? this.firstname.compareTo(o.firstname) : lastres;
	}
	
	
}
