package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>PlayerFactory</code> implements static methods that return instances of the class <code>{@link Player}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class PlayerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private PlayerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Player createPlayer() {
		return new Player(GameFactory.createGame());
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Player createPlayer2() {
		return new Player(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Player createPlayer3() {
		return new Player(GameFactory.createGame(), new IIOMetadataNode(""));
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Player createPlayer4() {
		return new Player(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static Player createPlayer5() {
		return new Player(GameFactory.createGame2(), new IIOMetadataNode());
	}
}