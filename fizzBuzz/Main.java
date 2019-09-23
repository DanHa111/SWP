package fizzBuzz;

public class Main {
	
	public static void main(String[] args) {
		int z = 1;
		
		while(z <= 100)	{
//			boolean b = true;
//			
//			if(z % 3 == 0)	{
//				System.out.print("fizz");
//				b = false;
//			}
//			if(z % 4 == 0)	{
//				System.out.print("bazz");
//				b = false;
//			}
//			if(b)	{
//				System.out.print(z);
//			}
//			
//			z++;
//			System.out.println();
			
			System.out.print(z + ": ");
			if(z % 3 == 0)	{
				System.out.print("fizz");
			}
			if(z % 4 == 0)	{
				System.out.print("buzz");
			}
			System.out.println();
			z++;
		}
		
	}

}
