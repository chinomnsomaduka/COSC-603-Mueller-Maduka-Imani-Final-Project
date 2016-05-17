package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>UnitTradeItemFactory</code> implements static methods that return instances of the class <code>{@link UnitTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class UnitTradeItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private UnitTradeItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link UnitTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTradeItem createUnitTradeItem()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new UnitTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link UnitTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTradeItem createUnitTradeItem2() {
		return new UnitTradeItem(GameFactory.createGame(), new Player(GameFactory.createGame()), new Player(GameFactory.createGame()), UnitFactory.createUnit());
	}


	/**
	 * Create an instance of the class <code>{@link UnitTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTradeItem createUnitTradeItem3() {
		return new UnitTradeItem(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), new Player(GameFactory.createGame2(), "0123456789"), UnitFactory.createUnit4());
	}


	/**
	 * Create an instance of the class <code>{@link UnitTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTradeItem createUnitTradeItem4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new UnitTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link UnitTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTradeItem createUnitTradeItem5() {
		return new UnitTradeItem(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""), new Player(GameFactory.createGame(), ""), UnitFactory.createUnit2());
	}


	/**
	 * Create an instance of the class <code>{@link UnitTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTradeItem createUnitTradeItem6() {
		return new UnitTradeItem((Game) null, new Player(GameFactory.createGame(), new IIOMetadataNode("")), new Player(GameFactory.createGame(), new IIOMetadataNode("")), UnitFactory.createUnit3());
	}
}