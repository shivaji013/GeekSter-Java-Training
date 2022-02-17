
public class FormulaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int c=0;
		do {
			int num=3*i+2;
			
			if(i%4!=0)
			{
			System.out.println(num);
			c++;
			}
			i++;
		}while(c<5);
		
	}

}
