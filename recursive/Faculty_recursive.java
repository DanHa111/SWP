package recursive;

public class Faculty_recursive {
	
	public static int fac_rec(int n)	{
		if(n == 1)	{
			return 1;
		}
		return n * fac_rec(n - 1);
	}

	public static void main(String[] args) {
		
		
	}

}
