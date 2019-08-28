class A extends Thread{
	public void run(){
		
	for(int i=0;i<=5;i++){
		
	try{		 
		 if(i==2) sleep(1000);
			  
	}
	catch(Exception e){
			  System.out.println(e);
		  
	}
		System.out.println("Thread 1"+i);
		
	}
	System.out.println("exit fro Thread");
	}
}
class B extends Thread{
	public void run(){
		
	for(int i=0;i<=5;i++){
		
		  if(i==2){
			  
			  System.out.println("Thread 2:" +i);
		  }
		  System.out.println("exit from Thread");
	}	
		
	}
	
}
class Sleep{
	public static void main(String args[]){
		
		A o1=new A();
		B o2=new B();
		o1.start();
		o2.start();
	}
}