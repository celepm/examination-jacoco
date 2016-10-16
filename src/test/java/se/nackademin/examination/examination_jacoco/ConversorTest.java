package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {
	Conversor conversor = new Conversor();
	
	@Test
	public void testGenderConverterArrayValues() {
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
		assertEquals(conversor.getGenderConverterArray().get(2), "person!");
	}
	
	@Test
	public void testAgeConverterArrayValues() {
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
		assertEquals(conversor.getAgeConverterArray().get(1), "You are experienced and talented! Things will come your way soon enough!");
	}

	@Test
	public void testNameConverterArrayValues() {
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		assertEquals(conversor.getNameConverterArray().get(1), "Your last name is smaller than your first name");
		assertEquals(conversor.getNameConverterArray().get(2), "The lengths of your first name is your last name are the same");
	}
	
	@Test
	public void testCityConverterArrayValues() {
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");
		assertEquals(conversor.getCityConverterArray().get(1), " B, ");
		assertEquals(conversor.getCityConverterArray().get(2), " C, ");
		assertEquals(conversor.getCityConverterArray().get(3), " D, ");
		assertEquals(conversor.getCityConverterArray().get(4), " E, ");
		assertEquals(conversor.getCityConverterArray().get(5), " F, ");
		assertEquals(conversor.getCityConverterArray().get(6), " G, ");
		assertEquals(conversor.getCityConverterArray().get(7), " H, ");
		assertEquals(conversor.getCityConverterArray().get(8), " I, ");
		assertEquals(conversor.getCityConverterArray().get(9), " J,");
		assertEquals(conversor.getCityConverterArray().get(10), " a letter that comes after J, ");
	}
}