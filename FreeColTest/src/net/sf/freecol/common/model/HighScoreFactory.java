package net.sf.freecol.common.model;

import java.io.File;
import java.util.Date;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>HighScoreFactory</code> implements static methods that return instances of the class <code>{@link HighScore}</code>.
 *
 * @generatedBy CodePro at 5/16/16 11:13 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class HighScoreFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	private HighScoreFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link HighScore}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	public static HighScore createHighScore() {
		return new HighScore();
	}


	/**
	 * Create an instance of the class <code>{@link HighScore}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	public static HighScore createHighScore2() {
		return new HighScore(PlayerFactory.createPlayer(), new Date(1591115236000L));
	}


	/**
	 * Create an instance of the class <code>{@link HighScore}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	public static HighScore createHighScore3() {
		return new HighScore(PlayerFactory.createPlayer2(), new Date(644344036000L));
	}


	/**
	 * Create an instance of the class <code>{@link HighScore}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	public static HighScore createHighScore4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new HighScore(new FreeColXMLReader(File.createTempFile("", "")));
	}
}