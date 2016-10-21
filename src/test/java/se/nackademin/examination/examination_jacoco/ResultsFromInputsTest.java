package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {
	ResultFromInputs resultFromInputs = new ResultFromInputs();
	
	@Test
	public void testResultForNameLength() {
		resultFromInputs.setResultForNameLength(1);
		assertEquals("The result should be 1", resultFromInputs.getResultForNameLength(), 1);
	}
	
	@Test
	public void testResultForGender() {
		resultFromInputs.setResultForGender(0);
		assertEquals("The result should be 0", resultFromInputs.getResultForGender(), 0);
	}
	
	@Test
	public void testResultForHomeCity() {
		resultFromInputs.setResultForHomeCity(5);
		assertEquals("The result should be 5", resultFromInputs.getResultForHomeCity(), 5);
	}
	
	@Test
	public void testResultForAge() {
		resultFromInputs.setResultForAge(1);
		assertEquals("The result should be 1", resultFromInputs.getResultForAge(), 1);
	}
}
