import java.util.List;

interface CheckPerson
{
	boolean test(Person p);
}

public class RosterTest {
	
	
	
	//approach 1
	public static void printPersonsOlderThan(List<Person> roster, int age)
	{
		for(Person p:roster){
			
			if(p.getAge()>age)
			{
				p.printPerson();
			}
		}
	}
	
	//approach 2 
	public static void printPersonsWithinAgeRange(List<Person> roster,int low, int high)
	{
		for(Person p : roster){
			if(low<= p.getAge() && p.getAge()<high){
				p.printPerson();
			}
			
		}
	}
	
	
	public static void printPerson(List<Person> roster, CheckPerson tester)
	{
		for(Person p: roster)
		{
			if(tester.test(p)){
				p.printPerson();
			}
		}
	}
	
}
