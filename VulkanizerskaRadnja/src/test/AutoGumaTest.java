package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {

	AutoGuma autoGuma;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		autoGuma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		autoGuma = null;
	}

	@Test
	public void testSetMarkaModel() {
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		assertEquals("Michelin Pilot Super Sport", autoGuma.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		autoGuma.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		autoGuma.setMarkaModel("Mi");
	}

	@Test
	public void testSetPrecnik() {
		autoGuma.setPrecnik(19);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		autoGuma.setPrecnik(25);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		autoGuma.setPrecnik(10);
	}

	@Test
	public void testSetSirina() {
		autoGuma.setSirina(255);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeci() {
		autoGuma.setSirina(400);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManji() {
		autoGuma.setSirina(100);
	}

	@Test
	public void testSetVisina() {
		autoGuma.setVisina(50);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeci() {
		autoGuma.setVisina(100);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManji() {
		autoGuma.setVisina(20);
	}

	@Test
	public void testToString() {
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(255);
		autoGuma.setVisina(50);
		assertEquals("AutoGuma [markaModel=Michelin Pilot Super Sport, precnik=19, sirina=255, visina=50]",
				autoGuma.toString());
	}

	@Test
	public void testEqualsObject() {
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(255);
		autoGuma.setVisina(50);

		AutoGuma autoGuma2 = new AutoGuma();
		autoGuma2.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma2.setPrecnik(19);
		autoGuma2.setSirina(255);
		autoGuma2.setVisina(50);
		assertTrue(autoGuma.equals(autoGuma2));
	}

	@Test
	public void testEqualsObjectFalse() {
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(255);
		autoGuma.setVisina(50);

		AutoGuma autoGuma2 = new AutoGuma();
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma.setPrecnik(20);
		autoGuma.setSirina(255);
		autoGuma.setVisina(50);
		assertFalse(autoGuma.equals(autoGuma2));
	}
}