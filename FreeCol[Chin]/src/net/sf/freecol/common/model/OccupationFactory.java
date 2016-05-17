package net.sf.freecol.common.model;

import java.util.ArrayList;
import java.util.List;


/**
 * The class <code>OccupationFactory</code> implements static methods that return instances of the class <code>{@link Occupation}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class OccupationFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private OccupationFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Occupation}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Occupation createOccupation() {
		ArrayList<AbstractGoods> list = new ArrayList<AbstractGoods>();
		list.add(AbstractGoodsFactory.createAbstractGoods());
		ArrayList<AbstractGoods> list1 = new ArrayList<AbstractGoods>();
		list1.add(AbstractGoodsFactory.createAbstractGoods());
		ProductionType productionType = new ProductionType(list, list1);
		return new Occupation(WorkLocationFactory.createcreateBuilding(), productionType, GoodsTypeFactory.createGoodsType());
	}


	/**
	 * Create an instance of the class <code>{@link Occupation}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Occupation createOccupation2() {
		ArrayList<AbstractGoods> list = new ArrayList<AbstractGoods>();
		list.add(AbstractGoodsFactory.createAbstractGoods());
		list.add(AbstractGoodsFactory.createAbstractGoods2());
		list.add(AbstractGoodsFactory.createAbstractGoods3());
		list.add(AbstractGoodsFactory.createAbstractGoods4());
		list.add(AbstractGoodsFactory.createAbstractGoods5());
		list.add(AbstractGoodsFactory.createAbstractGoods6());
		ArrayList<AbstractGoods> list1 = new ArrayList<AbstractGoods>();
		list1.add(AbstractGoodsFactory.createAbstractGoods());
		list1.add(AbstractGoodsFactory.createAbstractGoods2());
		list1.add(AbstractGoodsFactory.createAbstractGoods3());
		list1.add(AbstractGoodsFactory.createAbstractGoods4());
		list1.add(AbstractGoodsFactory.createAbstractGoods5());
		list1.add(AbstractGoodsFactory.createAbstractGoods6());
		ProductionType productionType = new ProductionType(list, list1);
		return new Occupation(WorkLocationFactory.createcreateBuilding2(), productionType, GoodsTypeFactory.createGoodsType2());
	}


	/**
	 * Create an instance of the class <code>{@link Occupation}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Occupation createOccupation3() {
		ArrayList<AbstractGoods> list = new ArrayList<AbstractGoods>();
		list.add(AbstractGoodsFactory.createAbstractGoods());
		ProductionType productionType = new ProductionType(list);
		return new Occupation(WorkLocationFactory.createcreateBuilding3(), productionType, (GoodsType) null);
	}
}