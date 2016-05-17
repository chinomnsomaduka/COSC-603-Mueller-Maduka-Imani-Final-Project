package net.sf.freecol.common.model.mission;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import net.sf.freecol.common.model.Game;
import static org.junit.Assert.*;

/**
 * The class <code>CompoundMissionTest</code> contains tests for the class <code>{@link CompoundMission}</code>.
 *
 * @generatedBy CodePro at 5/17/16 5:20 AM
 * @author Chin
 * @version $Revision: 1.0 $
 */
public class CompoundMissionTest {
	/**
	 * Run the CompoundMission(Game) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testCompoundMission_1()
		throws Exception {
		Game game = new Game();

		CompoundMission result = new CompoundMission(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the CompoundMission(Game,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testCompoundMission_2()
		throws Exception {
		Game game = new Game();
		String id = "";

		CompoundMission result = new CompoundMission(game, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:347)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:95)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the CompoundMission(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testCompoundMission_3()
		throws Exception {
		Game game = new Game();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		CompoundMission result = new CompoundMission(game, xr);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getIndex());
		assertEquals(false, result.isValid());
		assertEquals("TODO!", result.getXMLTagName());
		assertEquals(null, result.getMissions());
		assertEquals(null, result.getUnit());
		assertEquals(1, result.getRepeatCount());
		assertEquals(0, result.getTurnCount());
		assertEquals(false, result.isDisposed());
		assertEquals(false, result.isInitialized());
		assertEquals(null, result.getSpecification());
		assertEquals(true, result.isInternable());
		assertEquals("net.sf.freecol.common.model.mission.CompoundMission:null", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the Mission.MissionState doMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testDoMission_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		Mission.MissionState result = fixture.doMission();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Mission.MissionState doMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testDoMission_2()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		Mission.MissionState result = fixture.doMission();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Mission.MissionState doMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testDoMission_3()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		Mission.MissionState result = fixture.doMission();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Mission.MissionState doMission() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testDoMission_4()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		Mission.MissionState result = fixture.doMission();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testGetIndex_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		int result = fixture.getIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertEquals(0, result);
	}

	/**
	 * Run the List<Mission> getMissions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testGetMissions_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		List<Mission> result = fixture.getMissions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testIsValid_4()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testSetIndex_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		int newIndex = 1;

		fixture.setIndex(newIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void setMissions(List<Mission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testSetMissions_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		List<Mission> newMissions = new ArrayList<Mission>();

		fixture.setMissions(newMissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		CompoundMission fixture = new CompoundMission(new Game());
		fixture.setIndex(1);
		fixture.setMissions(new ArrayList<Mission>());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:295)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.mission.AbstractMission.<init>(AbstractMission.java:73)
		//       at net.sf.freecol.common.model.mission.CompoundMission.<init>(CompoundMission.java:57)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/16 5:20 AM
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
	 * @generatedBy CodePro at 5/17/16 5:20 AM
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
	 * @generatedBy CodePro at 5/17/16 5:20 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CompoundMissionTest.class);
	}
}