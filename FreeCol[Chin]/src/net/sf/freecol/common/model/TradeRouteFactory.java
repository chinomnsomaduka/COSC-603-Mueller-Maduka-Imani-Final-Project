package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>TradeRouteFactory</code> implements static methods that return instances of the class <code>{@link TradeRoute}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TradeRouteFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TradeRouteFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TradeRoute}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRoute createTradeRoute() {
		return new TradeRoute(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link TradeRoute}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRoute createTradeRoute2() {
		return new TradeRoute(GameFactory.createGame(), "", new Player(GameFactory.createGame()));
	}


	/**
	 * Create an instance of the class <code>{@link TradeRoute}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRoute createTradeRoute3() {
		return new TradeRoute(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link TradeRoute}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRoute createTradeRoute4() {
		return new TradeRoute(GameFactory.createGame2(), "0123456789", new Player(GameFactory.createGame(), ""));
	}


	/**
	 * Create an instance of the class <code>{@link TradeRoute}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRoute createTradeRoute5() {
		return new TradeRoute((Game) null, "An??t-1.0.txt", new Player(GameFactory.createGame(), new IIOMetadataNode("")));
	}
}