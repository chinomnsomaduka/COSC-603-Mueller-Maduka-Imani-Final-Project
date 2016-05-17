package net.sf.freecol.common.model;

import java.io.File;
import net.sf.freecol.common.io.FreeColXMLReader;


/**
 * The class <code>ModelMessageFactory</code> implements static methods that return instances of the class <code>{@link ModelMessage}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:14 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class ModelMessageFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	private ModelMessageFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage() {
		return new ModelMessage();
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage2()
		throws ClassNotFoundException {
		return new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", "", BuildingFactory.createBuilding(), FreeColObject.newInstance(Class.forName("")));
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage3() {
		return new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", BuildingFactory.createBuilding());
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage4()
		throws ClassNotFoundException {
		return new ModelMessage(ModelMessage.MessageType.BUILDING_COMPLETED, "", BuildingFactory.createBuilding(), FreeColObject.newInstance(Class.forName("")));
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage5() {
		return new ModelMessage(ModelMessage.MessageType.COMBAT_RESULT, "0123456789", "0123456789", BuildingFactory.createBuilding2(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage6() {
		return new ModelMessage(ModelMessage.MessageType.COMBAT_RESULT, "0123456789", BuildingFactory.createBuilding2());
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage7() {
		return new ModelMessage(ModelMessage.MessageType.COMBAT_RESULT, "0123456789", BuildingFactory.createBuilding2(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage8() {
		return new ModelMessage(ModelMessage.MessageType.DEFAULT, "An??t-1.0.txt", "An??t-1.0.txt", BuildingFactory.createBuilding3(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage9() {
		return new ModelMessage(ModelMessage.MessageType.DEFAULT, "An??t-1.0.txt", BuildingFactory.createBuilding3());
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage10() {
		return new ModelMessage(ModelMessage.MessageType.DEFAULT, "An??t-1.0.txt", BuildingFactory.createBuilding3(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage11() {
		return new ModelMessage(ModelMessage.MessageType.DEMANDS, (String) null, BuildingFactory.createBuilding4(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage12() {
		return new ModelMessage(ModelMessage.MessageType.DEMANDS, (String) null, (String) null, BuildingFactory.createBuilding4(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage13() {
		return new ModelMessage(ModelMessage.MessageType.GIFT_GOODS, "0123456789", "", BuildingFactory.createBuilding5(), (FreeColObject) null);
	}


	/**
	 * Create an instance of the class <code>{@link ModelMessage}</code>.
	 *
	 * @generatedBy CodePro at 5/17/16 5:14 AM
	 */
	public static ModelMessage createModelMessage14()
		throws javax.xml.stream.XMLStreamException, java.io.IOException {
		return new ModelMessage(new FreeColXMLReader(File.createTempFile("", "")));
	}
}