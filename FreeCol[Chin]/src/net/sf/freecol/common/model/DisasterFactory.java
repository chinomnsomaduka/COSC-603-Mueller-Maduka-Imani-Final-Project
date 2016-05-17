package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>DisasterFactory</code> implements static methods that return instances of the class <code>{@link Disaster}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class DisasterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private DisasterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Disaster}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Disaster createDisaster() {
		return new Disaster("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Disaster}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Disaster createDisaster2() {
		return new Disaster("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}