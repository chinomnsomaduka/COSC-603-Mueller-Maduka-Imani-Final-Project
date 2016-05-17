package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


/**
 * The class <code>GoodsTypeFactory</code> implements static methods that return instances of the class <code>{@link GoodsType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GoodsTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private GoodsTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link GoodsType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoodsType createGoodsType() {
		return new GoodsType("", new Specification());
	}


	/**
	 * Create an instance of the class <code>{@link GoodsType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static GoodsType createGoodsType2() {
		return new GoodsType("0123456789", new Specification(new ByteArrayInputStream("".getBytes())));
	}
}