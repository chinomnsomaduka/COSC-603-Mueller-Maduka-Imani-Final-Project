package net.sf.freecol.common.model;



/**
 * The class <code>MarketFactory</code> implements static methods that return instances of the class <code>{@link Market}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class MarketFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private MarketFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Market createMarket() {
		return new Market(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Market createMarket2() {
		return new Market(GameFactory.createGame(), new Player(GameFactory.createGame()));
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Market createMarket3() {
		return new Market(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Market createMarket4() {
		return new Market(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""));
	}
}