package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>UnitTypeChangeFactory</code> implements static methods that return instances of the class <code>{@link UnitTypeChange}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class UnitTypeChangeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private UnitTypeChangeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link UnitTypeChange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTypeChange createUnitTypeChange()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new UnitTypeChange(new FreeColXMLReader(File.createTempFile("", "")), new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link UnitTypeChange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTypeChange createUnitTypeChange2()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new UnitTypeChange(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link UnitTypeChange}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitTypeChange createUnitTypeChange3() {
		return new UnitTypeChange(new Specification());
	}
}