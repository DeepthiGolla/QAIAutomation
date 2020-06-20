package javasampleprgs;

public class CozaLozaWoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CozaLozaWoza CozaLozaWoza1 = new CozaLozaWoza();
		CozaLozaWoza1.PrintCozaLozaWoza(110,11);
			
	}

	private void PrintCozaLozaWoza(int itemCount, int itemLen) 
	
	{
		int i;
		boolean status;
		
		for (i=0;i<=itemCount;i++)
		
		{
			status =false;
			if (i%3==0)
			{
				System.out.print("Coza");
				
				status=true;
			}
			
			if (i%5==0)
			{
				
               System.out.print("Loza");
				
				status=true;
				
			}
			
			if (i%7==0)
			{
				
               System.out.print("Woza");
				
				status=true;
				
			}
			
			if (i%3==0 && i%5==0)
			
			{
				   System.out.print("CozaLoza");
					
					status=true;
				
			}
			
			if (!status) 
			{
				System.out.print(i);
				
				
			}
				
				System.out.print( " ");
				
				if (i%11==0)
				{
					
					System.out.println("======");
				}
				
		} //for loop close 
		
	
		System.out.println();
		
		
		
	} // method close 
	
} //class close 


//it is not showing line by line 
