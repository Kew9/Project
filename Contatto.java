public class Contatto {
	private String nome,cognome,telefono,mail,indirizzo,telefonofisso;
	
	
public Contatto()
{nome= "";
cognome= "";
telefono= "";
mail= "";
indirizzo= "";
telefonofisso= "";
}

public Contatto(String nome, String cognome, String telefono,String telefonofisso, String mail, String indirizzo)
{this.nome=nome;
this.cognome= cognome;
this.telefono= telefono;
this.telefonofisso=telefonofisso;
this.mail= mail;
this.indirizzo= indirizzo;
}

public String getTelefonoFisso() {
	return telefonofisso;
}

public void setTelefonoFisso(String telefonofisso) {
	this.telefonofisso = telefonofisso;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
    this.cognome=this.cognome.toLowerCase();
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getIndirizzo() {
	return indirizzo;
}

public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}

}
