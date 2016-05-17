package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>MapFactory</code> implements static methods that return instances of the class <code>{@link Map}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class MapFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private MapFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap() {
		return new Map(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap2() {
		return new Map(GameFactory.createGame(), 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Map(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap4() {
		return new Map(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap5() {
		return new Map(GameFactory.createGame2(), 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap6()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Map(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link Map}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Map createMap7() {
		return new Map((Game) null, 7, 7);
	}
}