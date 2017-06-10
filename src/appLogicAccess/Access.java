/**
 * 
 */
package appLogicAccess;

import appLogic.EvenFib;
import appLogic.Multiples;
import appLogic.PrimeFactorization;

/**
 * @author Juri
 *
 */
public class Access {
	
	public static double[] maxValues;

	public static double getSolution(int i, double max) {
		double result = 0.0;
		
		switch(i) {
		case 0:
			Multiples mult = new Multiples();
			result = mult.getSolution(max);
			break;
		case 1:
			EvenFib evenfib = new EvenFib();
			result = evenfib.getSolution(max);
			break;
		case 2:
			PrimeFactorization primefact = new PrimeFactorization();
			result = primefact.getSolution(max);
			break;
		default:
			break;
		}
		
		return result;
	}

	public static double getMax(int i) {
		if (i >= maxValues.length)
			return 0;
		return maxValues[i];
	}

	// TODO: implement load function
	public static void loadMaxValues() {
		maxValues = new double[3];
		maxValues[0] = 999.0;
		maxValues[1] = 4000000.0;
		maxValues[2] = 600851475143.0;
	}
	
}
