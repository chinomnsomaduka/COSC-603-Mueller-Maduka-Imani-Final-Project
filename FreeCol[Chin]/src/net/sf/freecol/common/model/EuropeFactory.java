package net.sf.freecol.common.model;



/**
 * The class <code>EuropeFactory</code> implements static methods that return instances of the class <code>{@link Europe}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class EuropeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private EuropeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Europe}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Europe createEurope() {
		return new Europe(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Europe}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Europe createEurope2() {
		return new Europe(GameFactory.createGame(), new Player(GameFactory.createGame()));
	}


	/**
	 * Create an instance of the class <code>{@link Europe}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Europe createEurope3() {
		return new Europe(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Europe}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Europe createEurope4() {
		return new Europe(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""));
	}
}