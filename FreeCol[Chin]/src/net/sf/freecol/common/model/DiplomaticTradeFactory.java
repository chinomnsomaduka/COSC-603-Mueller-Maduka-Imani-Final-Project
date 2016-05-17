package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>DiplomaticTradeFactory</code> implements static methods that return instances of the class <code>{@link DiplomaticTrade}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class DiplomaticTradeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private DiplomaticTradeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(TradeItemFactory.createcreateInciteTradeItem());
		list.add(TradeItemFactory.createcreateInciteTradeItem2());
		list.add(TradeItemFactory.createcreateInciteTradeItem3());
		list.add(TradeItemFactory.createcreateInciteTradeItem4());
		list.add(TradeItemFactory.createcreateInciteTradeItem5());
		list.add(TradeItemFactory.createcreateInciteTradeItem6());
		return new DiplomaticTrade(GameFactory.createGame2(), DiplomaticTrade.TradeContext.DIPLOMATIC, new Player(GameFactory.createGame(), ""), new Player(GameFactory.createGame(), ""), list, 1);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(TradeItemFactory.createcreateInciteTradeItem());
		return new DiplomaticTrade(GameFactory.createGame(), DiplomaticTrade.TradeContext.CONTACT, new Player(GameFactory.createGame()), new Player(GameFactory.createGame()), list, 0);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade3() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(TradeItemFactory.createcreateInciteTradeItem2());
		return new DiplomaticTrade((Game) null, DiplomaticTrade.TradeContext.TRADE, new Player(GameFactory.createGame(), new IIOMetadataNode("")), new Player(GameFactory.createGame(), new IIOMetadataNode("")), list, 7);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade4() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(TradeItemFactory.createcreateInciteTradeItem3());
		return new DiplomaticTrade(GameFactory.createGame(), DiplomaticTrade.TradeContext.TRIBUTE, new Player(GameFactory.createGame2(), "0123456789"), new Player(GameFactory.createGame2(), "0123456789"), list, -1);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(TradeItemFactory.createcreateInciteTradeItem4());
		return new DiplomaticTrade((Game) null, DiplomaticTrade.TradeContext.CONTACT, new Player(GameFactory.createGame2(), new IIOMetadataNode()), new Player(GameFactory.createGame2(), new IIOMetadataNode()), list, Integer.MAX_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade6() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(TradeItemFactory.createcreateInciteTradeItem5());
		return new DiplomaticTrade(GameFactory.createGame(), DiplomaticTrade.TradeContext.DIPLOMATIC, (Player) null, (Player) null, list, Integer.MIN_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade7() {
		return new DiplomaticTrade(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade8() {
		return new DiplomaticTrade(GameFactory.createGame2(), "0123456789");
	}
}