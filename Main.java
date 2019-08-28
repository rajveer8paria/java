class Test{

static int cube(int x)
{
	return(x*x*x);
}
}
class Main{

public static void main(String args[])
{

int res=Test.cube(4);
System.out.println("cube"+res);
}
}