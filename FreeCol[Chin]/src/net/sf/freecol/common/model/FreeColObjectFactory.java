package net.sf.freecol.common.model;



/**
 * The class <code>FreeColObjectFactory</code> implements static methods that return instances of the class <code>{@link FreeColObject}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class FreeColObjectFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private FreeColObjectFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FreeColObject}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static FreeColObject createFreeColObject()
		throws ClassNotFoundException {
		return FreeColObject.newInstance(Class.forName(""));
	}
}