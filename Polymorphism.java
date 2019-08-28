class Poly{
	void add()
{
System.out.println("no parameter");
}
void add(int a)
{
System.out.println("parameterized");

}
void add(int a,int b)
{

	System.out.println("two parameter");
}
}
class Polymorphism{
public static void main(String args[])
{
	Poly obj=new Poly();
	obj.add();
	obj.add(10);
	obj.add(10,20);

}

}