package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>InciteTradeItemFactory</code> implements static methods that return instances of the class <code>{@link InciteTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class InciteTradeItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private InciteTradeItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link InciteTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static InciteTradeItem createInciteTradeItem()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new InciteTradeItem(new Game(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link InciteTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static InciteTradeItem createInciteTradeItem2() {
		return new InciteTradeItem(new Game(), new Player(new Game()), new Player(new Game()), new Player(new Game()));
	}


	/**
	 * Create an instance of the class <code>{@link InciteTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static InciteTradeItem createInciteTradeItem3() {
		return new InciteTradeItem(new Game(), new Player(new Game(new Specification()), "0123456789"), new Player(new Game(new Specification()), "0123456789"), new Player(new Game(new Specification()), "0123456789"));
	}


	/**
	 * Create an instance of the class <code>{@link InciteTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static InciteTradeItem createInciteTradeItem4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new InciteTradeItem(new Game(new Specification()), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link InciteTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static InciteTradeItem createInciteTradeItem5() {
		return new InciteTradeItem(new Game(new Specification()), new Player(new Game(), ""), new Player(new Game(), ""), new Player(new Game(), ""));
	}


	/**
	 * Create an instance of the class <code>{@link InciteTradeItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static InciteTradeItem createInciteTradeItem6() {
		return new InciteTradeItem((Game) null, new Player(new Game(), new IIOMetadataNode("")), new Player(new Game(), new IIOMetadataNode("")), new Player(new Game(), new IIOMetadataNode("")));
	}
}