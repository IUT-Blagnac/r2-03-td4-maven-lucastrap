
/**
 *TP2
 *Straputicari luca
 */

import java.util.Scanner ;
public class DatesEtCompagnie

{
    
    
        /**
         *  @param annee une année
         *  @return vrai si l'année est bissextile, faux sinon
         */
        public static boolean estBissextile(int annee)
        {
            boolean estBissextile;

            if(annee % 4 == 0 && annee % 100 != 0) 
            {
                estBissextile = true;

            }
            else if (annee % 400 ==0) {
                estBissextile=true;
            }
            else{
                estBissextile = false ;
            }
            return estBissextile ;
        }

        /**
         *  Détermine le nombre de jours dans un mois d'une année donnée
         *  @param mois
         *      mois
         *  @param année
         *      année
         *  @return le nombre de jours dans le mois
         */
        public static int nbJours(int mois, int annee) {
            int nbJours;
            boolean estBissextile;

            if (mois==1||mois==3||mois==5||mois==7||mois==8||mois==10||mois==12)
            {
                nbJours=31;
            }
            else{
                nbJours=30;
            }

            if (mois==2)
            {
                if( estBissextile(annee)){
                    nbJours=29;
                }
                else{
                    nbJours=28;
                }    
            }

            return nbJours;
        }

        /**
         *  Détermine si une date est valide
         *  @param jour
         *      jour de la date
         *  @param mois
         *      mois de la date
         *  @param année
         *      année de la date
         *  @return vrai si la date est valide, faux sinon
         */
        public static boolean estValide(int jour, int mois, int annee) {

            boolean estValide = false;
            if (annee>1582) {
                if (mois>0 && mois <13) {
                    if (jour>0 && jour<=nbJours(mois,annee)) {
                        estValide=true;
                    
                    }
                }
            }

            
            return estValide ;
        }
        public static int saisieEntier(String saisie) {
            System.out.println(saisie);
            Scanner clavier = new Scanner(System.in) ;
            int nombreSaisi = clavier.nextInt() ;
            return nombreSaisi ;
        }
        public static void main(String[] args) {
            int jour = saisieEntier("Quel jour");
            int mois = saisieEntier ("Quel mois");
            int annee = saisieEntier("Quel année");
            
            if (estValide(jour,mois,annee)) {
                System.out.println("le " + jour +"/"+ mois +"/"+ annee +"/"+ " "+"est une date correcte");
            }else
            {
                System.out.println("Ceci n est pas une date valide"+" "+ jour +"/"+ mois +"/"+ annee );
                
            }
                
            }

           
        }

        
    