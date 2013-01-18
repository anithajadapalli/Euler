package in.anitha;

public class evenfeb 
{   
		static int  f1=0,f2=1,f,sum=0;
	
		public static void main(String args[])
		{
			//System.out.print(f1+"  "+f2);
			for(int i=0;i<=32;i++)
			{
				f=f1+f2;
				f1=f2;
				f2=f;
				if(f%2==0)
					sum=sum+f;
			}
	
          System.out.println("Sum of even febnoncii numbers= "+sum);
		}
//	public static long GenerateFibonacci(int term) 
//	{
//
//		long sum = 0;
//		long fib = 0;
//		long f1 = 0;
//		long f2 = 1;
//		if (term <=1) 
//			return term;
//		for (int i = 1; i <= term; i++) 
//		{
//			fib = f1 + f2;
//			f1 = f2;
//			f2 = fib;
//			if(fib %2 ==0)
//				sum += fib;         
//		}
//		return sum;
//
//	}
//
//	
//	public static void main(String[] args) 
//	{
//
//		int n = 32;
//		long result = GenerateFibonacci(n);
//		System.out.println("The sum of the even Fibonacci numbers is: "+result);
//	}
}


