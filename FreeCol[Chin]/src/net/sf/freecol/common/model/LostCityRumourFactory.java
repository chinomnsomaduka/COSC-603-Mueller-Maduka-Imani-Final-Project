package net.sf.freecol.common.model;



/**
 * The class <code>LostCityRumourFactory</code> implements static methods that return instances of the class <code>{@link LostCityRumour}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class LostCityRumourFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private LostCityRumourFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour() {
		return new LostCityRumour(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour2() {
		return new LostCityRumour(GameFactory.createGame(), TileFactory.createTile());
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour3() {
		return new LostCityRumour(GameFactory.createGame(), TileFactory.createTile(), LostCityRumour.RumourType.BURIAL_GROUND, "");
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour4() {
		return new LostCityRumour(GameFactory.createGame(), TileFactory.createTile4(), LostCityRumour.RumourType.EXPEDITION_VANISHES, (String) null);
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour5() {
		return new LostCityRumour(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour6() {
		return new LostCityRumour(GameFactory.createGame2(), TileFactory.createTile2());
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour7() {
		return new LostCityRumour(GameFactory.createGame2(), TileFactory.createTile2(), LostCityRumour.RumourType.CIBOLA, "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link LostCityRumour}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static LostCityRumour createLostCityRumour8() {
		return new LostCityRumour((Game) null, TileFactory.createTile3(), LostCityRumour.RumourType.COLONIST, "An??t-1.0.txt");
	}
}