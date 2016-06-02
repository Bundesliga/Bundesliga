/**
 * Beschreiben Sie hier die Klasse Tipper.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tipper
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Verein[] verein;
    private int punkte;
    private boolean admin;
    private String name;
    private String passwort;
    private Verein verein1, verein2, verein3, verein4, verein5, verein6, verein7, verein8, verein9, verein10, verein11, verein12, verein13, verein14, verein15, verein16, verein17, verein18;

    
    /**
     * Konstruktor für Objekte der Klasse Tipper
     */
    public Tipper(String pNeuerTipper)
    {
        name = pNeuerTipper;
        punkte = 0;
        passwort = passwort;
        admin = false;
       
    }
    
    public boolean getAdmin()
    {
        return admin;
    }
    
    public boolean setAdmin( boolean pNeuerAdmin)
    {
        admin = pNeuerAdmin;
    }
        
    public String getPasswort()
    {
        return passwort;
    }
    public String getName()
    {
        return name;
    }
    public int getPunkte()
    {
        return punkte;
    }
    
    public void setPasswort( String pNeuesPasswort)
    {
        passwort = pNeuesPasswort;
    }
    public void setName( String pNeuerName)
    {
        name = pNeuerName;
    }
    public void setPunkte( int pNeuePunkte)
    {
        punkte = pNeuePunkte;
    }
    
    public void tippAbgeben()
    {
        verein[1].setGeschossen();
        verein[2].setGeschossen();
    }
}

