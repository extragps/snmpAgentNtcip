package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTesting {

	static	StringBuffer buffer=new StringBuffer();
	static Rectangle2D rect=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\[(.*?)\\]");
//		Matcher m = pattern.matcher("[gr10,2,1,1,2]afficher[coucou]");
		String chaineAMatcher ="[pt50o0][g10,1,1,48,32][tr1,1,48,16]C[sc5]O";
		Matcher m = pattern.matcher(chaineAMatcher);
		StringBuffer buffer=new StringBuffer();
		int chaineStart=0;
		int indice=0;
		while (m.find()) {
		    String s = m.group(indice);
		    if(chaineStart!=m.start(indice)) {
		    	buffer.append(chaineAMatcher.substring(chaineStart,m.start(indice)));
		    }
		    chaineStart=m.end(indice);
		   System.out.println("Pattern "+m.start(indice)+"-"+m.end(indice)+" :"+s +" ou "+m.group(1)); 
		   processPattern(m.group(1));
		}	
		if(chaineStart<chaineAMatcher.length()) {
		   	buffer.append(chaineAMatcher.substring(chaineStart,chaineAMatcher.length()));
		}
		if(0!=buffer.length()) {
			/* Afficher le texte... */
			displayText(buffer.toString());
			buffer=new StringBuffer();
		}

	}

	private static void displayGraphic(Object infos[]) {
		int numGraphique=((Number)infos[0]).intValue();
		MessageFormat mf=new MessageFormat("ax_{0,number,000}.bmp");
		String nomImage=mf.format(infos);
		System.out.println("Nom de l'image : "+nomImage);
	}
	private static void displayText(String chaine) {
		int size=16;
		if(null!=rect) {
			size=(int)rect.getHeight();
		}
	}

	private static void processPattern(String group) {
		if(group.startsWith("g")) {
			MessageFormat mf=new MessageFormat("g{0,number,integer},{1,number,integer},{2,number,integer},{3,number,integer},{4,number,integer}");
			try {
				Object params[]=mf.parse(group);
				displayGraphic(params);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if(group.startsWith("tr")) {
			MessageFormat mf=new MessageFormat("tr{0,number,integer},{1,number,integer},{2,number,integer},{3,number,integer}");
			try {
				if(0!=buffer.length()) {
					/* Afficher le texte... */
					displayText(buffer.toString());
					buffer=new StringBuffer();
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

}
