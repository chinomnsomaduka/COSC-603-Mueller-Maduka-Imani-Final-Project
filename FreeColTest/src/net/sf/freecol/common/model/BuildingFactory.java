package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>BuildingFactory</code> implements static methods that return instances of the class <code>{@link Building}</code>.
 *
 * @generatedBy CodePro at 5/17/16 2:08 AM
 * @author NFJ6TVK
 * @version $Revision: 1.0 $
 */
public class BuildingFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	private BuildingFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Building createBuilding() {
		return new Building(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Building createBuilding2() {
		return new Building(GameFactory.createGame(), new Colony(GameFactory.createGame(), ""), new BuildingType("", new Specification()));
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Building createBuilding3() {
		return new Building(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Building createBuilding4() {
		return new Building(GameFactory.createGame2(), new Colony(GameFactory.createGame(), PlayerFactory.createPlayer(), "", new Tile(GameFactory.createGame(), "")), new BuildingType("0123456789", new Specification(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 2:08 AM
	 */
	public static Building createBuilding5() {
		return new Building((Game) null, new Colony(GameFactory.createGame(), PlayerFactory.createPlayer4(), (String) null, new Tile(GameFactory.createGame2(), "0123456789")), (BuildingType) null);
	}
}