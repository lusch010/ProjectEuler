/**
 * 
 */
package appLogic;

/**
 * @author Juri
 *
 */
public class Multiples implements Problem {

	@Override
	public double getSolution(double max) {
		double sum = 0.0;
		for (int i = 3; i <= max; i++) {
			if (isMultiple(i))
				sum += i;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param i
	 * @return true if i is multiple of 3 or 5
	 */
	private boolean isMultiple(int i) {
		if (i % 3 == 0 || i % 5 == 0)
			return true;
		
		return false;
	}
	
}
