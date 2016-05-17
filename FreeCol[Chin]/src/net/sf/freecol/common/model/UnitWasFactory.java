package net.sf.freecol.common.model;



/**
 * The class <code>UnitWasFactory</code> implements static methods that return instances of the class <code>{@link UnitWas}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class UnitWasFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private UnitWasFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link UnitWas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static UnitWas createUnitWas() {
		return new UnitWas(UnitFactory.createUnit());
	}
}