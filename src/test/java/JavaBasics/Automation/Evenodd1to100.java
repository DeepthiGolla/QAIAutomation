package JavaBasics.Automation;

public class Evenodd1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =100;
		System.out.print("even Numbers from 1 to "+n+" are:");
		
		for (int i=0;i<=n;i++)
		{
			if (i % 2 == 0) {
				System.out.print(i + ", ");
					
		}
			System.out.println("odd Numbers from 1 to "+n+" are:");
			
			for (int j=0;j<=n;j++)
			{
				if (j % 2 == 1) {
					System.out.print(j + ", ");
						
			}
		
	}

}}}
