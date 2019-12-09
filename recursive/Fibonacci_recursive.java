package recursive;

public class Fibonacci_recursive {
	
	public static int fib_rec(int stelle)	{
		if(stelle == 1)	{
			return 1;
		}
		if(stelle == 0)	{
			return 0;
		}
		return fib_rec(stelle - 1) + fib_rec(stelle - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib_rec(5));
	}

}
