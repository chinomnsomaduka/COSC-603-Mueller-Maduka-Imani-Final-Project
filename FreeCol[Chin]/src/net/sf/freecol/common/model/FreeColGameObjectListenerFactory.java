package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.server.ai.AIMain;
import net.sf.freecol.server.FreeColServer;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>FreeColGameObjectListenerFactory</code> implements static methods that return instances of the class <code>{@link FreeColGameObjectListener}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class FreeColGameObjectListenerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private FreeColGameObjectListenerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FreeColGameObjectListener}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static FreeColGameObjectListener createFreeColGameObjectListener() {
		return new AIMain((FreeColServer) null);
	}


	/**
	 * Create an instance of the class <code>{@link FreeColGameObjectListener}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static FreeColGameObjectListener createFreeColGameObjectListener2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new AIMain((FreeColServer) null, new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link FreeColGameObjectListener}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static FreeColGameObjectListener createFreeColGameObjectListener3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new AIMain((FreeColServer) null, new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}
}