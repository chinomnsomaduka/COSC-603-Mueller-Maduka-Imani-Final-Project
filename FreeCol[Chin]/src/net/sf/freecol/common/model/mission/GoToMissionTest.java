package net.sf.freecol.common.model.mission;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.model.HighSeas;
import net.sf.freecol.common.model.Location;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.model.Unit;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>GoToMissionTest</code> contains tests for the class <code>{@link GoToMission}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:23 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class GoToMissionTest {
	/**
	 * Run the GoToMission(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGoToMission_1()
		throws Exception {
		Game game = new Game();

		GoToMission result = new GoToMission(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the GoToMission(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGoToMission_2()
		throws Exception {
		Game game = new Game();
		String id = "";

		GoToMission result = new GoToMission(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:347)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:95)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the GoToMission(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGoToMission_3()
		throws Exception {
		Game game = new Game();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		GoToMission result = new GoToMission(game, xr);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isValid());
		assertEquals(null, result.getDestination());
		assertEquals("goToMission", result.getXMLTagName());
		assertEquals(0, result.getBlockedCount());
		assertEquals(null, result.getUnit());
		assertEquals(1, result.getRepeatCount());
		assertEquals(0, result.getTurnCount());
		assertEquals(false, result.isDisposed());
		assertEquals(false, result.isInitialized());
		assertEquals(null, result.getSpecification());
		assertEquals(true, result.isInternable());
		assertEquals("net.sf.freecol.common.model.mission.GoToMission:null", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<goToMission turnCount=\"0\" repeatCount=\"1\" destination=\"null\" blockedCount=\"0\"></goToMission>", result.serialize());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Mission.MissionState doMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testDoMission_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		Mission.MissionState result = fixture.doMission();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the int getBlockedCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGetBlockedCount_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		int result = fixture.getBlockedCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertEquals(0, result);
	}

	/**
	 * Run the Location getDestination() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGetDestination_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		Location result = fixture.getDestination();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = GoToMission.getTagName();

		// add additional test code here
		assertEquals("goToMission", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination((Location) null);
		fixture.setBlockedCount(1);

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testIsValid_4()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testIsValidFor_1()
		throws Exception {
		Unit unit = new Unit(new Game(), new IIOMetadataNode());

		boolean result = GoToMission.isValidFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Unit.<init>(Unit.java:219)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidFor(Unit) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testIsValidFor_2()
		throws Exception {
		Unit unit = new Unit(new Game(), new IIOMetadataNode());

		boolean result = GoToMission.isValidFor(unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Unit.<init>(Unit.java:219)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void setBlockedCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testSetBlockedCount_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		int newBlockedCount = 1;

		fixture.setBlockedCount(newBlockedCount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void setDestination(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testSetDestination_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		Location newDestination = new HighSeas(new Game());

		fixture.setDestination(newDestination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		GoToMission fixture = new GoToMission(new Game());
		fixture.setDestination(new HighSeas(new Game()));
		fixture.setBlockedCount(1);
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.GoToMission.<init>(GoToMission.java:54)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/16 5:23 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GoToMissionTest.class);
	}
}