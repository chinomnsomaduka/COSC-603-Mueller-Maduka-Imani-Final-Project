package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>LastSaleFactory</code> implements static methods that return instances of the class <code>{@link LastSale}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class LastSaleFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private LastSaleFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale() {
		return new LastSale("", TurnFactory.createTurn(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale2() {
		return new LastSale("0123456789", (Turn) null, 1);
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale3() {
		return new LastSale();
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale4() {
		return new LastSale(LocationFactory.createcreateHighSeas(), GoodsTypeFactory.createGoodsType(), TurnFactory.createTurn(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale5() {
		return new LastSale(LocationFactory.createcreateHighSeas2(), GoodsTypeFactory.createGoodsType2(), (Turn) null, 1);
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale6() {
		return new LastSale(LocationFactory.createcreateIndianSettlement(), GoodsTypeFactory.createGoodsType(), TurnFactory.createTurn(), 7);
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale7() {
		return new LastSale(LocationFactory.createcreateIndianSettlement2(), GoodsTypeFactory.createGoodsType2(), (Turn) null, -1);
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale8()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new LastSale(new FreeColXMLReader(File.createTempFile("", "")));
	}


	/**
	 * Create an instance of the class <code>{@link LastSale}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static LastSale createLastSale9() {
		return new LastSale((String) null, TurnFactory.createTurn(), 7);
	}
}