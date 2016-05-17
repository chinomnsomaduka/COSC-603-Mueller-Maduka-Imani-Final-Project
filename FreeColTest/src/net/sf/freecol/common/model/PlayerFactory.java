package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>PlayerFactory</code> implements static methods that return instances of the class <code>{@link Player}</code>.
 *
 * @generatedBy CodePro at 5/16/16 10:05 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class PlayerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/16/16 10:05 PM
	 */
	private PlayerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:05 PM
	 */
	public static Player createPlayer() {
		return new Player(new Game());
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:05 PM
	 */
	public static Player createPlayer2() {
		return new Player(new Game(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:05 PM
	 */
	public static Player createPlayer3() {
		return new Player(new Game(), new IIOMetadataNode(""));
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:05 PM
	 */
	public static Player createPlayer4() {
		return new Player(new Game(new Specification()), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Player}</code>.
	 *
	 * @generatedBy CodePro at 5/16/16 10:05 PM
	 */
	public static Player createPlayer5() {
		return new Player(new Game(new Specification()), new IIOMetadataNode());
	}
}