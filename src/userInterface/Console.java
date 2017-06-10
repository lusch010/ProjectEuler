/**
 * 
 */
package userInterface;

import appLogicAccess.Access;

/**
 * @author Juri
 *
 */
public class Console {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Access.getSolution(1, 999.0));
		System.out.println(Access.getSolution(2, 4000000.0));
		System.out.println(Access.getSolution(3, 600851475143.0));
	}
	
}
