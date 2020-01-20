package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.Image;
import java.awt.geom.Point2D;

public class MonGraphique {
	private Point2D point=null;
	private int graphicNum=-1;
	private Image image=null;
	public MonGraphique(Point2D point,int num) {
		setPoint(point);
		setGraphicNum(num);
	}
	public Point2D getPoint() {
		return point;
	}
	public void setPoint(Point2D point) {
		this.point = point;
	}
	public int getGraphicNum() {
		return graphicNum;
	}
	public void setGraphicNum(int graphicNum) {
		this.graphicNum = graphicNum;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}

}
