package net.sf.freecol.common.model;



/**
 * The class <code>CombatModelFactory</code> implements static methods that return instances of the class <code>{@link CombatModel}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class CombatModelFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private CombatModelFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CombatModel}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static CombatModel createCombatModel() {
		return new SimpleCombatModel();
	}
}