


interface HelloWorld{
	
	public void greet();
}



public class Java8Test {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("===============Approach 1 =================");
		RosterTest.printPersonsOlderThan(Person.createRoster(), 25);
		
		System.out.println("===============Approach 2=================");
		RosterTest.printPersonsWithinAgeRange(Person.createRoster(),20,30);
		
		System.out.println("===============Approach 3=================");
		RosterTest.printPerson(Person.createRoster(), new Java8Test().new PersonTester()); 
		
		System.out.println("===============Approach 3 Anonymous class=================");
		
		
		
		RosterTest.printPerson(Person.createRoster(),  new CheckPerson() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return true;
			}
		}); 
		
		HelloWorld chineseGreetings = new HelloWorld(){

			@Override
			public void greet() {
				System.out.println("chinese greeting");
				
			}
			
		};
		chineseGreetings.greet();
		long startTime = System.nanoTime();
		bdTest();
		long time = System.nanoTime() - startTime;
		System.out.println("processing time " + time + " nano secs");
		
		startTime = System.nanoTime();
		bdTest2();
		time = System.nanoTime() - startTime;
		System.out.println("processing time " + time + " nano secs");
		
	}
	
	
	
	class PersonTester implements CheckPerson{

		@Override
		public boolean test(Person p) {
			if(p.getAge()>40){
				return true;
			}
			else return false;
		}
		
	}
	
	private static void bdTest()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%15==0)
			{
				System.out.println(i + " *#");
			}
			else if (i%5==0)
			{
				System.out.println(i + " *");
			}
			else if(i%3==0)
			{
				System.out.println(i + " #");
			}
		}
		
	}
	

	private static void bdTest2()
	{
		for(int i=1; i<=100;)
		{
			int a = i % 3;
			int b = i % 5;
			StringBuilder sb = new StringBuilder();
			sb.append(i);
			
			if (a==0)
			{
				sb.append("*");
			}
			
			if (b==0)
			{
				sb.append("#");
			}
			
			i += Math.min(3-a, 5-b);
			System.out.println(sb.toString());
			
		}
		
	}
}
