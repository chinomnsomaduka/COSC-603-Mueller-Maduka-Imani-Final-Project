package net.sf.freecol.common.model;



/**
 * The class <code>GameFactory</code> implements static methods that return instances of the class <code>{@link Game}</code>.
 *
 * @generatedBy CodePro at 5/16/16 10:25 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class GameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/16/16 10:25 PM
	 */
	private GameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:25 PM
	 */
	public static Game createGame() {
		return new Game();
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:25 PM
	 */
	public static Game createGame2() {
		return new Game(new Specification());
	}
}