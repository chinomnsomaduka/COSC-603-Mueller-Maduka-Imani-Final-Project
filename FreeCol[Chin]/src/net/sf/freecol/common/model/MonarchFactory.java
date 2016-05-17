package net.sf.freecol.common.model;



/**
 * The class <code>MonarchFactory</code> implements static methods that return instances of the class <code>{@link Monarch}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class MonarchFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private MonarchFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Monarch}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Monarch createMonarch() {
		return new Monarch(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Monarch}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Monarch createMonarch2() {
		return new Monarch(GameFactory.createGame(), new Player(GameFactory.createGame()));
	}


	/**
	 * Create an instance of the class <code>{@link Monarch}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Monarch createMonarch3() {
		return new Monarch(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Monarch}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Monarch createMonarch4() {
		return new Monarch(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""));
	}
}