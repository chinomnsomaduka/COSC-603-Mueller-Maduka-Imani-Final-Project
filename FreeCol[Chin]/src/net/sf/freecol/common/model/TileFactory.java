package net.sf.freecol.common.model;



/**
 * The class <code>TileFactory</code> implements static methods that return instances of the class <code>{@link Tile}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TileFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TileFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Tile createTile() {
		return new Tile(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Tile createTile2() {
		return new Tile(GameFactory.createGame(), TileTypeFactory.createLAND(), 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Tile createTile3() {
		return new Tile(GameFactory.createGame(), TileTypeFactory.createWATER(), -1, -1);
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Tile createTile4() {
		return new Tile(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Tile createTile5() {
		return new Tile(GameFactory.createGame2(), TileTypeFactory.createTileType(), 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Tile createTile6() {
		return new Tile((Game) null, TileTypeFactory.createTileType2(), 7, 7);
	}
}