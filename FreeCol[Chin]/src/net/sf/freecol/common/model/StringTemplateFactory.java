package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>StringTemplateFactory</code> implements static methods that return instances of the class <code>{@link StringTemplate}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:15 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class StringTemplateFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	private StringTemplateFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate() {
		return StringTemplate.copy("", (StringTemplate) null);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate2() {
		return StringTemplate.copy("0123456789", (StringTemplate) null);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate3() {
		return StringTemplate.key("");
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate4() {
		return StringTemplate.key(NamedFactory.createcreateAbstractGoods());
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate5() {
		return StringTemplate.label("");
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate6() {
		return StringTemplate.name("");
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate7() {
		return StringTemplate.template("");
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate8() {
		return StringTemplate.template(NamedFactory.createcreateAbstractGoods());
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate9() {
		return new StringTemplate("", "", StringTemplate.TemplateType.KEY);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate10() {
		return new StringTemplate("", (StringTemplate) null);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate11() {
		return new StringTemplate("0123456789", "0123456789", StringTemplate.TemplateType.LABEL);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate12() {
		return new StringTemplate("0123456789", (StringTemplate) null);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate13() {
		return new StringTemplate("An??t-1.0.txt", "An??t-1.0.txt", StringTemplate.TemplateType.NAME);
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate14() {
		return new StringTemplate();
	}


	/**
	 * Create an instance of the class <code>{@link StringTemplate}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:15 AM
	 */
	public static StringTemplate createStringTemplate15()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new StringTemplate(new FreeColXMLReader(File.createTempFile("", "")));
	}
}