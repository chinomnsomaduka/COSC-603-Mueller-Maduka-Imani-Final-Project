package net.sf.freecol.common.model;



/**
 * The class <code>TileImprovementFactory</code> implements static methods that return instances of the class <code>{@link TileImprovement}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TileImprovementFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TileImprovementFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement() {
		return new TileImprovement(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement2() {
		return new TileImprovement(GameFactory.createGame(), TileFactory.createTile(), TileImprovementTypeFactory.createTileImprovementType());
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement3() {
		return new TileImprovement(GameFactory.createGame(), TileFactory.createTile(), (TileImprovement) null);
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement4() {
		return new TileImprovement(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement5() {
		return new TileImprovement(GameFactory.createGame2(), TileFactory.createTile2(), TileImprovementTypeFactory.createTileImprovementType2());
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement6() {
		return new TileImprovement(GameFactory.createGame2(), TileFactory.createTile2(), (TileImprovement) null);
	}


	/**
	 * Create an instance of the class <code>{@link TileImprovement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileImprovement createTileImprovement7() {
		return new TileImprovement((Game) null, TileFactory.createTile3(), (TileImprovementType) null);
	}
}