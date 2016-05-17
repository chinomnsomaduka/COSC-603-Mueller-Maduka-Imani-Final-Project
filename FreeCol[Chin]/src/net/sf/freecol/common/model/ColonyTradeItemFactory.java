package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>ColonyTradeItemFactory</code> implements static methods that return instances of the class <code>{@link ColonyTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ColonyTradeItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private ColonyTradeItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyTradeItem createColonyTradeItem() {
		return new ColonyTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer(), PlayerFactory.createPlayer(), ColonyFactory.createColony());
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyTradeItem createColonyTradeItem2() {
		return new ColonyTradeItem(GameFactory.createGame(), PlayerFactory.createPlayer4(), PlayerFactory.createPlayer4(), ColonyFactory.createColony4());
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyTradeItem createColonyTradeItem3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new ColonyTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyTradeItem createColonyTradeItem4() {
		return new ColonyTradeItem(GameFactory.createGame2(), PlayerFactory.createPlayer2(), PlayerFactory.createPlayer2(), ColonyFactory.createColony2());
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyTradeItem createColonyTradeItem5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new ColonyTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyTradeItem createColonyTradeItem6() {
		return new ColonyTradeItem((Game) null, PlayerFactory.createPlayer3(), PlayerFactory.createPlayer3(), ColonyFactory.createColony3());
	}
}