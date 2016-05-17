package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>OperandFactory</code> implements static methods that return instances of the class <code>{@link Operand}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class OperandFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private OperandFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Operand createOperand() {
		return new Operand();
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Operand createOperand2() {
		return new Operand(0);
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Operand createOperand3() {
		return new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Operand createOperand4() {
		return new Operand(Operand.OperandType.FOUNDING_FATHERS, Operand.ScopeLevel.NONE);
	}


	/**
	 * Create an instance of the class <code>{@link Operand}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static Operand createOperand5()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new Operand(new FreeColXMLReader(File.createTempFile("", "")));
	}
}