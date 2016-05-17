package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>NationTypeFactory</code> implements static methods that return instances of the class <code>{@link NationType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class NationTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private NationTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link NationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationType createNationType() {
		return new EuropeanNationType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link NationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationType createNationType2() {
		return new EuropeanNationType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}


	/**
	 * Create an instance of the class <code>{@link NationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationType createNationType3() {
		return new IndianNationType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link NationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationType createNationType4() {
		return new IndianNationType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}