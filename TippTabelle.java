
/**
 * Beschreiben Sie hier die Klasse TippTabelle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TippTabelle
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Tipper[] tippTabelle;
    private int rang;
    
    private Tipper tipper1, tipper2, tipper3, tipper4, tipper5, tipper6, tipper7, tipper8, tipper9, tipper10;
    
    /**
     * Konstruktor für Objekte der Klasse TippTabelle
     */
    public TippTabelle()
    {
        // Instanzvariable initialisieren
        tippTabelle = new Tipper[10];
        starteNeueTippRunde();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void starteNeueTippRunde()
    {
       tipper1 = new Tipper("KaiK");
       tipper1.setAdmin(true);
       tippTabelle[0] = tipper1;
       tipper2 = new Tipper("KaiH");
       tipper2.setAdmin(true);
       tippTabelle[1] = tipper2;
       tipper3 = new Tipper("Nils");
       tipper3.setAdmin(true);
       tippTabelle[2] = tipper3;
       tipper4 = new Tipper("Shanon");
       tipper4.setAdmin(true);
       tippTabelle[3] = tipper4;
       tipper5 = new Tipper("Arjen");
       tippTabelle[4] = tipper5;
       tipper6 = new Tipper("Franck");
       tippTabelle[5] = tipper6;
       tipper7 = new Tipper("Oliver");
       tippTabelle[6] = tipper7;
       tipper8 = new Tipper("Karl-Heinz");
       tippTabelle[7] = tipper8;
       tipper9 = new Tipper("Uli");
       tippTabelle[8] = tipper9;
       tipper10 = new Tipper("Sepp");
       tippTabelle[9] = tipper10;
             
    }
    
     public void sortiereTippTabelle()
    {
    int z = tippTabelle.length;
    
    while (z>1)
    {
        
        for (int i = 0; i < (z-1); i++)
            {
             if (tippTabelle[i+1] != null)
                {
                 if (tippTabelle[i].getPunkte() < tippTabelle[i+1].getPunkte())
                        {
                         Tipper zwischenspeicher = tippTabelle[i];
                         tippTabelle[i] = tippTabelle[i+1];
                         tippTabelle[i+1] = zwischenspeicher;
                    } 
                }
            }
     z--;
    }
    
    for (int n = 0; n < tippTabelle.length; n++)
    {
     System.out.println("Verein: " + tippTabelle[n].getName() + "  Punkte: " + tippTabelle[n].getPunkte() + "\n");  
    }
}
    
}
