package net.sf.freecol.common.model;



/**
 * The class <code>TileItemContainerFactory</code> implements static methods that return instances of the class <code>{@link TileItemContainer}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TileItemContainerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TileItemContainerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer() {
		return new TileItemContainer(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer2() {
		return new TileItemContainer(GameFactory.createGame(), TileFactory.createTile());
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer3() {
		return new TileItemContainer(GameFactory.createGame(), TileFactory.createTile(), (TileItemContainer) null, Map.Layer.ALL);
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer4() {
		return new TileItemContainer(GameFactory.createGame(), (Tile) null, (TileItemContainer) null, Map.Layer.NONE);
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer5() {
		return new TileItemContainer(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer6() {
		return new TileItemContainer(GameFactory.createGame2(), TileFactory.createTile2());
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer7() {
		return new TileItemContainer(GameFactory.createGame2(), TileFactory.createTile3(), (TileItemContainer) null, Map.Layer.LAND);
	}


	/**
	 * Create an instance of the class <code>{@link TileItemContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItemContainer createTileItemContainer8() {
		return new TileItemContainer((Game) null, TileFactory.createTile5(), (TileItemContainer) null, Map.Layer.NATIVES);
	}
}