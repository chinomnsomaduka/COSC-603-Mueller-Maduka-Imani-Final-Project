package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * The class <code>DiplomaticTradeFactory</code> implements static methods that return instances of the class <code>{@link DiplomaticTrade}</code>.
 *
 * @generatedBy CodePro at 5/17/16 2:08 AM
 * @author NFJ6TVK
 * @version $Revision: 1.0 $
 */
public class DiplomaticTradeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	private DiplomaticTradeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), new Colony(GameFactory.createGame(), "")));
		list.add(new ColonyTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), new Colony(GameFactory.createGame2(), "0123456789")));
		list.add(new ColonyTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		list.add(new ColonyTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), new Colony(GameFactory.createGame(), PlayerFactory.createPlayer(), "", new Tile(GameFactory.createGame(), ""))));
		list.add(new ColonyTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		list.add(new ColonyTradeItem((Game) null, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), new Colony(GameFactory.createGame(), PlayerFactory.createPlayer4(), (String) null, (Tile) null)));
		list.add(new GoldTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		list.add(new GoldTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		list.add(new GoodsTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), new Goods(GameFactory.createGame(), "")));
		list.add(new GoodsTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), new Goods(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))))));
		list.add(new GoodsTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		list.add(new GoodsTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), new Goods(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")))));
		list.add(new GoodsTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		list.add(new GoodsTradeItem((Game) null, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), new Goods(GameFactory.createGame2(), "0123456789")));
		list.add(new InciteTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer()));
		list.add(new InciteTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4()));
		list.add(new InciteTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		list.add(new InciteTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2()));
		list.add(new InciteTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		list.add(new InciteTradeItem((Game) null, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3()));
		list.add(new StanceTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		list.add(new StanceTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		list.add(new UnitTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), UnitFactory.createUnit()));
		list.add(new UnitTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), UnitFactory.createUnit4()));
		list.add(new UnitTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		list.add(new UnitTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), UnitFactory.createUnit2()));
		list.add(new UnitTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		list.add(new UnitTradeItem((Game) null, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), UnitFactory.createUnit3()));
		return new DiplomaticTrade(GameFactory.createGame2(), DiplomaticTrade.TradeContext.DIPLOMATIC, PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), list, 1);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade2() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), new Colony(GameFactory.createGame(), "")));
		return new DiplomaticTrade(GameFactory.createGame(), DiplomaticTrade.TradeContext.CONTACT, PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), list, 0);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade3() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), new Colony(GameFactory.createGame2(), "0123456789")));
		return new DiplomaticTrade((Game) null, DiplomaticTrade.TradeContext.TRADE, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), list, 7);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", ""))));
		return new DiplomaticTrade(GameFactory.createGame(), DiplomaticTrade.TradeContext.TRIBUTE, PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), list, -1);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade5() {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), new Colony(GameFactory.createGame(), PlayerFactory.createPlayer(), "", new Tile(GameFactory.createGame(), ""))));
		return new DiplomaticTrade((Game) null, DiplomaticTrade.TradeContext.CONTACT, PlayerFactory.createPlayer5(), PlayerFactory.createPlayer5(), list, Integer.MAX_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade6()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		ArrayList<TradeItem> list = new ArrayList<TradeItem>();
		list.add(new ColonyTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())))));
		return new DiplomaticTrade(GameFactory.createGame(), DiplomaticTrade.TradeContext.DIPLOMATIC, (Player) null, (Player) null, list, Integer.MIN_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade7() {
		return new DiplomaticTrade(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link DiplomaticTrade}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static DiplomaticTrade createDiplomaticTrade8() {
		return new DiplomaticTrade(GameFactory.createGame2(), "0123456789");
	}
}