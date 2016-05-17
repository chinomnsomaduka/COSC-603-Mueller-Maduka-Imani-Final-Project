package net.sf.freecol.common.model;

import java.io.File;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>HistoryEventFactory</code> implements static methods that return instances of the class <code>{@link HistoryEvent}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class HistoryEventFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private HistoryEventFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link HistoryEvent}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HistoryEvent createHistoryEvent() {
		return new HistoryEvent();
	}


	/**
	 * Create an instance of the class <code>{@link HistoryEvent}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HistoryEvent createHistoryEvent2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new HistoryEvent(new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link HistoryEvent}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HistoryEvent createHistoryEvent3() {
		return new HistoryEvent(new Turn(0), HistoryEvent.HistoryEventType.ABANDON_COLONY, new Player(new Game()));
	}


	/**
	 * Create an instance of the class <code>{@link HistoryEvent}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HistoryEvent createHistoryEvent4() {
		return new HistoryEvent(new Turn(0), HistoryEvent.HistoryEventType.CITY_OF_GOLD, new Player(new Game(), new IIOMetadataNode("")));
	}


	/**
	 * Create an instance of the class <code>{@link HistoryEvent}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HistoryEvent createHistoryEvent5() {
		return new HistoryEvent((Turn) null, HistoryEvent.HistoryEventType.CEASE_FIRE, new Player(new Game(), ""));
	}
}