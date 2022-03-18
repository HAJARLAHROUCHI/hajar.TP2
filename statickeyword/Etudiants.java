package ma.education.tp2.statickeyword;

public class Etudiants {
public long id; 
	
	public String nom;
	
	static int nbEtudiants;
	
	public Etudiants (long id, String nom,int nb) {
		
		this.id = id;
		this.nom = nom;
		nbEtudiants+=nb;
		
		
	}

}
