package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


/**
 * The class <code>AbstractGoodsFactory</code> implements static methods that return instances of the class <code>{@link AbstractGoods}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class AbstractGoodsFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private AbstractGoodsFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link AbstractGoods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractGoods createAbstractGoods() {
		ArrayList<AbstractGoods> list = new ArrayList<AbstractGoods>();
		list.add((AbstractGoods) null);
		return AbstractGoods.findByType(GoodsTypeFactory.createGoodsType(), list);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractGoods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractGoods createAbstractGoods2() {
		HashSet<AbstractGoods> set = new HashSet<AbstractGoods>();
		set.add((AbstractGoods) null);
		return AbstractGoods.findByType(GoodsTypeFactory.createGoodsType2(), set);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractGoods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractGoods createAbstractGoods3() {
		return new AbstractGoods();
	}


	/**
	 * Create an instance of the class <code>{@link AbstractGoods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractGoods createAbstractGoods4() {
		return new AbstractGoods(GoodsTypeFactory.createGoodsType(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractGoods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractGoods createAbstractGoods5() {
		return new AbstractGoods(GoodsTypeFactory.createGoodsType2(), 1);
	}


	/**
	 * Create an instance of the class <code>{@link AbstractGoods}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static AbstractGoods createAbstractGoods6() {
		return new AbstractGoods((AbstractGoods) null);
	}
}