package net.sf.freecol.common.model;



/**
 * The class <code>MarketFactory</code> implements static methods that return instances of the class <code>{@link Market}</code>.
 *
 * @generatedBy CodePro at 5/17/16 2:08 AM
 * @author NFJ6TVK
 * @version $Revision: 1.0 $
 */
public class MarketFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	private MarketFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Market createMarket() {
		return new Market(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Market createMarket2() {
		return new Market(GameFactory.createGame(), PlayerFactory.createPlayer());
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Market createMarket3() {
		return new Market(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Market}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Market createMarket4() {
		return new Market(GameFactory.createGame2(), PlayerFactory.createPlayer2());
	}
}