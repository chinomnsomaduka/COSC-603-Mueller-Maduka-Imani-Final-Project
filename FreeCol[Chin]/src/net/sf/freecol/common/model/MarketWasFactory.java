package net.sf.freecol.common.model;



/**
 * The class <code>MarketWasFactory</code> implements static methods that return instances of the class <code>{@link MarketWas}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class MarketWasFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private MarketWasFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link MarketWas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static MarketWas createMarketWas() {
		return new MarketWas(new Player(GameFactory.createGame()));
	}
}