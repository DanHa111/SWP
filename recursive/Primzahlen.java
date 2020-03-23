package recursive;

public class Primzahlen {
	
	private static boolean istPrimzahlRek(int zahl, int zahl2)	{
		if(zahl2 == 1)	{
			return true;
		} else if(zahl % zahl2 == 0)	{
			return false;
		}
		return istPrimzahlRek(zahl, zahl2 - 1);
	}
	
	public static boolean istPrimzahl(int zahl)	{
		return istPrimzahlRek(zahl, zahl - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(istPrimzahl(8));
	}

}
