package in.anitha;

public class largestprime 
{
	public static void main(String[] args) 
	{

		long number = 600851475143L;

		long highestPrime = -1;
		for (long i = 2; i <= number; ++i) 
		{
			if (number % i == 0) 
			{
				highestPrime = i;
				number = number/i;
				--i;
				System.out.print(number+" ");
			}
		}

		System.out.println("\n"+" heightest prime number = "+highestPrime);
	}

}
