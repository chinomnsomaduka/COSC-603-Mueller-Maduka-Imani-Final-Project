package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>GoldTradeItemFactory</code> implements static methods that return instances of the class <code>{@link GoldTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GoldTradeItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private GoldTradeItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link GoldTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoldTradeItem createGoldTradeItem()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new GoldTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link GoldTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoldTradeItem createGoldTradeItem2() {
		return new GoldTradeItem(GameFactory.createGame(), new Player(GameFactory.createGame()), new Player(GameFactory.createGame()), 0);
	}


	/**
	 * Create an instance of the class <code>{@link GoldTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoldTradeItem createGoldTradeItem3() {
		return new GoldTradeItem(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), new Player(GameFactory.createGame2(), "0123456789"), -1);
	}


	/**
	 * Create an instance of the class <code>{@link GoldTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoldTradeItem createGoldTradeItem4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new GoldTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link GoldTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoldTradeItem createGoldTradeItem5() {
		return new GoldTradeItem(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""), new Player(GameFactory.createGame(), ""), 1);
	}


	/**
	 * Create an instance of the class <code>{@link GoldTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoldTradeItem createGoldTradeItem6() {
		return new GoldTradeItem((Game) null, new Player(GameFactory.createGame(), new IIOMetadataNode("")), new Player(GameFactory.createGame(), new IIOMetadataNode("")), 7);
	}
}