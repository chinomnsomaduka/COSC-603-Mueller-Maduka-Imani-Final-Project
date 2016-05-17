package net.sf.freecol.common.model;



/**
 * The class <code>RegionFactory</code> implements static methods that return instances of the class <code>{@link Region}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class RegionFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private RegionFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Region}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Region createRegion() {
		return new Region(GameFactory.createGame());
	}


	/**
	 * Create an instance of the class <code>{@link Region}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Region createRegion2() {
		return new Region(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Region}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Region createRegion3() {
		return new Region(GameFactory.createGame2(), "0123456789");
	}
}