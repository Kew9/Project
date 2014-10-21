import javax.swing.*;


public class Main {
	public static void main(String Args[])
	
 { String scelta;
     rubrica rubrica=new rubrica();
       do
		{scelta=JOptionPane.showInputDialog("Benvenuto nella rubrica, cosa vuoi fare?\n"
			+ "Scrivi:\n Inserisci per inserire nuovo contatto\n"
			+ " Rimuovi per rimuovere un contatto\n"
			+ " Ricerca per cercare le info di un contatto\n"
			+ " Info per stampare l'elenco dei contatti\n"
			+ " Modifica per modificare un contatto\n"
			+ " RicercaRapida per cercare i cognomi che iniziano per una lettera\n"
			+ " Esci per uscire dall'applicazione\n");
		  scelta=scelta.toUpperCase();
	        switch(scelta)
	           {case"INSERISCI":
	             {rubrica.input();} 
	               break;
	            case"RIMUOVI":
	             {rubrica.cancellazione(JOptionPane.showInputDialog("Inserisci il cognome della persona da cancellare"));}
	               break;
	            case"RICERCA":
	             {rubrica.ricerca(JOptionPane.showInputDialog("Inserisci il cognome della persona da ricercare"));}
	               break;
	            case"INFO":
	             {rubrica.Info();}
	               break;
	            case"MODIFICA":
	             {rubrica.Modifica(JOptionPane.showInputDialog(null,"Inserisci il cognome del contatto da modificare"));}
	               break;
	            case"RICERCARAPIDA":
	             {rubrica.RicercaRapida(JOptionPane.showInputDialog("Inserire la lettera:"));}
	               break;
	           }
	    } while(!(scelta.equalsIgnoreCase("Esci")));
	
	
	
	}
 }

