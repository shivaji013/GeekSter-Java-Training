
public class FormulaProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		for(int i=1;c<=5;i++)
		{
			int num=3*i+2;
			System.out.println(num);
			if(i%4!=0)
			{
				System.out.println("After num = "+i);
				c++;
			}
		}
	}

}
