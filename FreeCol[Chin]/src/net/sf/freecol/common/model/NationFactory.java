package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>NationFactory</code> implements static methods that return instances of the class <code>{@link Nation}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class NationFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private NationFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Nation}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Nation createNation() {
		return new Nation("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Nation}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Nation createNation2() {
		return new Nation("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}