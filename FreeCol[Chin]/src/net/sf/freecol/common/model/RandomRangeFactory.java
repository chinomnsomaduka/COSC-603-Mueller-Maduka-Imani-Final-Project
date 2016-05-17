package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>RandomRangeFactory</code> implements static methods that return instances of the class <code>{@link RandomRange}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class RandomRangeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private RandomRangeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link RandomRange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static RandomRange createRandomRange() {
		return new RandomRange(-1, -1, -1, -1);
	}


	/**
	 * Create an instance of the class <code>{@link RandomRange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static RandomRange createRandomRange2() {
		return new RandomRange(0, 0, 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link RandomRange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static RandomRange createRandomRange3() {
		return new RandomRange(1, 1, 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link RandomRange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static RandomRange createRandomRange4() {
		return new RandomRange(7, 7, 7, 7);
	}


	/**
	 * Create an instance of the class <code>{@link RandomRange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static RandomRange createRandomRange5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new RandomRange(new FreeColXMLReader(File.createTempFile("", "")));
	}
}