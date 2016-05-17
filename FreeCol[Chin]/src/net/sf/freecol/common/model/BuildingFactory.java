package net.sf.freecol.common.model;



/**
 * The class <code>BuildingFactory</code> implements static methods that return instances of the class <code>{@link Building}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class BuildingFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private BuildingFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Building createBuilding() {
		return new Building(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Building createBuilding2() {
		return new Building(GameFactory.createGame(), new Colony(GameFactory.createGame(), ""), BuildingTypeFactory.createBuildingType());
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Building createBuilding3() {
		return new Building(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Building createBuilding4() {
		return new Building(GameFactory.createGame2(), new Colony(GameFactory.createGame(), new Player(GameFactory.createGame()), "", new Tile(GameFactory.createGame(), "")), BuildingTypeFactory.createBuildingType2());
	}


	/**
	 * Create an instance of the class <code>{@link Building}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static Building createBuilding5() {
		return new Building((Game) null, new Colony(GameFactory.createGame(), new Player(GameFactory.createGame2(), "0123456789"), (String) null, new Tile(GameFactory.createGame2(), "0123456789")), (BuildingType) null);
	}
}