//****Project 3 / Approximate e****
//
//Author: Scott Tabaka
//Instructor: Steve Riegerix
//Class: CMPSCI 2700(Fall 2018)
//Due Date: October 7, 2018

package ApproxEProject;

import java.math.*;

public class ApproxEProject 
{
	public static void main(String[] args) 
	{
		BigDecimal E = new BigDecimal(1.0);
		BigDecimal Numerator = new BigDecimal(1.0);
		BigDecimal Denominator = new BigDecimal(1.0);

		for (int i = 1;i <= 1000;i += 1)
        {	
			Denominator = BigDecimal.valueOf(1);
        	Denominator = Denominator.multiply(BigDecimal.valueOf(i));
        	Numerator = Numerator.divide(Denominator, 25, RoundingMode.HALF_UP);
        	E = E.add(Numerator);
        	
        	if((i%100)==0)
        	{
        		System.out.format("%-10s","  " + i + "  ");
        		System.out.println(E);	
        	}
        }
	}
}
