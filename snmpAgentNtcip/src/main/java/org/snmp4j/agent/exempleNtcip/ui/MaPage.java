package org.snmp4j.agent.exempleNtcip.ui;

import java.util.ArrayList;

/**
 * @author xgaillard
 * 
 * La classe contient les informations necessaires a l'affichage d'une page dans le simulateur
 * ntcip.
 * 
 */
public class MaPage {
	private int dureeOn=500;
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
