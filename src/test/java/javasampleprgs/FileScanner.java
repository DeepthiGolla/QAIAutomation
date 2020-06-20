package javasampleprgs;
import java.io.File;
import java.util.Scanner;


public class FileScanner {
	
	//FileScanner program to read int, double and string from test txt file and produce output

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int a;
		double b;
		String s;
		
		
		Scanner sc = new Scanner (new File("/Users/dgolla/Documents/QAI Automation /Automation/Test"));
		
		a=sc.nextInt();
		
		System.out.println(a);
		
		b=sc.nextDouble();
		
		System.out.println(b);
		
		s=sc.next();
		
		System.out.println(s);
		
		sc.close();

	}

}
