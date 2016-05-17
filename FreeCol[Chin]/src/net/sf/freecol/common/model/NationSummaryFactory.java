package net.sf.freecol.common.model;



/**
 * The class <code>NationSummaryFactory</code> implements static methods that return instances of the class <code>{@link NationSummary}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class NationSummaryFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private NationSummaryFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link NationSummary}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationSummary createNationSummary() {
		return new NationSummary();
	}


	/**
	 * Create an instance of the class <code>{@link NationSummary}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationSummary createNationSummary2() {
		return new NationSummary(new Player(GameFactory.createGame()), new Player(GameFactory.createGame()));
	}


	/**
	 * Create an instance of the class <code>{@link NationSummary}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static NationSummary createNationSummary3() {
		return new NationSummary(new Player(GameFactory.createGame(), ""), new Player(GameFactory.createGame(), ""));
	}
}