package net.sf.freecol.common.model;



/**
 * The class <code>MarketDataFactory</code> implements static methods that return instances of the class <code>{@link MarketData}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class MarketDataFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private MarketDataFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link MarketData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static MarketData createMarketData() {
		return new MarketData(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link MarketData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static MarketData createMarketData2() {
		return new MarketData(GameFactory.createGame(), GoodsTypeFactory.createGoodsType());
	}


	/**
	 * Create an instance of the class <code>{@link MarketData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static MarketData createMarketData3() {
		return new MarketData(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link MarketData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static MarketData createMarketData4() {
		return new MarketData(GameFactory.createGame2(), GoodsTypeFactory.createGoodsType2());
	}
}