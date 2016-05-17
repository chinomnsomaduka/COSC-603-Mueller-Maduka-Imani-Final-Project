package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>AbstractUnitFactory</code> implements static methods that return instances of the class <code>{@link AbstractUnit}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class AbstractUnitFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private AbstractUnitFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit() {
		return new AbstractUnit("", "", 0);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit2() {
		return new AbstractUnit("0123456789", "0123456789", 1);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit3() {
		return new AbstractUnit("An??t-1.0.txt", "An??t-1.0.txt", 7);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit4() {
		return new AbstractUnit();
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit5() {
		return new AbstractUnit(UnitTypeFactory.createUnitType(), "", 0);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit6() {
		return new AbstractUnit(UnitTypeFactory.createUnitType2(), "0123456789", 1);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit7()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new AbstractUnit(new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link AbstractUnit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractUnit createAbstractUnit8() {
		return new AbstractUnit((UnitType) null, "An??t-1.0.txt", 7);
	}
}