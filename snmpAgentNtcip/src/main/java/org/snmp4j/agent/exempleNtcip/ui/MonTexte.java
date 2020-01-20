package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.geom.Rectangle2D;

public class MonTexte {
	private Rectangle2D rect=null;
	private String chaine=null;
	public Rectangle2D getRect() {
		return rect;
	}
	public void setRect(Rectangle2D rect) {
		this.rect = rect;
	}
	public String getChaine() {
		return chaine;
	}
	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	public MonTexte(Rectangle2D rect,String chaine) {
		setRect(rect);
		setChaine(chaine);
	}

}
