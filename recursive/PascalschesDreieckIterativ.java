package recursive;

public class PascalschesDreieckIterativ {
	
	public static int pd(int zeile, int stelle)	{
		int[][] array = new int[zeile+1][zeile+1];
		array[0][0] = 1;
		for(int i = 1; i <= zeile; i++)	{
			for(int j = 0; j <= i; j++)	{
				try {
					array[i][j] = array[i-1][j-1] + array[i-1][j];
				} catch (Exception e) {
					array[i][j] = 1;
				}
			}
		}
		return array[zeile][stelle];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pd(5, 2));
	}

}
