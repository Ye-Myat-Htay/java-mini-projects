class Teacher
{
	private String name;
	private int age;
	private String subject;
	private int salary;

	//Constructor
	public Teacher(String name) //, int age, String subject, int salary)
	{
		this.name = name;
		//this.age = age;
		//this.subject = subject;
		//this.salary = salary;
	}

	//Get teacher's name
	public String getName()
	{
		return name;
	}

	//Update teacher's name
	public void setName(String name)  //Update
	{
		this.name = name;
	}

	/*public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String Subject)
	{
		this.subject = subject;
	}
	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}*/

	//Java Built-in
	@Override
	public String toString()    //Update
	{
		return "Name: " + name;
	}
}



public class MainTeacher
{
	public static void main(String[] d)
	{
		Teacher teacher1 = new Teacher("John Doe");

		//Before update name
		System.out.println("Name: " + teacher1.getName());

		teacher1.setName("Bob");

		//After update name
		System.out.println("Name: " + teacher1.getName());

		System.out.println(teacher1);

		/*Teacher teacher2 = new Teacher(30);
		System.out.println("Age: " + teacher2.getAge());

		Teacher teacher3 = new Teacher("English");
		System.out.println("Subject: " + teacher3.getSubject());

		Teacher teacher4 = new Teacher(5000);
		System.out.println("Salary: $" + teacher4.getSalary());*/
	}
}