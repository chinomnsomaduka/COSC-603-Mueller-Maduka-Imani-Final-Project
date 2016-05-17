package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>ExportDataFactory</code> implements static methods that return instances of the class <code>{@link ExportData}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ExportDataFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ExportDataFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ExportData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ExportData createExportData() {
		return new ExportData();
	}


	/**
	 * Create an instance of the class <code>{@link ExportData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ExportData createExportData2() {
		return new ExportData(GoodsTypeFactory.createGoodsType(), 0);
	}


	/**
	 * Create an instance of the class <code>{@link ExportData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ExportData createExportData3() {
		return new ExportData(GoodsTypeFactory.createGoodsType2(), 1);
	}


	/**
	 * Create an instance of the class <code>{@link ExportData}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ExportData createExportData4()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new ExportData(new FreeColXMLReader(File.createTempFile("", "")));
	}
}