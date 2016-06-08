
/**
 * Beschreiben Sie hier die Klasse Verein.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Verein
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private int punkte;
    private int geschossen;
    private int kassiert;
    private int torDifferenz;
    private int gespielt;
    private int gewonnen;
    private int verloren;
    private int unentschieden;

    /**
     * Konstruktor für Objekte der Klasse Verein
     */
    public Verein(String pNeuerName)
    {
        // Instanzvariable initialisieren
        name = pNeuerName;
        geschossen = 0;
        kassiert = 0;
        torDifferenz = geschossen - kassiert;
        punkte = 0;
        gespielt = 0;
        gewonnen = 0;
        verloren = 0;
        unentschieden = 0;
        
        
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getTorDifferenz()
    {
        torDifferenz = geschossen - kassiert;
        return torDifferenz;
    }
    public String getName()
    {
    return name;
    }
    
    public void setName(String pNeuerName)
    {
    name = pNeuerName;    
    }
    
    public int getPunkte()
    {
    return punkte;    
    }
    
    public void setPunkte (int pNeuePunkte)
    {
    punkte = punkte + pNeuePunkte;  
    }  
    
    public int getGeschossen ()
    {
     return geschossen;   
    }
    
    public int getKassiert()
    {
    return kassiert;    
    }
    
    public void setGeschossen(int pNeueGeschossen)
    {
    geschossen = geschossen + pNeueGeschossen;   
    }
    
    public void setKassiert (int pNeueKassiert)
    {
    kassiert = kassiert + pNeueKassiert;   
    }
    
    public int getGewonnen()
    {
     return gewonnen;   
    }

     public int getVerloren()
    {
     return verloren;   
    }   
    
    public int getUnentschieden()
    {
     return unentschieden;   
    }
    
    public int getGespielt()
    {
     return gespielt;   
    }
    
    public void setGespielt(int pNeueGespielt)
    {
        gespielt = gespielt + pNeueGespielt;
    }
    
    public void setGewonnen(int pNeueGewonnen)
    {
        gewonnen = gewonnen + pNeueGewonnen;
    }
    
    public void setVerloren(int pNeueVerloren)
    {
        verloren = verloren + pNeueVerloren;
    }
    
    public void setUnentschieden(int pNeueUnentschieden)
    {
     unentschieden = unentschieden + pNeueUnentschieden;   
    }
    
    }
