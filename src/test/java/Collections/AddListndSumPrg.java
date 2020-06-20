package Collections;

public class AddListndSumPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {3,5,8,2,9,6} ;
		int b= 11;
		for (int i=0;i<a.length;i++)
			
		{
			for (int j=1;j<a.length;j++)
			{
				
				int n = a[i]+a[j];
				if (n==b)
					
				{
					System.out.println(" set is "+ a[i] + " " + a[j]);
					
					
				}
			}
				
		}

	}

}
