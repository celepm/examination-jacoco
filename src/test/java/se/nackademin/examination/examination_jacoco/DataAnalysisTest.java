package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	DataAnalysis dataAnalysis = new DataAnalysis();

	@Test
	public void testGetAgeFromInputValues() {
		ArrayList<String> firstValues = new ArrayList<String>();
		firstValues.addAll(Arrays.asList("Game", "Linda", "Bergström", "F", "27", "Göteborg"));
		String firstResult = dataAnalysis.buildFinalString(firstValues);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				firstResult.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		
		ArrayList<String> secondValues = new ArrayList<String>();
		secondValues.addAll(Arrays.asList("Game", "Johanna", "Lund", "F", "31", "Malmö"));
		String secondResult = dataAnalysis.buildFinalString(secondValues);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				secondResult.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
		
		ArrayList<String> thirdValues = new ArrayList<String>();
		thirdValues.addAll(Arrays.asList("Game", "Peter", "Lindström", "M", "25", "Oslo"));
		String thirdResult = dataAnalysis.buildFinalString(thirdValues);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
				thirdResult.contains("The name of the homecity is small and the participant is younger than 30"));
		
		ArrayList<String> fourthValues = new ArrayList<String>();
		fourthValues.addAll(Arrays.asList("Game", "Luis", "Figo", "M", "35", "Rome"));
		String fourthResult = dataAnalysis.buildFinalString(fourthValues);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older' ",
				fourthResult.contains("The name of the homecity is small and the participant is 30 or older"));
		
		ArrayList<String> fifthValues = new ArrayList<String>();
		fifthValues.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String fifthResult = dataAnalysis.buildFinalString(fifthValues);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				fifthResult.contains("The name of the homecity is big and the participant is 30 or older"));
		
		ArrayList<String> sixthValues = new ArrayList<String>();
		sixthValues.addAll(Arrays.asList("Game", "Almeida", "Johansson", "F", "25", "Stockholm"));
		String sixthResult = dataAnalysis.buildFinalString(sixthValues);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30' ",
				sixthResult.contains("The name of the homecity is big and the participant is younger than 30"));
	}

}