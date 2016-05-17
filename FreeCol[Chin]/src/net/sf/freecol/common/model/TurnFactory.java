package net.sf.freecol.common.model;



/**
 * The class <code>TurnFactory</code> implements static methods that return instances of the class <code>{@link Turn}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TurnFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private TurnFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Turn}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Turn createTurn() {
		return new Turn(0);
	}
}