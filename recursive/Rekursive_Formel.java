package recursive;

public class Rekursive_Formel {
	
	public static int rekursivFunktion(int zahl)	{
		if(zahl == 1)	{
			return 1;
		}
		return rekursivFunktion(zahl - 1) + 2 * zahl - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rekursivFunktion(3));
	}

}
