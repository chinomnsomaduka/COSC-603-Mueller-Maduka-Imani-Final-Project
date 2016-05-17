package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>ColonyFactory</code> implements static methods that return instances of the class <code>{@link Colony}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ColonyFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ColonyFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Colony}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Colony createColony() {
		return new Colony(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Colony}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Colony createColony2() {
		return new Colony(GameFactory.createGame(), new Player(GameFactory.createGame()), "", TileFactory.createTile());
	}


	/**
	 * Create an instance of the class <code>{@link Colony}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Colony createColony3() {
		return new Colony(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), (String) null, TileFactory.createTile4());
	}


	/**
	 * Create an instance of the class <code>{@link Colony}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Colony createColony4() {
		return new Colony(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Colony}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Colony createColony5() {
		return new Colony(GameFactory.createGame2(), new Player(GameFactory.createGame(), ""), "0123456789", TileFactory.createTile2());
	}


	/**
	 * Create an instance of the class <code>{@link Colony}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Colony createColony6() {
		return new Colony((Game) null, new Player(GameFactory.createGame(), new IIOMetadataNode("")), "An??t-1.0.txt", TileFactory.createTile3());
	}
}