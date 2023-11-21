class Employee1 extends Person1 {
	int sal;
	String desgn;
	void set_Emp(int id, String name, String desgn, int sal)
	{
		try {
			set_Person(id, name);
			this.desgn = desgn;
			this.sal = sal;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	void disp_Emp()
	{
		disp_Person();
		System.out.print(desgn + "\t" + sal);
	}

	public static void main(String args[])
	{

		Employee1 e1 = new Employee1();
                Employee1 e2 = new Employee1();
		e1.set_Emp(8844, "sam BUGINGO", "IT", 200000);
                e2.set_Emp(8722, "John PETER", "ICT", 120000);
		e1.disp_Emp();
                e2.disp_Emp();
	}
}
class Person1 {
	int id;
	String name;

	void set_Person(int id, String name)
	{
		try {
			this.id = id;
			this.name = name;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	void disp_Person()
	{
		System.out.print(id + "\t" + name + "\t");
	}
}


