package net.sf.freecol.common.model;



/**
 * The class <code>TileItemFactory</code> implements static methods that return instances of the class <code>{@link TileItem}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class TileItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private TileItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem() {
		return new LostCityRumour(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem2() {
		return new LostCityRumour(GameFactory.createGame(), TileFactory.createTile());
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem3() {
		return new LostCityRumour(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem4() {
		return new LostCityRumour(GameFactory.createGame2(), TileFactory.createTile2());
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem5() {
		return new Resource(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem6() {
		return new Resource(GameFactory.createGame(), TileFactory.createTile(), new ResourceType("", SpecificationFactory.createSpecification()));
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem7() {
		return new Resource(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem8() {
		return new Resource(GameFactory.createGame2(), TileFactory.createTile2(), new ResourceType("0123456789", SpecificationFactory.createSpecification2()));
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem9() {
		return new Resource((Game) null, TileFactory.createTile3(), (ResourceType) null);
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem10() {
		return new TileImprovement(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem11() {
		return new TileImprovement(GameFactory.createGame(), TileFactory.createTile(), new TileImprovementType("", SpecificationFactory.createSpecification()));
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem12() {
		return new TileImprovement(GameFactory.createGame(), TileFactory.createTile(), (TileImprovement) null);
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem13() {
		return new TileImprovement(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem14() {
		return new TileImprovement(GameFactory.createGame2(), TileFactory.createTile2(), new TileImprovementType("0123456789", SpecificationFactory.createSpecification2()));
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem15() {
		return new TileImprovement(GameFactory.createGame2(), TileFactory.createTile2(), (TileImprovement) null);
	}


	/**
	 * Create an instance of the class <code>{@link TileItem}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static TileItem createTileItem16() {
		return new TileImprovement((Game) null, TileFactory.createTile3(), (TileImprovementType) null);
	}
}