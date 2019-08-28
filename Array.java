
import java.util.*;
public class Array{

public static void main(String args[]){

         int n, sum=0 ;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the size of an array:");
     
		n = s.nextInt();
		 int a[] = new int[n];
		 System.out.print("Enter the element of an array:");
      
	  for(int i=0;i<n;i++){
		  a[i]=s.nextInt();
		    sum = a[i];
	  }
	 
	System.out.println("element of the array is"+sum);
	  
	}


}