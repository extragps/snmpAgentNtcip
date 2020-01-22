package org.snmp4j.agent.exempleNtcip.ui;

import java.util.ArrayList;

/**
 * @author xgaillard
 *
 * Ajout d'un autre commentaire javadoc qui doit produire une erreur de commit.
 */
public class MaPage {
	private int dureeOn=500;
	/**
	 * Changement de la valeur par defaut de la duree a off. 
	 */
	private int dureeOff=0;
	private ArrayList<MonGraphique> listeGraphique=new ArrayList<MonGraphique>();
	private ArrayList<MonTexte> listeTexte=new ArrayList<MonTexte>();
	public MaPage(int on,int off) {
		setDureeOn(on);
		setDureeOff(off);
	}
	public int getDureeOn() {
		return dureeOn;
	}
	public void setDureeOn(int dureeOn) {
		this.dureeOn = dureeOn;
	}
	public int getDureeOff() {
		return dureeOff;
	}
	public void setDureeOff(int dureeOff) {
		this.dureeOff = dureeOff;
	}
	public void addGraphique(MonGraphique graphique) {
		listeGraphique.add(graphique);
	}
	public void addTexte(MonTexte texte) {
		listeTexte.add(texte);
	}
	public ArrayList<MonGraphique> getListeGraphique() {
		// TODO Auto-generated method stub
		return listeGraphique;
	}
	public ArrayList<MonTexte> getListeTexte() {
		// TODO Auto-generated method stub
		return listeTexte;
	}
}
