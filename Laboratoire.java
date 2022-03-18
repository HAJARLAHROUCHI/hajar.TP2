package ma.education.tp2;

import ma.education.tp1.introduction.Salle;

public class Laboratoire extends Salle {
	public String type;
	  
	  public Laboratoire(long id, String nom, String type) {
		  super(nom);
		  this.type=type;
	  }

}
