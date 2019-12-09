package recursive;

public class PascalschesDreieckIterativ {
	
	public static int pd(int zeile, int stelle)	{
		if(zeile == 0 && stelle == 0)	{
			return 1;
		}
		
		if(stelle < 0 || stelle > zeile)	{
			return 0;
		}
		
		return pd(zeile - 1, stelle - 1) + pd(zeile - 1, stelle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pd(5, 2));
	}

}
