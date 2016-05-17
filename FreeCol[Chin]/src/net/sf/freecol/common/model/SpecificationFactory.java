package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>SpecificationFactory</code> implements static methods that return instances of the class <code>{@link Specification}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class SpecificationFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private SpecificationFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Specification}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Specification createSpecification() {
		return new Specification();
	}


	/**
	 * Create an instance of the class <code>{@link Specification}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Specification createSpecification2() {
		return new Specification(new ByteArrayInputStream("".getBytes()));
	}


	/**
	 * Create an instance of the class <code>{@link Specification}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Specification createSpecification3()
		throws java.io.IOException {
		return new Specification(new FreeColXMLReader(File.createTempFile("", "")));
	}
}