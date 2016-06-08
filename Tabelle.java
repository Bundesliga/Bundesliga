import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Beschreiben Sie hier die Klasse Tabelle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tabelle
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Verein[] tabelle;
    private int rang;
    private Verein verein1, verein2, verein3, verein4, verein5, verein6, verein7, verein8, verein9, verein10, verein11, verein12, verein13, verein14, verein15, verein16, verein17, verein18;

    /**
     * Konstruktor für Objekte der Klasse Tabelle
     */
    public Tabelle()
    {
        // Instanzvariable initialisieren
        tabelle = new Verein[18];
        starteNeueSaison();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void starteNeueSaison()
    {
     verein1 = new Verein("FC Bayern München");
     tabelle[0] = verein1;
     verein2 = new Verein ("SV Darmstadt 98");
     tabelle[1] = verein2;
     verein3 = new Verein ("Borussia Dortmund");
     tabelle[2] = verein3;
     verein4 = new Verein ("Bayer 04 Leverkusen");
     tabelle[3] = verein4;
     verein5 = new Verein ("Borussia Mönchengladbach");
     tabelle[4] = verein5;
     verein6 = new Verein("FC Schalke 04");
     tabelle[5] = verein6;
     verein7 = new Verein ("1.FSV Mainz 05");
     tabelle[6] = verein7;
     verein8 = new Verein ("Hertha BSC");
     tabelle[7] = verein8;
     verein9 = new Verein ("VFL Wolfsburg");
     tabelle[8] = verein9;
     verein10 = new Verein ("1.FC Köln");
     tabelle[9] = verein10;
     verein11 = new Verein ("Hamburger SV");
     tabelle[10] = verein11;
     verein12 = new Verein ("FC Ingolstadt");
     tabelle[11] = verein12;
     verein13 = new Verein ("FC Augsburg");
     tabelle[12] = verein13;
     verein14 = new Verein ("Werder Bremen");
     tabelle[13] = verein14;
     verein15 = new Verein ("TSG Hoffenheim");
     tabelle[14] = verein15;
     verein16 = new Verein ("Eintracht Frankfurt");
     tabelle[15] = verein16;
     verein17 = new Verein ("Vfb Stuttgart");
     tabelle[16] = verein17;
     verein18 = new Verein ("Hannover 96");
     tabelle[17] = verein18;
     
     
     
        
    }
    
    public void sortiereTabelle()
    {
    int z = tabelle.length;
    
    while (z>1)
    {
        
        for (int i = 0; i < (z-1); i++)
            {
             if (tabelle[i+1] != null)
                {
                 if (tabelle[i].getPunkte() < tabelle[i+1].getPunkte())
                        {
                         Verein zwischenspeicher = tabelle[i];
                         tabelle[i] = tabelle[i+1];
                         tabelle[i+1] = zwischenspeicher;
                    } else if (tabelle[i].getPunkte() == tabelle[i+1].getPunkte())
                                {   
                                    if (tabelle[i].getTorDifferenz() < tabelle[i+1].getTorDifferenz())
                                        {
                                         Verein zwischenspeicher = tabelle[i];
                                         tabelle[i] = tabelle[i+1];
                                         tabelle[i+1] = zwischenspeicher;   
                                        }
                                    
                                }
                }
            }
     z--;
    }
    
    for (int n = 0; n < tabelle.length; n++)
    {
     System.out.println("Verein: " + tabelle[n].getName() + "  Punkte: " + tabelle[n].getPunkte() + " " + tabelle[n].getGeschossen() + ":" + tabelle[n].getKassiert() + "  TD: " + tabelle[n].getTorDifferenz()+ "\n");  
    }
}

 
 public void schreibeDatei() 
    {
       
        try {
            //auch hier muss nun f�r die Umlaute ein "Umweg" gegangen werden, da �ber den FileWriter nicht mit UTF-8 kodiert wird
            File tabellenSpeicher = new File("tabellenSpeicher.csv");
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tabellenSpeicher), "UTF8"));
            
            //die Werte aus dem Array tabelle in eine neue Tabelle schreiben (�berschreiben der Datei "tabelle.csv")
            for (int i=0; i < 18; i++) {
                                                   fw.write(tabelle[i].getName() + ";" + tabelle[i].getPunkte() + ";" + tabelle[i].getGeschossen() + ";" + tabelle[i].getKassiert()  + ";"+ tabelle[i].getTorDifferenz() + ";" + tabelle[i].getGespielt() + ";" + tabelle[i].getGewonnen()  + ";" + tabelle[i].getVerloren() + ";" + tabelle[i].getUnentschieden() + ";\n");
                                                  }
            
            fw.close();
        }
        catch (IOException e){
            System.out.println("Fehler beim Schreiben der Datei tabellenSpeicher");
            System.out.println(e.toString());
        }
    }

public void leseDatei() {
        
        try {
            
            BufferedReader  br = new BufferedReader(new InputStreamReader(new FileInputStream("tabellenSpeicher.csv"),"UTF8"));
            String line = null;
            int i = 0;
            while((line = br.readLine()) != null) {
                // Ganze Zeile:
                // System.out.println(line);               
                String[] parts = line.split(";");
                tabelle[i] = new Verein();
                tabelle[i].setName(parts[0]);
                tabelle[i].setPunkte(Integer.parseInt(parts[1]));
                tabelle[1].setGeschossen(Integer.parseInt(parts[2]));
                tabelle[i].setKassiert(Integer.parseInt(parts[3]));
                tabelle[i].setTorDifferenz(Integer.parseInt(parts[4]));
                tabelle[i].setGespielt(Integer.parseInt(parts[5]));
                tabelle[i].setGewonnen(Integer.parseInt(parts[6]));
                tabelle[i].setVerloren(Integer.parseInt(parts[7]));
                tabelle[i].setUnentschieden(Integer.parseInt(parts[8]));
                
                i++;
                }
        
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    }
    
   
   
}
