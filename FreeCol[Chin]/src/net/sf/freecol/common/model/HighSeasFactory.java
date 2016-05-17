package net.sf.freecol.common.model;



/**
 * The class <code>HighSeasFactory</code> implements static methods that return instances of the class <code>{@link HighSeas}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class HighSeasFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private HighSeasFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link HighSeas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HighSeas createHighSeas() {
		return new HighSeas(new Game());
	}


	/**
	 * Create an instance of the class <code>{@link HighSeas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HighSeas createHighSeas2() {
		return new HighSeas(new Game(), "");
	}


	/**
	 * Create an instance of the class <code>{@link HighSeas}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static HighSeas createHighSeas3() {
		return new HighSeas(new Game(new Specification()), "0123456789");
	}
}