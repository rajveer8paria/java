class cal{
 public int	add(int i,int j)
 {

	return i+j;

}
}
class calculator extends cal{
	
	int sub(int a,int b)
	{
		
		return a-b;
	}
		
	}
	class adcalculator extends calculator{
		
		int mult(int c,int d)
		{
			
			return c*d;
		}
		
		
	}
	

class operation{

public static void main(String[]args)
{

	cal c1=new cal();
	calculator c2=new calculator();
	adcalculator c3=new adcalculator();
	int result=c1.add(2,4);
	int output=c2.sub(4,2);
	int max=c3.mult(5,3);
System.out.println("result is"+result);
System.out.println("result is"+output);
System.out.println("result is"+max);
}

}