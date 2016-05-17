package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>GoodsTradeItemFactory</code> implements static methods that return instances of the class <code>{@link GoodsTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GoodsTradeItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private GoodsTradeItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link GoodsTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static GoodsTradeItem createGoodsTradeItem() {
		return new GoodsTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), GoodsFactory.createGoods());
	}


	/**
	 * Create an instance of the class <code>{@link GoodsTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static GoodsTradeItem createGoodsTradeItem2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new GoodsTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), GoodsFactory.createGoods4());
	}


	/**
	 * Create an instance of the class <code>{@link GoodsTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static GoodsTradeItem createGoodsTradeItem3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new GoodsTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link GoodsTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static GoodsTradeItem createGoodsTradeItem4() {
		return new GoodsTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), GoodsFactory.createGoods2());
	}


	/**
	 * Create an instance of the class <code>{@link GoodsTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static GoodsTradeItem createGoodsTradeItem5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new GoodsTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link GoodsTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static GoodsTradeItem createGoodsTradeItem6() {
		return new GoodsTradeItem((Game) null, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), GoodsFactory.createGoods3());
	}
}