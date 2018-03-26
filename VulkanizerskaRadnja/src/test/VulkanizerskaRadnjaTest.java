package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja vulkanizerskaRadnja;
	AutoGuma autoGuma;

	@Before
	public void setUp() throws Exception {
		vulkanizerskaRadnja = new VulkanizerskaRadnja();
		autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(255);
		autoGuma.setVisina(50);
		vulkanizerskaRadnja.dodajGumu(autoGuma);
		autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Michelin Pilot Sport");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(255);
		autoGuma.setVisina(50);
		vulkanizerskaRadnja.dodajGumu(autoGuma);
		autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Michelin Pilot Super Sport");
		autoGuma.setPrecnik(17);
		autoGuma.setSirina(225);
		autoGuma.setVisina(40);
		vulkanizerskaRadnja.dodajGumu(autoGuma);
	}

	@After
	public void tearDown() throws Exception {
		vulkanizerskaRadnja = null;
	}

	@Test
	public void testDodajGumu() {
		AutoGuma autoGuma = new AutoGuma();
		autoGuma.setMarkaModel("Michelin Sport");
		autoGuma.setPrecnik(19);
		autoGuma.setSirina(275);
		autoGuma.setVisina(55);
		vulkanizerskaRadnja.dodajGumu(autoGuma);
		assertEquals(autoGuma, vulkanizerskaRadnja.pronadjiGumu("Michelin Sport").getFirst());
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vulkanizerskaRadnja.dodajGumu(null);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostojecu() {
		vulkanizerskaRadnja.dodajGumu(autoGuma);
	}

	@Test
	public void testPronadjiGumu() {
		assertEquals(1, vulkanizerskaRadnja.pronadjiGumu("Michelin Pilot Sport").size());
	}

	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, vulkanizerskaRadnja.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNema() {
		assertEquals(0, vulkanizerskaRadnja.pronadjiGumu("Michelin").size());
	}

	@Test
	public void testPronadjiGumuVise() {
		assertTrue(vulkanizerskaRadnja.pronadjiGumu("Michelin Pilot Super Sport").size() >= 2);
	}

}