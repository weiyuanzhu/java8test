import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;


public class Person {

	public enum Sex{MALE,FEMALE}
	
	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	
	public Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg)
	{
		name = nameArg;
		birthday = birthdayArg;
		gender = genderArg;
		emailAddress = emailArg;
		
	}
	
	public int getAge()
	{
		return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
	}

	public void printPerson()
	{
		System.out.println(name + ", " + this.getAge());
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	public static int compareByAge(Person a, Person b)
	{
		return a.birthday.compareTo(b.birthday);
	}
	
	public static List<Person> createRoster()
	{
		List<Person> roster = new ArrayList<Person>();
		roster.add(new Person(
				"Fred",IsoChronology.INSTANCE.date(1980,6,20),
				Person.Sex.MALE,
				"fred@test.com"
				));
		roster.add(new Person(
				"Jane",IsoChronology.INSTANCE.date(1990,7,20),
				Person.Sex.FEMALE,
				"jane@test.com"
				));
		
		roster.add(new Person(
				"George",IsoChronology.INSTANCE.date(1991,12,10),
				Person.Sex.MALE,
				"George@test.com"
				));
		roster.add(new Person(
				"Bob",IsoChronology.INSTANCE.date(1972,4,12),
				Person.Sex.MALE,
				"bob@test.com"
				));
		
		return roster;
	}
	
}
