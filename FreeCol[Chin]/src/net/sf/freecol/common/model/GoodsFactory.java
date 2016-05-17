package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>GoodsFactory</code> implements static methods that return instances of the class <code>{@link Goods}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GoodsFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private GoodsFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods() {
		return new Goods(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods2() {
		return new Goods(GameFactory.createGame(), LocationFactory.createcreateHighSeas(), GoodsTypeFactory.createGoodsType(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods3() {
		return new Goods(GameFactory.createGame(), LocationFactory.createcreateIndianSettlement2(), GoodsTypeFactory.createGoodsType(), -1);
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Goods(GameFactory.createGame(), new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods5() {
		return new Goods(GameFactory.createGame2(), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods6() {
		return new Goods(GameFactory.createGame2(), LocationFactory.createcreateHighSeas2(), GoodsTypeFactory.createGoodsType2(), 1);
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods7()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Goods(GameFactory.createGame2(), new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))));
	}


	/**
	 * Create an instance of the class <code>{@link Goods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Goods createGoods8() {
		return new Goods((Game) null, LocationFactory.createcreateHighSeas3(), (GoodsType) null, 7);
	}
}