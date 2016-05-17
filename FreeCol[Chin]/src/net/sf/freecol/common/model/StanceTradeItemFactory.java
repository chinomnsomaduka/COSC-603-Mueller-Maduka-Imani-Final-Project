package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>StanceTradeItemFactory</code> implements static methods that return instances of the class <code>{@link StanceTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class StanceTradeItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private StanceTradeItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link StanceTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static StanceTradeItem createStanceTradeItem()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new StanceTradeItem(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link StanceTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static StanceTradeItem createStanceTradeItem2() {
		return new StanceTradeItem(GameFactory.createGame(), new Player(GameFactory.createGame()), new Player(GameFactory.createGame()), Stance.ALLIANCE);
	}


	/**
	 * Create an instance of the class <code>{@link StanceTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static StanceTradeItem createStanceTradeItem3() {
		return new StanceTradeItem(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), new Player(GameFactory.createGame2(), "0123456789"), Stance.UNCONTACTED);
	}


	/**
	 * Create an instance of the class <code>{@link StanceTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static StanceTradeItem createStanceTradeItem4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new StanceTradeItem(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link StanceTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static StanceTradeItem createStanceTradeItem5() {
		return new StanceTradeItem(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""), new Player(GameFactory.createGame(), ""), Stance.CEASE_FIRE);
	}


	/**
	 * Create an instance of the class <code>{@link StanceTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static StanceTradeItem createStanceTradeItem6() {
		return new StanceTradeItem((Game) null, new Player(GameFactory.createGame(), new IIOMetadataNode("")), new Player(GameFactory.createGame(), new IIOMetadataNode("")), Stance.PEACE);
	}
}