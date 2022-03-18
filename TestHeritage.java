package ma.education.hajar.TP2;

import ma.education.tp1.introduction.Salle;

      public class TestHeritage {
    	  
      
    	  public static void main(String[] args) {
    		  Salle s1=new ma.education.tp2.SalleCours(1, "Salle 1",(byte) 20);
    			ma.education.tp2.SalleCours s2= new ma.education.tp2.SalleCours(2, "Salle 2",(byte) 20);
    			ma.education.tp2.SalleCours s3=(ma.education.tp2.SalleCours)s1;
    			ma.education.tp2.SalleCours s4=s2;
    			
    			System.out.println(s1.id);
    			System.out.println(s2.id);
    			System.out.println(s3.nom);
    			System.out.println(s4.nom);
    			
    			


        }
}
