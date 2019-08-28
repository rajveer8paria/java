class A extends Thread{
	
	public void run(){
		
		int i;
		for(i=1;i<=10;i++){
			System.out.println("i="+i+"threadA");
		}
	}	
}
class B extends Thread{
	
	public void run(){
		
		int i;
		for(i=1;i<=10;i++){
			System.out.println("i="+i+"threadB");
		}
	}	
}

class Threadclass{
	
	public static void main(String ar[])
	{
		
		A o1=new A();
		B o2=new B();
		o1.start();
		o2.start();
	}
	
	
	
}