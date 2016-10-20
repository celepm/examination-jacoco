package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {
	Game game = new Game();

	@Test
	public void testRun() {
		ArrayList<String> values = new ArrayList<String>();
		String[] array = { "Game", "Cristiano", "Ronaldo", "M", "30", "Lissabon" };
		values.addAll(Arrays.asList(array));
		game.run(values);
	}
	
	@Test
	public void testGenderFromInputValues() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		assertEquals(game.getGenderFromInputValues(values), 'M');
	}
	
	@Test
	public void testAgeFromInputValues() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		assertEquals(game.getAgeFromInputValues(values), 30);
	}
	
	@Test
	public void testRunGame() {
		game.runGame("Game", "Lionel", "Messi", 'M', 30, "Buenos Aires");
	}
	
	@Test
	public void testCalculateOutputBasedOnNames() {
		int i = game.calculateOutPutBasedOnNames("Bill", "Gates");
		assertEquals("Firstname should be smaller than lastname = <0>. ", i, 0);
		int j = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("Firstname should be larger than lastname = <1>. ", j, 1);
		int k = game.calculateOutPutBasedOnNames("Abraham", "Lincoln");
		assertEquals("Firstname and lastname should have the same length = <2>. ", k, 2);
	}
	
	@Test
	public void testCalculateOutputBasedOnGender() {
		char a = (char) game.calculateOutPutBasedOnGender('M');
		assertEquals("Gender should be 'M' ", a, 0);
		char b = (char) game.calculateOutPutBasedOnGender('F');
		assertEquals("Gender should be 'F' ", b, 1);
		char c = (char) game.calculateOutPutBasedOnGender('C');
		assertEquals("Gender should be 'C' ", c, 2);
	}
	
	@Test
	public void testCalculateOutPutBasedOnAge() {
		int age = game.calculateOutPutBasedOnAge(20);
		assertEquals("Age should be 25 or younger", age, 0);
		age = game.calculateOutPutBasedOnAge(30);
		assertEquals("Age should be older than 25", age, 1);
	}
	
	@Test
	public void testCalculateOutPutBasedOnHomeCity() {
		int homeCity = game.calculateOutPutBasedOnHomeCity("Atlantic City");
		assertEquals("homeCity should begin with a!", homeCity, 0);
		homeCity = game.calculateOutPutBasedOnHomeCity("Brasilia");
		assertEquals("homeCity should begin with b!", homeCity, 1);
		homeCity = game.calculateOutPutBasedOnHomeCity("Cape Coral");
		assertEquals("homeCity should begin with c!", homeCity, 2);
		homeCity = game.calculateOutPutBasedOnHomeCity("Detroit");
		assertEquals("homeCity should begin with d!", homeCity, 3);
		homeCity = game.calculateOutPutBasedOnHomeCity("El Paso");
		assertEquals("homeCity should begin with e!", homeCity, 4);
		homeCity = game.calculateOutPutBasedOnHomeCity("Fort Lauderdale");
		assertEquals("homeCity should begin with f!", homeCity, 5);
		homeCity = game.calculateOutPutBasedOnHomeCity("Gaborone");
		assertEquals("homeCity should begin with g!", homeCity, 6);
		homeCity = game.calculateOutPutBasedOnHomeCity("Hong Kong");
		assertEquals("homeCity should begin with h!", homeCity, 7);
		homeCity = game.calculateOutPutBasedOnHomeCity("Ibiza");
		assertEquals("homeCity should begin with i!", homeCity, 8);
		homeCity = game.calculateOutPutBasedOnHomeCity("Jacksonville");
		assertEquals("homeCity should begin with j!", homeCity, 9);
		homeCity = game.calculateOutPutBasedOnHomeCity("Stockholm");
		assertEquals("homeCity should not begin with characters between a and j!", homeCity, 10);
	}
	
	@Test
	public void testBuildFinalString() {
		ResultFromInputs resultFromInputs = new ResultFromInputs();
		Conversor conversor = new Conversor(); 
		
		resultFromInputs.setResultForNameLength(0);
		assertEquals(resultFromInputs.getResultForNameLength(), 0);
		resultFromInputs.setResultForGender(0);
		assertEquals(resultFromInputs.getResultForGender(), 0);
		resultFromInputs.setResultForAge(1);
		assertEquals(resultFromInputs.getResultForAge(), 1);
		resultFromInputs.setResultForHomeCity(10);
		assertEquals(resultFromInputs.getResultForHomeCity(), 10);
		
		game.buildFinalString("Mark", "Zuckerberg", resultFromInputs, conversor);
	}
}
