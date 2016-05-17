package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>TradeRouteStopFactory</code> implements static methods that return instances of the class <code>{@link TradeRouteStop}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TradeRouteStopFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TradeRouteStopFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TradeRouteStop}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRouteStop createTradeRouteStop() {
		return new TradeRouteStop(GameFactory.createGame());
	}


	/**
	 * Create an instance of the class <code>{@link TradeRouteStop}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRouteStop createTradeRouteStop2() {
		return new TradeRouteStop(GameFactory.createGame(), LocationFactory.createcreateHighSeas());
	}


	/**
	 * Create an instance of the class <code>{@link TradeRouteStop}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRouteStop createTradeRouteStop3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new TradeRouteStop(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link TradeRouteStop}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRouteStop createTradeRouteStop4() {
		return new TradeRouteStop(GameFactory.createGame2(), LocationFactory.createcreateHighSeas2());
	}


	/**
	 * Create an instance of the class <code>{@link TradeRouteStop}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRouteStop createTradeRouteStop5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new TradeRouteStop(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link TradeRouteStop}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TradeRouteStop createTradeRouteStop6() {
		return new TradeRouteStop((TradeRouteStop) null);
	}
}