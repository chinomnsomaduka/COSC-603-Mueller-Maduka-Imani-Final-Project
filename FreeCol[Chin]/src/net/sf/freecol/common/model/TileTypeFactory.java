package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>TileTypeFactory</code> implements static methods that return instances of the class <code>{@link TileType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TileTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TileTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TileType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileType createLAND() {
		return TileType.LAND;
	}


	/**
	 * Create an instance of the class <code>{@link TileType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileType createWATER() {
		return TileType.WATER;
	}


	/**
	 * Create an instance of the class <code>{@link TileType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileType createTileType() {
		return new TileType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link TileType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileType createTileType2() {
		return new TileType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}