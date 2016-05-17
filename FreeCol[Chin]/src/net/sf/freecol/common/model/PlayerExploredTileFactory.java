package net.sf.freecol.common.model;



/**
 * The class <code>PlayerExploredTileFactory</code> implements static methods that return instances of the class <code>{@link PlayerExploredTile}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class PlayerExploredTileFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private PlayerExploredTileFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PlayerExploredTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static PlayerExploredTile createPlayerExploredTile() {
		return new PlayerExploredTile(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link PlayerExploredTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static PlayerExploredTile createPlayerExploredTile2() {
		return new PlayerExploredTile(GameFactory.createGame(), PlayerFactory.createPlayer(), TileFactory.createTile());
	}


	/**
	 * Create an instance of the class <code>{@link PlayerExploredTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static PlayerExploredTile createPlayerExploredTile3() {
		return new PlayerExploredTile(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link PlayerExploredTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static PlayerExploredTile createPlayerExploredTile4() {
		return new PlayerExploredTile(GameFactory.createGame2(), PlayerFactory.createPlayer2(), TileFactory.createTile2());
	}


	/**
	 * Create an instance of the class <code>{@link PlayerExploredTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static PlayerExploredTile createPlayerExploredTile5() {
		return new PlayerExploredTile((Game) null, PlayerFactory.createPlayer3(), TileFactory.createTile3());
	}
}