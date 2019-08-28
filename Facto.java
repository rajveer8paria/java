import java.util.*;
class Facto{
	
	public static void main(String args[]){
		
		int x,y,i,f=1;
		System.out.println("enter two number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
				y=sc.nextInt();
				System.out.println(+y);
				System.out.println(+x);
		for(i=1;i<=x;i++)
		{
			
			f=f*i;
			
		}
		System.out.println("the factorial of a number is"+f);	
	}
	}