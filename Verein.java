
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
    private int unendschieden;

    /**
     * Konstruktor für Objekte der Klasse Verein
     */
    public Verein(String pNeuerVerein)
    {
        // Instanzvariable initialisieren
        name = pNeuerVerein;
        geschossen = 0;
        kassiert = 0;
        torDifferenz = 0;
        punkte = 0;
        gespielt = 0;
        gewonnen = 0;
        verloren = 0;
        unendschieden = 0;
        
        
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
    
    public void setName( String pNeuerName)
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
    
    }
