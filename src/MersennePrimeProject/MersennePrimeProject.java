//****Project 3 / Mersenne Prime****
//
//Author: Scott Tabaka
//Instructor: Steve Riegerix
//Class: CMPSCI 2700(Fall 2018)
//Due Date: October 7, 2018

package MersennePrimeProject;

import java.math.*;

public class MersennePrimeProject 
{
	public static void main(String[] args) 
	{ 
		BigInteger M,P,S,Two;
		M = new BigInteger("0");
		P = new BigInteger("5");
		Two = new BigInteger("2");
		S = new BigInteger("4");	
		
		System.out.println("  p    2^p-1");
		System.out.println("-------------");
		
		for(int i=1;i<=100;i++)
		{
			M = Two.pow(i);
			M = M.subtract(BigInteger.valueOf(1));	
			P = BigInteger.valueOf(i);
			P = P.subtract(BigInteger.valueOf(2));
			S = BigInteger.valueOf(4);
			
			
			for(BigInteger j = P;j.compareTo(BigInteger.ZERO) > 0;j = j.subtract(BigInteger.ONE)) 
		    {	
				S = S.multiply(S);
				S = S.subtract(BigInteger.valueOf(2));
				S = S.mod(M);
			}	
			
			if(P.compareTo(BigInteger.valueOf(0)) == 0)
			{
				S = BigInteger.ZERO;
			}
			
			if(S.compareTo(BigInteger.ZERO) == 0)
			{
				System.out.format("%-6s","  " + i);
				System.out.print("    " + M + "\n");
			}
		}
	}
}
