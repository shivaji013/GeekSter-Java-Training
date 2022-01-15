
public class Greatest {

	public static void main(String[] args)
	{
		int n1=90,n2=120,n3=200;
		
		if(n1>2)
		{
			if(n1>n3)
			{
				System.out.println("N1 is Greatest number ="+n1);
			}
			else
			{
				System.out.println("N3 is Greatest number = "+n3);
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("N2 is Greatest Number = "+n2);
			}
			else
			{
				System.out.println("N3 is Greatest Number = "+n3);
			}
		}
	}

}
