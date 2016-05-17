package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>UnitTypeFactory</code> implements static methods that return instances of the class <code>{@link UnitType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class UnitTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private UnitTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link UnitType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitType createUnitType() {
		return new UnitType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link UnitType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static UnitType createUnitType2() {
		return new UnitType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}