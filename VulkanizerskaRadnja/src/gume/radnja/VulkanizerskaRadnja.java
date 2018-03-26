package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * Klasa predstavlja vulkanizersku radnju
 * @author Nikola
 * @version 1.0.0
 */
public class VulkanizerskaRadnja {
	/**
	 * Pretsdavlja listu guma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novu gumu u listu guma
	 * @throws java.lang.NullPointerException ukoliko je ulazni parametar null
	 * @throws java.lang.RuntimeException ukoliko uneta guma vec postoji u listi
	 * @param a predstavlja gumu koja se dodaje
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi gumu u listi guma
	 * @param markaModel predstavlja informacije o gumi koju trazimo
	 * @return null ako nije uneta marka i model
	 * @return {@link LinkedList} novaLista sa elementima {@link AutoGuma} koji imaju istu marku i model
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
