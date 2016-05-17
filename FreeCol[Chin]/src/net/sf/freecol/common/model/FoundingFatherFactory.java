package net.sf.freecol.common.model;



/**
 * The class <code>FoundingFatherFactory</code> implements static methods that return instances of the class <code>{@link FoundingFather}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class FoundingFatherFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private FoundingFatherFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FoundingFather}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static FoundingFather createFoundingFather() {
		return new FoundingFather("", SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link FoundingFather}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static FoundingFather createFoundingFather2() {
		return new FoundingFather("0123456789", SpecificationFactory.createSpecification2());
	}
}