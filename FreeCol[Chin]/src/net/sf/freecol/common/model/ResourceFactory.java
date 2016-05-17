package net.sf.freecol.common.model;



/**
 * The class <code>ResourceFactory</code> implements static methods that return instances of the class <code>{@link Resource}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ResourceFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ResourceFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource() {
		return new Resource(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource2() {
		return new Resource(GameFactory.createGame(), TileFactory.createTile(), new ResourceType("", SpecificationFactory.createSpecification()));
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource3() {
		return new Resource(GameFactory.createGame(), TileFactory.createTile(), new ResourceType("", SpecificationFactory.createSpecification()), 0);
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource4() {
		return new Resource(GameFactory.createGame(), TileFactory.createTile5(), new ResourceType("", SpecificationFactory.createSpecification()), -1);
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource5() {
		return new Resource(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource6() {
		return new Resource(GameFactory.createGame2(), TileFactory.createTile2(), new ResourceType("0123456789", SpecificationFactory.createSpecification2()));
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource7() {
		return new Resource(GameFactory.createGame2(), TileFactory.createTile2(), new ResourceType("0123456789", SpecificationFactory.createSpecification2()), 1);
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource8() {
		return new Resource((Game) null, TileFactory.createTile3(), (ResourceType) null);
	}


	/**
	 * Create an instance of the class <code>{@link Resource}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Resource createResource9() {
		return new Resource((Game) null, TileFactory.createTile3(), (ResourceType) null, 7);
	}
}