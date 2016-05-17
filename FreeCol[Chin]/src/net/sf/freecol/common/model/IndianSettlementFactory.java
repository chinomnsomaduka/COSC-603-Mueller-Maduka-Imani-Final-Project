package net.sf.freecol.common.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.Element;


/**
 * The class <code>IndianSettlementFactory</code> implements static methods that return instances of the class <code>{@link IndianSettlement}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:13 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class IndianSettlementFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	private IndianSettlementFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link IndianSettlement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static IndianSettlement createIndianSettlement() {
		return new IndianSettlement(new Game(), "");
	}


	/**
	 * Create an instance of the class <code>{@link IndianSettlement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static IndianSettlement createIndianSettlement2() {
		return new IndianSettlement(new Game(), new Player(new Game()), "", new Tile(new Game(), ""));
	}


	/**
	 * Create an instance of the class <code>{@link IndianSettlement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static IndianSettlement createIndianSettlement3() {
		return new IndianSettlement(new Game(), new Player(new Game(new Specification()), "0123456789"), (String) null, new Tile(new Game(new Specification()), "0123456789"));
	}


	/**
	 * Create an instance of the class <code>{@link IndianSettlement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static IndianSettlement createIndianSettlement4() {
		return new IndianSettlement(new Game(new Specification()), "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link IndianSettlement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static IndianSettlement createIndianSettlement5() {
		return new IndianSettlement(new Game(new Specification()), new Player(new Game(), ""), "0123456789", new Tile(new Game(), TileType.LAND, 0, 0));
	}


	/**
	 * Create an instance of the class <code>{@link IndianSettlement}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:13 AM
	 */
	public static IndianSettlement createIndianSettlement6() {
		return new IndianSettlement((Game) null, new Player(new Game(), new IIOMetadataNode("")), "An??t-1.0.txt", new Tile(new Game(), new TileType("0123456789", new Specification(new ByteArrayInputStream("".getBytes()))), -1, -1));
	}
}