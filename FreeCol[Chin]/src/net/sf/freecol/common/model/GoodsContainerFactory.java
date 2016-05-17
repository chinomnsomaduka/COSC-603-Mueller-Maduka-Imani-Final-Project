package net.sf.freecol.common.model;



/**
 * The class <code>GoodsContainerFactory</code> implements static methods that return instances of the class <code>{@link GoodsContainer}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GoodsContainerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private GoodsContainerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link GoodsContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoodsContainer createGoodsContainer() {
		return new GoodsContainer(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link GoodsContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoodsContainer createGoodsContainer2() {
		return new GoodsContainer(GameFactory.createGame(), LocationFactory.createcreateHighSeas());
	}


	/**
	 * Create an instance of the class <code>{@link GoodsContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoodsContainer createGoodsContainer3() {
		return new GoodsContainer(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link GoodsContainer}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoodsContainer createGoodsContainer4() {
		return new GoodsContainer(GameFactory.createGame2(), LocationFactory.createcreateHighSeas2());
	}
}