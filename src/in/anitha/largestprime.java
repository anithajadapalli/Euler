package in.anitha;
/**
 * Largest PrimeFactor of  600851475143
 * @author Jadapalli
 *
 */

public class largestprime 
{
	static long number = 600851475143L;
	static long highestPrime = -1;
	/**
	 * 
	 * @param args
	 */
 
	public static void main(String[] args) 
	{


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
