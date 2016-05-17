package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HighScoreTest</code> contains tests for the class <code>{@link HighScore}</code>.
 *
 * @generatedBy CodePro at 5/16/16 11:13 PM
 * @author jeek
 * @version $Revision: 1.0 $
 */
public class HighScoreTest {
	/**
	 * Run the HighScore() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testHighScore_1()
		throws Exception {

		HighScore result = new HighScore();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDate());
		assertEquals(null, result.getLevel());
		assertEquals(0, result.getUnits());
		assertEquals(null, result.getDifficulty());
		assertEquals(null, result.getNewLandName());
		assertEquals(null, result.getNationName());
		assertEquals(0, result.getColonies());
		assertEquals(null, result.getNationId());
		assertEquals(null, result.getPlayerName());
		assertEquals(null, result.getNationTypeId());
		assertEquals("highScore", result.getXMLTagName());
		assertEquals("null.name", result.getOldNationNameKey());
		assertEquals(0, result.getRetirementTurn());
		assertEquals(-1, result.getIndependenceTurn());
		assertEquals(0, result.getScore());
		assertEquals("net.sf.freecol.common.model.HighScore:null", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getIdType());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the HighScore(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testHighScore_2()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		HighScore result = new HighScore(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testHighScore_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		HighScore result = new HighScore(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testHighScore_4()
		throws Exception {
		Player player = PlayerFactory.createPlayer();
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the HighScore(Player,Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testHighScore_5()
		throws Exception {
		Player player = PlayerFactory.createPlayer2();
		Date theDate = new Date();

		HighScore result = new HighScore(player, theDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testCheckHighScore_1()
		throws Exception {
		int score = 1;
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testCheckHighScore_2()
		throws Exception {
		int score = 1;
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testCheckHighScore_3()
		throws Exception {
		int score = -1;
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean checkHighScore(int,List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testCheckHighScore_4()
		throws Exception {
		int score = 1;
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.checkHighScore(score, scores);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColObject other = new AbstractGoods();

		int result = fixture.compareTo(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(FreeColObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColObject other = HighScoreFactory.createHighScore();

		int result = fixture.compareTo(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
		assertEquals(0, result);
	}

	/**
	 * Run the int getColonies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetColonies_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();

		int result = fixture.getColonies();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Date getDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();

		Date result = fixture.getDate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the String getDifficulty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetDifficulty_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();

		String result = fixture.getDifficulty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the int getIndependenceTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetIndependenceTurn_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();

		int result = fixture.getIndependenceTurn();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the HighScore.ScoreLevel getLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetLevel_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();

		HighScore.ScoreLevel result = fixture.getLevel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the String getNationId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetNationId_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();

		String result = fixture.getNationId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the String getNationName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetNationName_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();

		String result = fixture.getNationName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNationTypeId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetNationTypeId_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();

		String result = fixture.getNationTypeId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNewLandName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetNewLandName_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();

		String result = fixture.getNewLandName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the String getOldNationNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetOldNationNameKey_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();

		String result = fixture.getOldNationNameKey();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the String getPlayerName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetPlayerName_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();

		String result = fixture.getPlayerName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the int getRetirementTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetRetirementTurn_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();

		int result = fixture.getRetirementTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
		assertEquals(0, result);
	}

	/**
	 * Run the int getScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetScore_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();

		int result = fixture.getScore();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
		assertEquals(0, result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = HighScore.getTagName();

		// add additional test code here
		assertEquals("highScore", result);
	}

	/**
	 * Run the int getUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetUnits_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();

		int result = fixture.getUnits();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_1()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_2()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_3()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_4()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_5()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_6()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the List<HighScore> loadHighScores() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testLoadHighScores_7()
		throws Exception {

		List<HighScore> result = HighScore.loadHighScores();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		assertNotNull(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testNewHighScore_1()
		throws Exception {
		Player player = PlayerFactory.createPlayer3();

		boolean result = HighScore.newHighScore(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: XML failure
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:824)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer3(PlayerFactory.java:51)
		assertTrue(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testNewHighScore_2()
		throws Exception {
		Player player = PlayerFactory.createPlayer4();

		boolean result = HighScore.newHighScore(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.createNewFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.loadHighScores(HighScore.java:369)
		//       at net.sf.freecol.common.model.HighScore.newHighScore(HighScore.java:351)
		assertTrue(result);
	}

	/**
	 * Run the boolean newHighScore(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testNewHighScore_3()
		throws Exception {
		Player player = PlayerFactory.createPlayer5();

		boolean result = HighScore.newHighScore(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer5(PlayerFactory.java:71)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_10()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_11()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_12()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_13()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_14()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_15()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testReadAttributes_16()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new PipedInputStream()));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: javax.xml.stream.XMLStreamException: java.io.IOException: Pipe not connected
		//       at net.sf.freecol.common.io.FreeColXMLReader.<init>(FreeColXMLReader.java:98)
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_1()
		throws Exception {
		List<HighScore> scores = null;

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_2()
		throws Exception {
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:412)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_3()
		throws Exception {
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:412)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_4()
		throws Exception {
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:412)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_5()
		throws Exception {
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:412)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_6()
		throws Exception {
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:412)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveHighScores(List<HighScore>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testSaveHighScores_7()
		throws Exception {
		List<HighScore> scores = new LinkedList();

		boolean result = HighScore.saveHighScores(scores);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at net.sf.freecol.common.model.HighScore.saveHighScores(HighScore.java:412)
		assertTrue(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_4()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.HighScore.writeAttributes(HighScore.java:485)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_5()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_6()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_7()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_8()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.HighScore.writeAttributes(HighScore.java:485)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_9()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_10()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_11()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_12()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.HighScore.writeAttributes(HighScore.java:485)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_13()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore2();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: game.getNextId not implemented
		//       at net.sf.freecol.common.model.Game.getNextId(Game.java:298)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:72)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:437)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore2(HighScoreFactory.java:42)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_14()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore3();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:462)
		//       at net.sf.freecol.common.model.PlayerFactory.createPlayer2(PlayerFactory.java:41)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore3(HighScoreFactory.java:52)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_15()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore4();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(Unknown Source)
		//       at java.io.File.createTempFile(Unknown Source)
		//       at net.sf.freecol.common.model.HighScoreFactory.createHighScore4(HighScoreFactory.java:63)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	@Test
	public void testWriteAttributes_16()
		throws Exception {
		HighScore fixture = HighScoreFactory.createHighScore();
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.HighScore.writeAttributes(HighScore.java:485)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/16/16 11:13 PM
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
	 * @generatedBy CodePro at 5/16/16 11:13 PM
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
	 * @generatedBy CodePro at 5/16/16 11:13 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HighScoreTest.class);
	}
}