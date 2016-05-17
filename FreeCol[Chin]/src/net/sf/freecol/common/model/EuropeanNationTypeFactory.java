package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>EuropeanNationTypeFactory</code> implements static methods that return instances of the class <code>{@link EuropeanNationType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class EuropeanNationTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private EuropeanNationTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link EuropeanNationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static EuropeanNationType createEuropeanNationType() {
		return new EuropeanNationType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link EuropeanNationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static EuropeanNationType createEuropeanNationType2() {
		return new EuropeanNationType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}