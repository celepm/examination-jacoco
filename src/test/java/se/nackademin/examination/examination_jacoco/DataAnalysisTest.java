package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	DataAnalysis dataAnalysis = new DataAnalysis();
	
	@Test
	public void testResultStringNamesAndAgeUnder30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Linda", "Bergstr�m", "F", "27", "G�teborg"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}
	
	@Test
	public void testResultStringNamesAndAgeOver30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Johanna", "Lund", "F", "31", "Malm�"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}
	
	@Test
	public void testResultStringSmallHomeCityAndAgeOver30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Luis", "Figo", "M", "35", "Rome"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older' ",
				result.contains("The name of the homecity is small and the participant is 30 or older"));
	}
	
	@Test
	public void testResultStringSmallHomeCityAndAgeUnder30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Peter", "Lindstr�m", "M", "25", "Oslo"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
				result.contains("The name of the homecity is small and the participant is younger than 30"));
	}
	
	@Test
	public void testResultStringBigHomeCityAndAgeOver30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	
	@Test
	public void testResultStringBigHomeCityAndAgeUnder30() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Almeida", "Johansson", "F", "25", "Stockholm"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30' ",
				result.contains("The name of the homecity is big and the participant is younger than 30"));
	}
}