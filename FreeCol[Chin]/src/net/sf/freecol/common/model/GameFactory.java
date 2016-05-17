package net.sf.freecol.common.model;



/**
 * The class <code>GameFactory</code> implements static methods that return instances of the class <code>{@link Game}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private GameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Game createGame() {
		return new Game();
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Game createGame2() {
		return new Game(new Specification());
	}
}