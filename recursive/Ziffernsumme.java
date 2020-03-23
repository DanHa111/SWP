package recursive;

public class Ziffernsumme {
	
	public static int sumOfDigits(int number)	{
		number = Math.abs(number);
		if(number / 10 == 0)	{
			return number;
		}
		return sumOfDigits(number / 10) + number % 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(9458));
	}

}
