package net.sf.freecol.common.model;



/**
 * The class <code>EuropeWasFactory</code> implements static methods that return instances of the class <code>{@link EuropeWas}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class EuropeWasFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private EuropeWasFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link EuropeWas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static EuropeWas createEuropeWas() {
		return new EuropeWas(EuropeFactory.createEurope());
	}
}