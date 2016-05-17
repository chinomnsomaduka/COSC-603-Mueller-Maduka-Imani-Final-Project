package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>RoleFactory</code> implements static methods that return instances of the class <code>{@link Role}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class RoleFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private RoleFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Role}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Role createRole() {
		return new Role("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link Role}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Role createRole2() {
		return new Role("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}