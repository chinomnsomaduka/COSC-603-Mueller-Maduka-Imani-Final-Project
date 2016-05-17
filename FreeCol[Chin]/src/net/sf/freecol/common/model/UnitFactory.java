package net.sf.freecol.common.model;

import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>UnitFactory</code> implements static methods that return instances of the class <code>{@link Unit}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class UnitFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private UnitFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Unit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Unit createUnit() {
		return new Unit(GameFactory.createGame());
	}


	/**
	 * Create an instance of the class <code>{@link Unit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Unit createUnit2() {
		return new Unit(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Unit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Unit createUnit3() {
		return new Unit(GameFactory.createGame(), new IIOMetadataNode(""));
	}


	/**
	 * Create an instance of the class <code>{@link Unit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Unit createUnit4() {
		return new Unit(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Unit}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Unit createUnit5() {
		return new Unit(GameFactory.createGame2(), new IIOMetadataNode());
	}
}