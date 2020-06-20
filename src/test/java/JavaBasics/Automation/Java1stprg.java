package JavaBasics.Automation;
import java.lang.*;
import java.util.*;
import java.awt.*;

public class Java1stprg {
	
	

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter 2 values and display tables 
		
		int a, b, c, d;
		 
	    System.out.println("Enter range of numbers to print their multiplication tables");
	    in = new Scanner(System.in);
	 
	    a = in.nextInt();
	    b = in.nextInt();
	 
	    for (c = a; c <= b; c++) {
	      System.out.println("Multiplication table of "+c);
	 
	      for (d = 1; d <= 10; d++) {
	        System.out.println(c+"*"+d+" = "+(c*d));
		
	}

}
	}
}



