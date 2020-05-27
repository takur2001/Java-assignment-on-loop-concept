
public class DollerQuestion3 
{
	public static void main(String[] args)
	{		
		for (int a=0;a<=3;a++)
		{
			if(a%3==0)
			{
				for (int b=0;b<=3;b++)
				{
					System.out.print("$" + " ");
				}
			}
			else
			{
				for(int c=0;c<=3;c++)
				{
					if(c%3==0)
						System.out.print("$" + " ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();	
		}
	}

}
