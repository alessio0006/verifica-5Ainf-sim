
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,200);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h1> Formula1 Passion </h1>");
		sb.append("<br>");
		sb.append("<div style=table>");
		sb.append("<div> <tr> <th> Pilota </th> </div> <br>");
		sb.append("<div> <th>Punteggio </th> </tr> </div>"); 	
		sb.append("<div> <tr> <th>HAMILTON L. </th> </div> ");
		sb.append("<div> <th> 358 </th> </tr> </div>"); 	
		sb.append("<div> <tr> <th> VETTEL S. </th> </div>");
		sb.append("<div> <th>294 </th> </tr> </div>");
		sb.append("<div> <tr> <th> RAIKKONEN L. </th> </div>");
		sb.append("<div>  <th>236 </th> </tr> </div>"); 	
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String html=sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

