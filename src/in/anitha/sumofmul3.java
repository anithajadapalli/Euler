package in.anitha;
/**
 * Multiples of 3 and 5
 * @author Jadapalli
 *
 */
public class sumofmul3 
{

	static int sum=0,num;
	//int mul3,mul5;

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[])
	{
		for(num=0;num<1000;num++)
		{
			if(num%3==0)
			{
				System.out.print(num+"\t");
				sum=sum+num;
			}	    
			else
				if(num%5==0)
				{
					System.out.print(num+"\t");
					sum=sum+num;
				}  

		} 

		System.out.println("\n"+"Multiples of 3 and 5= "+sum);
	}
}
