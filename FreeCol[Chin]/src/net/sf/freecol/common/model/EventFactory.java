package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>EventFactory</code> implements static methods that return instances of the class <code>{@link Event}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class EventFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private EventFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Event}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Event createEvent() {
		return new Event("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Event}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Event createEvent2() {
		return new Event("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link Event}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Event createEvent3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Event(new FreeColXMLReader(File.createTempFile("", "")), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Event}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Event createEvent4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Event(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), new Specification(new ByteArrayInputStream("".getBytes())));
	}
}