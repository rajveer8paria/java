//encapsulation
class Employee{
	private int empid;
	public void setEmpid(int eid)
	{
	
	empid=eid;
	
	}
	public int getEmpid()
	{
	
		return empid;
	}

}
class company
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setEmpid(187);
		System.out.println(e.getEmpid());
	}

}