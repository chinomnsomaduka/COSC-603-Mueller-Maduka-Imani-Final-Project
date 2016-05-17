package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>ProductionTypeFactory</code> implements static methods that return instances of the class <code>{@link ProductionType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ProductionTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private ProductionTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType() {
		ArrayList<AbstractGoods> list = new ArrayList<AbstractGoods>();
		list.add(AbstractGoodsFactory.createAbstractGoods());
		ArrayList<AbstractGoods> list1 = new ArrayList<AbstractGoods>();
		list1.add(AbstractGoodsFactory.createAbstractGoods());
		return new ProductionType(list, list1);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType2() {
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
		return new ProductionType(list, list1);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType3() {
		ArrayList<AbstractGoods> list = new ArrayList<AbstractGoods>();
		list.add(AbstractGoodsFactory.createAbstractGoods());
		return new ProductionType(list);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType4() {
		ArrayList<ProductionType> list = new ArrayList<ProductionType>();
		list.add((ProductionType) null);
		return ProductionType.getBestProductionType(GoodsTypeFactory.createGoodsType(), list);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType5() {
		HashSet<ProductionType> set = new HashSet<ProductionType>();
		set.add((ProductionType) null);
		return ProductionType.getBestProductionType(GoodsTypeFactory.createGoodsType2(), set);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType6() {
		return new ProductionType(AbstractGoodsFactory.createAbstractGoods(), false, "");
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType7() {
		return new ProductionType(AbstractGoodsFactory.createAbstractGoods2(), true, "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType8() {
		return new ProductionType(AbstractGoodsFactory.createAbstractGoods4(), false, "An??t-1.0.txt");
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType9() {
		return new ProductionType(GoodsTypeFactory.createGoodsType(), GoodsTypeFactory.createGoodsType(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType10() {
		return new ProductionType(GoodsTypeFactory.createGoodsType2(), GoodsTypeFactory.createGoodsType2(), 1);
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType11() {
		return new ProductionType(SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType12()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new ProductionType(new FreeColXMLReader(File.createTempFile("", "")), SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType13()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new ProductionType(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), SpecificationFactory.createSpecification2());
	}


	/**
	 * Create an instance of the class <code>{@link ProductionType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static ProductionType createProductionType14() {
		return new ProductionType((GoodsType) null, (GoodsType) null, 7);
	}
}