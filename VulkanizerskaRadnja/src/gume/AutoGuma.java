package gume;

/**
 * Klasa predstavlja automobilsku gumu
 * @author Nikola
 * @version 1.0.0
 */
public class AutoGuma {
	/**
	 * Pretsdavlja informacije o marci i modelu gume
	 */
	private String markaModel = null;
	/**
	 * Predstavlja precnik gume
	 */
	private int precnik = 0;
	/**
	 * Predstavlja sirinu gume
	 */
	private int sirina = 0;
	/**
	 * Predstavlja visinu gume
	 */
	private int visina = 0;
	
	/**
	 * Sluzi za citanje enkapsulirane vrednosti marke i modela gume
	 * @return vraca informacije o marci i modelu gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Sluzi za unos modela i marke gume
	 * @param markaModel prihvata informacije o marci i modelu gume
	 * @throws java.lang.RuntimeException unet string sa manje od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * Sluzi za citanje enkapsulirane vrednosti precnika gume
	 * @return vraca informaciju o precniku gume
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Sluzi za unos precnika gume
	 * @param precnik prihvata informaciju o precniku gume
	 * @throws java.lang.RuntimeException ukoliko je precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Sluzi za citanje enkapsulirane vrednosti sirine gume
	 * @return vraca informaciju o sirini gume
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Sluzi za unos sirine gume
	 * @param sirina prihvata informaciju o sirini gume
	 * @throws java.lang.RuntimeException ukoliko je sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Sluzi za citanje enkapsulirane vrednosti visine gume
	 * @return vraca informaciju o visini gume
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Sluzi za unos visine gume
	 * @param visina prihvata informaciju o visini gume
	 * @throws java.lang.RuntimeException ukoliko je visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	
	/**
	 * Pruza informacije o gumi
	 * @return uredno formatiran string	sa svim vrednostima vezanim za gumu
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava identicnost dva objekta klase AutoGuma, odnosno da li su marka i model, precnik, sirina i visina identicni u oba objekta
	 * @param obj Prihvata informacije o gumi u formi klase Object
	 * @return true ako je unet objekat identican objektu kojim pozivamo metodu za poredjenje ili false ukoliko nisu identicni ili false ukoliko ulazni objekat nije instanca klase AutoGuma
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}