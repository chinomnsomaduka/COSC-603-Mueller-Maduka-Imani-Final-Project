package net.sf.freecol.common.model;



/**
 * The class <code>ColonyTileFactory</code> implements static methods that return instances of the class <code>{@link ColonyTile}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ColonyTileFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ColonyTileFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ColonyTile createColonyTile() {
		return new ColonyTile(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ColonyTile createColonyTile2() {
		return new ColonyTile(GameFactory.createGame(), new Colony(GameFactory.createGame(), ""), TileFactory.createTile());
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ColonyTile createColonyTile3() {
		return new ColonyTile(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ColonyTile createColonyTile4() {
		return new ColonyTile(GameFactory.createGame2(), new Colony(GameFactory.createGame(), new Player(GameFactory.createGame()), "", TileFactory.createTile()), TileFactory.createTile2());
	}


	/**
	 * Create an instance of the class <code>{@link ColonyTile}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ColonyTile createColonyTile5() {
		return new ColonyTile((Game) null, new Colony(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), (String) null, TileFactory.createTile4()), TileFactory.createTile3());
	}
}