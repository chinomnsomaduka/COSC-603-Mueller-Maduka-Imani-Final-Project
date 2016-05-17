package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>SettlementTypeFactory</code> implements static methods that return instances of the class <code>{@link SettlementType}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class SettlementTypeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private SettlementTypeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link SettlementType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static SettlementType createSettlementType() {
		return new SettlementType("", SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link SettlementType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static SettlementType createSettlementType2() {
		return new SettlementType("0123456789", SpecificationFactory.createSpecification2());
	}


	/**
	 * Create an instance of the class <code>{@link SettlementType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static SettlementType createSettlementType3()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new SettlementType(new FreeColXMLReader(File.createTempFile("", "")), SpecificationFactory.createSpecification());
	}


	/**
	 * Create an instance of the class <code>{@link SettlementType}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static SettlementType createSettlementType4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new SettlementType(new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes()))), SpecificationFactory.createSpecification2());
	}
}