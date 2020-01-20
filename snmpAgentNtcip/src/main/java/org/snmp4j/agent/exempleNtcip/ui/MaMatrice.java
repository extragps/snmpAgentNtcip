package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsGraphicEntryRow;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.PixelFailureEntryRow;
import org.snmp4j.agent.exempleNtcip.ntcip.DmsMessageEntryRow;
import org.snmp4j.agent.mo.MOChangeEvent;
import org.snmp4j.agent.mo.MOChangeListener;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class MaMatrice extends JPanel implements MouseListener, MOChangeListener,Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbPixelX=48;
	private int nbPixelY=32;
	private int nbPixelCarteX=16;
	private int nbPixelCarteY=8;
	private int nbPixPoint=6;
	private Map<Point2D,Integer> listeDefauts=new HashMap<Point2D,Integer>();
	private Ntcip12032005 ntcip=null;
	boolean pageOff=true;
	private int pageCour=-1;
	private ArrayList<MaPage> pages=new ArrayList<MaPage>();
	private Thread monThread=null;
	private boolean notFin=true;

	public MaMatrice(Ntcip12032005 ntcip) {
		if (null != ntcip) {
			nbPixelX = ntcip.getVmsSignWidthPixels().getValue().toInt();
			nbPixelY = ntcip.getVmsSignHeightPixels().getValue().toInt();
			if (nbPixelX > 200) {
				nbPixPoint = 4;
			}
		} else {
			nbPixelX=384;
			nbPixelY=72;
			nbPixPoint=4;
			
		}
		setSize(new Dimension(nbPixPoint*nbPixelX+1,nbPixPoint*nbPixelY+1));
		setPreferredSize(new Dimension(nbPixPoint*nbPixelX+1,nbPixPoint*nbPixelY+1));
		setBorder(new LineBorder(Color.green));
		if(null!=ntcip) {
		this.ntcip=ntcip;
		if(0!=ntcip.getPixelFailureTableNumRows().getValue().toInt()) {
			int nbRows=ntcip.getPixelFailureTableNumRows().getValue().toInt();
			for(int numCour=1;numCour<=nbRows;numCour++) {
				PixelFailureEntryRow row=ntcip.getPixelFailureEntry().getModel().getRow(new OID().append(Ntcip12032005.PixelFailureDetectionTypeEnum.pixelTest).append(numCour));
				if(null!= row) {
					Point2D point=new Point2D.Double(
							row.getPixelFailureXLocation().toInt(),
							row.getPixelFailureYLocation().toInt());
					listeDefauts.put(point,numCour);
				}
				
			}
		}
		}
		this.addMouseListener(this);
	}
	public static void main(String args[])
	{
		JFrame maFrame=new JFrame();
		String aAfficher=
				"[pt100o50][tr91,13,288,16][sc5]BIDULE[tr91,42,288,16][sc5]SECOND[g23,15,1]"+
				"[pt100o50][tr91,13,288,16][sc5]TRUC[tr91,42,288,16][sc5]CHOUETTE[g41,5,1]";
		MaMatrice matrice=new MaMatrice(null);
		matrice.addMouseListener(matrice);
		matrice.processChaineAffichee(aAfficher);
		maFrame.add(matrice);
		maFrame.pack();
		maFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		maFrame.setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		super.paint(g);
//		BufferedImage img = null;
//		try {
//		    img = ImageIO.read(new File("strawberry.jpg"));
//			g2.drawImage(img, 1, 1, nbPixelX*nbPixPoint, nbPixelY*nbPixPoint,null);
//		} catch (IOException e) {
//		}		
		{
			Rectangle2D rect = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
			g2.setColor(Color.black);
			g2.fill(rect);
		}
		g2.setColor(new Color(0xFFC009));
		Font font = new Font("Monaco", Font.PLAIN, 16 * nbPixPoint);

		g2.setFont(font);
//		FontMetrics fontMetrics = g2.getFontMetrics();

		// Draw a string such that its base line is at x, y

//		if (null != aAfficher) {
		if(false==pageOff) {
			if (0 != pages.size()) {
				if ((0 <= pageCour) && (pageCour < pages.size())) {
					MaPage page = pages.get(pageCour);
					displayPage(page, g2);
				}
			}
		}
//		}

		// Draw a string such that the top-left corner is at x, y

//		  if(-1!=numMessage) {
//		  g2.drawString("Message "+numMessage, 1, 16*nbPixPoint+fontMetrics.getAscent());
//		  }

		g2.setColor(Color.white);
		for (int x = 0; x < (nbPixelX * nbPixPoint) / (16 * nbPixPoint); x++) {
			for (int y = 0; y < (nbPixelY * nbPixPoint) / (nbPixPoint * 8); y++) {
				Rectangle2D rect = new Rectangle2D.Double(x * 16 * nbPixPoint, y * 8 * nbPixPoint,
						Math.min(16 * nbPixPoint, getWidth() - x * 16 * nbPixPoint),
						Math.min(8. * nbPixPoint, getHeight() - 8 * nbPixPoint));
				g2.draw(rect);
			}
		}
		g2.setColor(Color.black);
		for (Entry<Point2D, Integer> current : listeDefauts.entrySet()) {
			Point2D point = current.getKey();
			Rectangle2D rect = new Rectangle2D.Double(point.getX() * nbPixPoint, point.getY() * nbPixPoint, nbPixPoint,
					nbPixPoint);
			g2.fill(rect);
		}
		g2.setColor(Color.red);
		for (Entry<Point2D, Integer> current : listeDefauts.entrySet()) {
			Point2D point = current.getKey();
			Rectangle2D rect = new Rectangle2D.Double(point.getX() * nbPixPoint, point.getY() * nbPixPoint, nbPixPoint,
					nbPixPoint);
			g2.draw(rect);
		}
	}

	private void displayPage(MaPage page, Graphics2D g2) {
		for (MonGraphique graph : page.getListeGraphique()) {
			displayGraphique(graph, g2);
		}
		for (MonTexte texte : page.getListeTexte()) {
			displayTexte(texte, g2);
		}
	}

	private void displayTexte(MonTexte texte, Graphics2D g2) {
		Rectangle2D rect = texte.getRect();
		String buffer = texte.getChaine();

		int size = 16;
		float posX = 0;
		float posY = 0;
		if (null != rect) {
			size = (int) rect.getHeight();
			posX = (float) rect.getX();
			posY = (float) rect.getY();
		}
		g2.setFont(new Font("Monaco", Font.PLAIN, size * nbPixPoint));
		System.out.println("Afficher " + buffer + " en " + (float) (posX * nbPixPoint) + "x"
				+ (float) ((posY + size) * nbPixPoint));
		g2.drawString(buffer, (float) (posX * nbPixPoint), (float) ((posY + size) * nbPixPoint));
	}

	private Image getImage(MonGraphique graph) {
		Image image=graph.getImage();
		if(null==image) {
			String nomImage=null;
			if(null!=ntcip) {
				DmsGraphicEntryRow row=ntcip.getDmsGraphicEntry().getModel().getRow(new OID().append(graph.getGraphicNum()));
				if(null!=row) {
					nomImage=row.getDmsGraphicName().toString();
				}
			} else {
				MessageFormat mf=new MessageFormat("72x72/fx_{0,number,000}.bmp");
				Object infos[]= {Integer.valueOf(graph.getGraphicNum())};
				nomImage=mf.format(infos);

			}
			if(null!=nomImage) {
				System.out.println("Nom de l'image : "+nomImage);
				BufferedImage img = null;
				try {
				    img = ImageIO.read(new File(nomImage));
				    graph.setImage(image);
				    image=img;
				} catch (IOException e) {
					System.out.println("Impossible d'afficher l'image" +nomImage.toString());
				}		
			}
		}
		return image;
	}

	private void displayGraphique(MonGraphique graph, Graphics2D g2) {
		Image img = getImage(graph);
		if (null != img) {
			if ((0 != img.getHeight(null)) && (0 != img.getWidth(null))) {
				AffineTransform at = new AffineTransform((double) nbPixPoint, 0.0, 0.0, (double) nbPixPoint,
						(graph.getPoint().getX() - 1) * nbPixPoint, (graph.getPoint().getY() - 1) * nbPixPoint);
				g2.drawImage(img, at, null);
			}
		}
	}

	private void removePixelDefault(Point2D point,Integer index) {
		int lastRow=ntcip.getPixelFailureTableNumRows().getValue().toInt();
		int shortError=ntcip.getShortErrorStatus().getValue().toInt();
		PixelFailureEntryRow row=ntcip.getPixelFailureEntry().getModel().getRow(new OID().append(Ntcip12032005.PixelFailureDetectionTypeEnum.pixelTest).append(index.intValue()));
		if(null!=row) {
			PixelFailureEntryRow last=ntcip.getPixelFailureEntry().getModel().getRow(new OID().append(Ntcip12032005.PixelFailureDetectionTypeEnum.pixelTest).append(lastRow));
			Point2D replacedPoint=new Point2D.Double((double)last.getPixelFailureXLocation().toInt(),(double)last.getPixelFailureYLocation().toInt());
			row.setPixelFailureXLocation(last.getPixelFailureXLocation());
			row.setPixelFailureYLocation(last.getPixelFailureYLocation());
			ntcip.getPixelFailureEntry().removeRow(new OID().append(Ntcip12032005.PixelFailureDetectionTypeEnum.pixelTest).append(lastRow));
			ntcip.getPixelFailureTableNumRows().setValue(new Integer32(lastRow-1));
			ntcip.getDmsPixelFailureTestRows().setValue(new Integer32(lastRow-1));
			listeDefauts.put(replacedPoint,index);
			listeDefauts.remove(point);
			if(0==(lastRow-1)) {
				ntcip.getShortErrorStatus().setValue(new Integer32(shortError&(~(1<<5))));
			}
		} else {
			System.out.println("Pas normal, il devrait y avoir une ligne");
		}

	}
	private void addPixelDefault(Point2D point) {
		int lastRow=ntcip.getPixelFailureTableNumRows().getValue().toInt();
		int shortError=ntcip.getShortErrorStatus().getValue().toInt();
		Variable values[]= {
				new Integer32(2),
				new Integer32(lastRow+1),
				new Integer32((int)point.getX()),
				new Integer32((int)point.getY()),
				new Integer32(7) };
		if(null!=ntcip.getPixelFailureEntry().addNewRow(new OID().append(Ntcip12032005.PixelFailureDetectionTypeEnum.pixelTest).append(lastRow+1),values)) {

		ntcip.getPixelFailureTableNumRows().setValue(new Integer32(lastRow+1));
		ntcip.getDmsPixelFailureTestRows().setValue(new Integer32(lastRow+1));
		listeDefauts.put(point,lastRow+1);
		if(0==((1<<5)&shortError)) {
			ntcip.getShortErrorStatus().setValue(new Integer32(shortError|(1<<5)));
		}
		} else {
			System.out.println("Erreur d'insertion de defaut.");
		}
	}
	private boolean hasPixelHs(Point2D carte) {
		boolean trouve=false;
		for(int indX=0;(indX<nbPixelCarteX)&&(false==trouve);indX++) {
			for(int indY=0;(indY<nbPixelCarteY)&&(false==trouve);indY++) {
				Point2D point=new Point2D.Double(carte.getX()*nbPixelCarteX+indX,carte.getY()*nbPixelCarteY+indY);
				Integer index=listeDefauts.get(point);
				if(null!=index) {
					trouve=true;
				}
			}
		}
		return trouve;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==MouseEvent.BUTTON1) {
			System.out.println("Bouton appuyé "+e.getX()+"x"+e.getY());
			Point2D point=new Point2D.Double(e.getX()/nbPixPoint,e.getY()/nbPixPoint);
			Integer index=listeDefauts.get(point);
			if(null!=index) {
				removePixelDefault(point,index);
				/* Changer le nombre de pixels HS */
			} else {
				addPixelDefault(point);
			}

			repaint();

		} else 	if(e.getButton()==MouseEvent.BUTTON3) {
			Point2D carte=new Point2D.Double(e.getX()/nbPixPoint/nbPixelCarteX,e.getY()/nbPixPoint/nbPixelCarteY);
			if(hasPixelHs(carte)) {
				for(int indX=0;indX<nbPixelCarteX;indX++) {
					for(int indY=0;indY<nbPixelCarteY;indY++) {
						Point2D point=new Point2D.Double(carte.getX()*nbPixelCarteX+indX,carte.getY()*nbPixelCarteY+indY);
						Integer index=listeDefauts.get(point);
						if(null!=index) {
							removePixelDefault(point, index);
						}
					}
				}
			} else {
				for(int indX=0;indX<nbPixelCarteX;indX++) {
					for(int indY=0;indY<nbPixelCarteY;indY++) {
						Point2D point=new Point2D.Double(carte.getX()*nbPixelCarteX+indX,carte.getY()*nbPixelCarteY+indY);
						Integer index=listeDefauts.get(point);
						if(null==index) {
							addPixelDefault(point);
						}
					}
				}
				
			}
			repaint();
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforePrepareMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterPrepareMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		if (changeEvent.getNewValue() instanceof OctetString) {
			OctetString actMess = (OctetString) changeEvent.getNewValue();

			if (null != ntcip) {
				int typeMessage = (int) actMess.get(3);
				int numMessage = (int) actMess.get(5);
				DmsMessageEntryRow row = ntcip.getDmsMessageEntry().getModel()
						.getRow(new OID().append(typeMessage).append(numMessage));
				if (null != row) {
					String chaineAAfficher = row.getDmsMessageMultiString().toString();
//					aAfficher = chaineAAfficher;
					DmsMessageEntryRow currentMessage = ntcip.getDmsMessageEntry().getModel()
							.getRow(new OID().append(Ntcip12032005.DmsMessageMemoryTypeEnum.currentBuffer).append(1));
					if (null != currentMessage) {
						currentMessage.setDmsMessageCRC(row.getDmsMessageCRC());
						currentMessage.setDmsMessageMultiString(row.getDmsMessageMultiString());
						currentMessage.setDmsMessageRunTimePriority(row.getDmsMessageRunTimePriority());
					}
					ntcip.getDmsActivateMsgError().setValue(new Integer32(Ntcip12032005.DmsActivateMsgErrorEnum.none));
					processChaineAffichee(chaineAAfficher);
				}
			}

			repaint();
		}

	}

	private void processPattern2(String group,ArrayList<MaPage> pages) {
		if(group.startsWith("g")) {
			MessageFormat mf=new MessageFormat("g{0,number,integer},{1,number,integer},{2,number,integer}");
			try {
				Object params[]=mf.parse(group);
				MonGraphique graph=new MonGraphique(new Point2D.Double(((Number)params[1]).doubleValue(),((Number)params[2]).doubleValue()),
						((Number)params[0]).intValue());
				MaPage page=getLastPage(pages);
				page.addGraphique(graph);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if(group.startsWith("pt")) {
			if(0!=buffer.length()) {
				/* Afficher le texte... */
				addString(pages);
			}
			MessageFormat mf=new MessageFormat("pt{0,number,integer}o{1,number,integer}");
			try {
				Object params[]=mf.parse(group);
				MaPage page=new MaPage(((Number)params[0]).intValue(),((Number)params[1]).intValue());
				pages.add(page);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(group.startsWith("tr")) {
			MessageFormat mf=new MessageFormat("tr{0,number,integer},{1,number,integer},{2,number,integer},{3,number,integer}");
			try {
				if(0!=buffer.length()) {
					/* Afficher le texte... */
					addString(pages);
				}
				Object testArgs[]= {1,2,3,4};
				System.out.println("Test format "+mf.format( testArgs));
				Object params[]=mf.parse(group);
				System.out.println("Affichage du graphique "+params[0]);
				rect=new  Rectangle2D.Double(
						((Number)params[0]).doubleValue(),
						((Number)params[1]).doubleValue(),
						((Number)params[2]).doubleValue(),
						((Number)params[3]).doubleValue());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	private void processChaineAffichee(String chaineAMatcher) {
		ArrayList<MaPage> listePages=new ArrayList<MaPage>();
		
		Pattern pattern = Pattern.compile("\\[(.*?)\\]");
		Matcher m = pattern.matcher(chaineAMatcher);
		int chaineStart=0;
		int indice=0;
		while (m.find()) {
		    String s = m.group(indice);
		    if(chaineStart!=m.start(indice)) {
		    	buffer.append(chaineAMatcher.substring(chaineStart,m.start(0)));
		    }
	    	chaineStart=m.end(indice);
		   System.out.println("Pattern "+m.start(indice)+"-"+m.end(indice)+" :"+s +" ou "+m.group(1)); 
		   processPattern2(m.group(1),listePages);
		}	
		if(chaineStart<chaineAMatcher.length()) {
		   	buffer.append(chaineAMatcher.substring(chaineStart,chaineAMatcher.length()));
		}
		if(0!=buffer.length()) {
			/* Afficher le texte... */
			addString(listePages);
		}
		
		resetPages(listePages);

		
	}

	private void resetPages(ArrayList<MaPage> listePages) {
		pageCour=0;
		pageOff=false;
		this.pages=listePages;
		switch(listePages.size()) {
		case 0:
			notFin=false;
			break;
		case 1:
			if(0==listePages.get(0).getDureeOff()) {
				notFin=false;
				break;
			}
		default :
			if(null==monThread) {
				notFin=true;
				monThread =new Thread(this,"Rafraichissement");
				monThread.start();
			}
			break;
		}
	}

	private	StringBuffer buffer=new StringBuffer();
	private Rectangle2D rect=null;
	

	private MaPage getLastPage(ArrayList<MaPage> pages) {
		MaPage page=null;
		if(0!=pages.size()) {
			page=pages.get(pages.size()-1);
		} else {
			page=new MaPage(50,0);
			pages.add(page);
		}
		return page;
	}
	private void addString(ArrayList<MaPage> pages)  
	{
		MaPage page=getLastPage(pages);
		MonTexte texte=new MonTexte(rect, buffer.toString());
		page.addTexte(texte);
		buffer=new StringBuffer();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(notFin) {
			MaPage page=getPageCour();
			if(null==page) {
				notFin=false;
			} else {
				int duree=0;
				if(pageOff) {
					duree=page.getDureeOn();
					pageOff=false; 
				} else {
					pageOff=true;
					duree=page.getDureeOff();
				}
				if(0!=duree) {
					try {
						Thread.sleep(duree*100);
						repaint();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(pageOff) {
					incrPageCour();
				}
			}
		}
		monThread=null;
		
	}
	private void incrPageCour() {
		if(null!=pages) {
			if(0!=pages.size()) {
				pageCour=(pageCour+1)%pages.size();
			}
		}
		
	}
	private MaPage getPageCour() {
		MaPage page=null;
		if(null!=pages) {
			if(0!=pages.size()) {
				if(-1==pageCour) 
				{
					pageCour=0;
				}
				if((0<=pageCour)&&(pageCour<pages.size())) {
					page=pages.get(pageCour);
				} 
			}
		}
		return page;
	}
}
