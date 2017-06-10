/**
 * 
 */
package appLogic;

/**
 * @author Juri
 *
 */
public class EvenFib implements Problem {
	
	@Override
	public double getSolution(double max) {
		double sum = 0.0;
		for (int i = 1, j = 2; j < max; i += j, j += i) {
			sum = sum + (i % 2 == 0 ? i : 0);
			sum = sum + (j % 2 == 0 ? j : 0);
		}
		return sum;
	}
	
}
