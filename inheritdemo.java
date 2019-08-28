class parentrent1{
	int i=10;
	parentrent1()
	{
		System.out.println("value of i in parent class" +i);
	}
}
class child extends perent1{
child()
{
	super();
	
	
		System.out.println("child class "+i);
	
} 
}
class child2 extends child{
	
child2()
{
	super();
	
	
		System.out.println("child2 class "+i);
	
} 	
	
}
class inheritdemo{

public static void main(String args[])
{

	child2 obj= new child2();
}
}