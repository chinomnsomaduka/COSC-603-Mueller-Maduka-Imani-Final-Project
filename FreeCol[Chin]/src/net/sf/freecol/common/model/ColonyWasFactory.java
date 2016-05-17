package net.sf.freecol.common.model;



/**
 * The class <code>ColonyWasFactory</code> implements static methods that return instances of the class <code>{@link ColonyWas}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ColonyWasFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private ColonyWasFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ColonyWas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ColonyWas createColonyWas() {
		return new ColonyWas(ColonyFactory.createColony());
	}
}