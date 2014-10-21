package rubrica;

import java.util.*;

import javax.swing.*;

public class rubrica {
	
	private Vector<Contatto> rubrica=new Vector<Contatto>(1,1);

	public void input()
	{
     Contatto Persona=new Contatto();
     Persona.setNome(JOptionPane.showInputDialog("Nome del contatto da inserire:"));
     Persona.setCognome(JOptionPane.showInputDialog("Cognome del contatto da inserire:"));
     Persona.setTelefono(JOptionPane.showInputDialog("Telefono del contatto da inserire:"));
     Persona.setTelefonoFisso(JOptionPane.showInputDialog("TelefonoFisso del contatto da inserire:"));
     Persona.setMail(JOptionPane.showInputDialog("Mail del contatto da inserire:"));
     Persona.setIndirizzo(JOptionPane.showInputDialog("Indirizzo del contatto da inserire:"));
     rubrica.addElement(Persona);
	}
	
	public void cancellazione(String cognome)
	{
		try
		   {if(rubrica.isEmpty()==true)
		       {JOptionPane.showMessageDialog(null, "Rubrica vuota!\n");}
		            else
		               {int i=0;
		                   while(!(rubrica.elementAt(i).getCognome().equalsIgnoreCase(cognome)))
		    	             i++;
		    	   rubrica.remove(i);
		    	   rubrica.trimToSize();
		              JOptionPane.showMessageDialog(null,"Eliminato\n");}
		   }  
		catch(Exception E){JOptionPane.showMessageDialog(null, "Contatto inesistente","Errore",JOptionPane.WARNING_MESSAGE);}
    }
	
	
	public void ricerca(String cognome)
	{
	try{	
		if(rubrica.isEmpty()==true)
		     {JOptionPane.showMessageDialog(null, "Rubrica vuota!");}
		else
		  {int i=0;
		    while(!(rubrica.elementAt(i).getCognome().equalsIgnoreCase(cognome)))
		    	i++;
		         
		          JOptionPane.showMessageDialog(null,"Cognome:" + rubrica.elementAt(i).getCognome() + "\n" +
		    	   "Nome:" + rubrica.elementAt(i).getNome() + "\n" +
		    	   "Telefono:" + rubrica.elementAt(i).getTelefono() + "\n" +
		    	   "TelefonoFisso:" + rubrica.elementAt(i).getTelefonoFisso() + "\n" +
		    	   "Mail:" + rubrica.elementAt(i).getMail() + "\n" +
		    	   "Indirizzo:" + rubrica.elementAt(i).getIndirizzo());
		  }
	    }
	catch(Exception E){JOptionPane.showMessageDialog(null,"Il contatto è inesistente","Errore" ,JOptionPane.ERROR_MESSAGE);}
	}
	
	public void Info()
	{
		if(rubrica.isEmpty()==true)
	     {JOptionPane.showMessageDialog(null, "Rubrica vuota!");}
	else
		for(int i=0;i<rubrica.capacity();i++)
		{JOptionPane.showMessageDialog(null,"Nome:"+ rubrica.elementAt(i).getNome() 
			+" Cognome:" + rubrica.elementAt(i).getCognome() 
			+" Telefono:"+ rubrica.elementAt(i).getTelefono() 
			+ " Telefono Fisso:"+ rubrica.elementAt(i).getTelefonoFisso() 
			+ " Mail:"+ rubrica.elementAt(i).getMail() 
			+ " Indirizzo" + rubrica.elementAt(i).getIndirizzo());
		}
		

	}
	
	
	public void Modifica(String cognome)
	{
	try{	
		if(rubrica.isEmpty()==true)
		     {JOptionPane.showMessageDialog(null, "Rubrica vuota!");}
		else
		  {int i=0;String temp;
		    while(!(rubrica.elementAt(i).getCognome().equalsIgnoreCase(cognome)))
		    	i++;
		         
		    temp=JOptionPane.showInputDialog("Cosa vuoi modificare?\n" +
		    		"Nome\n" +
		    		"Cognome\n" +
		    		"Telefono\n" +
		    		"TelefonoFisso\n" +
		    		"Mail\n" +
		    		"Indirizzo\n");
		    temp=temp.toUpperCase();
		    switch(temp)
		    {case "NOME":
		    	{rubrica.elementAt(i).setNome(JOptionPane.showInputDialog("Inserire nuovo nome"));}
		         break;
		     case "COGNOME":
	    	    {rubrica.elementAt(i).setCognome(JOptionPane.showInputDialog("Inserire nuovo Cognome"));}
	             break;
		     case "TELEFONO":
	    	    {rubrica.elementAt(i).setTelefono(JOptionPane.showInputDialog("Inserire nuovo Telefono"));}
	             break;
		     case "TELEFONOFISSO":
	    	    {rubrica.elementAt(i).setTelefonoFisso(JOptionPane.showInputDialog("Inserire nuovo TelefonoFisso"));}
	             break;
		     case "MAIL":
	    	    {rubrica.elementAt(i).setMail(JOptionPane.showInputDialog("Inserire nuovo Mail"));}
	             break;
		     case "INDIRIZZO":
	    	    {rubrica.elementAt(i).setIndirizzo(JOptionPane.showInputDialog("Inserire nuovo Indirizzo"));}
	             break;
		     
		    }
		    
		    
		  }
	    }
	catch(Exception E){JOptionPane.showMessageDialog(null,"Il contatto è inesistente","Errore" ,JOptionPane.ERROR_MESSAGE);}
	}
	
	
	public void RicercaRapida(String cognome)
	{
	try{cognome=cognome.toLowerCase();	
		if(rubrica.isEmpty()==true)
		     {JOptionPane.showMessageDialog(null, "Rubrica vuota!");}
		else
		  {int i=0;
		    for(i=0;i<rubrica.capacity();i++)
		        if(rubrica.elementAt(i).getCognome().startsWith(cognome))
		          JOptionPane.showMessageDialog(null,"Cognome:" + rubrica.elementAt(i).getCognome()
		        		                            +"  Telefono:" + rubrica.elementAt(i).getTelefono());
		  }
	    }
	catch(Exception E){JOptionPane.showMessageDialog(null,"Il contatto è inesistente","Errore" ,JOptionPane.ERROR_MESSAGE);}
	}
	
	
	
	
	
	
	
}
