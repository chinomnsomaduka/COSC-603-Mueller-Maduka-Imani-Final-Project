package net.sf.freecol.common.model;



/**
 * The class <code>IndianNationTypeFactory</code> implements static methods that return instances of the class <code>{@link IndianNationType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class IndianNationTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private IndianNationTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link IndianNationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static IndianNationType createIndianNationType() {
		return new IndianNationType("", SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link IndianNationType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static IndianNationType createIndianNationType2() {
		return new IndianNationType("0123456789", SpecificationFactory.createSpecification2());
	}
}