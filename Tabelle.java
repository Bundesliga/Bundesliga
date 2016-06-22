
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Beschreiben Sie hier die Klasse Tabelle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tabelle 

{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private static Verein[] tabelle = new Verein[18];
    private static int rang;
    private static Verein verein1, verein2, verein3, verein4, verein5, verein6, verein7, verein8, verein9, verein10, verein11, verein12, verein13, verein14, verein15, verein16, verein17, verein18;

    /**
     * Konstruktor für Objekte der Klasse Tabelle
     */
    public Tabelle()
    {
        // Instanzvariable initialisieren
    }
    
    public static void main(String[] args) {
        starteNeueSaison();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public static void starteNeueSaison()
    {
     verein1 = new Verein("FC Bayern München"); 
     verein1.setVNr(1);
     tabelle[0] = verein1;
     verein2 = new Verein ("SV Darmstadt 98");
     verein1.setVNr(2);
     tabelle[1] = verein2;
     verein3 = new Verein ("Borussia Dortmund");
     verein1.setVNr(3);
     tabelle[2] = verein3;
     verein4 = new Verein ("Bayer 04 Leverkusen");
     verein1.setVNr(4);
     tabelle[3] = verein4;
     verein5 = new Verein ("Borussia Mönchengladbach");
     verein1.setVNr(5);
     tabelle[4] = verein5;
     verein6 = new Verein("FC Schalke 04");
     verein1.setVNr(6);
     tabelle[5] = verein6;
     verein7 = new Verein ("1.FSV Mainz 05");
     verein1.setVNr(7);
     tabelle[6] = verein7;
     verein8 = new Verein ("Hertha BSC");
     verein1.setVNr(8);
     tabelle[7] = verein8;
     verein9 = new Verein ("VFL Wolfsburg");
     verein1.setVNr(9);
     tabelle[8] = verein9;
     verein10 = new Verein ("1.FC Köln");
     verein1.setVNr(10);
     tabelle[9] = verein10;
     verein11 = new Verein ("Hamburger SV");
     verein1.setVNr(11);
     tabelle[10] = verein11;
     verein12 = new Verein ("FC Ingolstadt");
     verein1.setVNr(12);
     tabelle[11] = verein12;
     verein13 = new Verein ("FC Augsburg");
     verein1.setVNr(13);
     tabelle[12] = verein13;
     verein14 = new Verein ("Werder Bremen");
     verein1.setVNr(14);
     tabelle[13] = verein14;
     verein15 = new Verein ("TSG Hoffenheim");
     verein1.setVNr(15);
     tabelle[14] = verein15;
     verein16 = new Verein ("Eintracht Frankfurt");
     verein1.setVNr(16);
     tabelle[15] = verein16;
     verein17 = new Verein ("Vfb Stuttgart");
     verein1.setVNr(17);
     tabelle[16] = verein17;
     verein18 = new Verein ("Hannover 96");
     verein1.setVNr(18);
     tabelle[17] = verein18;
     
     
     
        
    }
    
    public static Verein[] getTabelle()
    {
    return tabelle;    
    }
    
    public static void sortiereTabelle()
    {
    leseDatei();
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
                                                   fw.write(tabelle[i].getName() + ";" + tabelle[i].getVNr() + ";" + tabelle[i].getPunkte() + ";" + tabelle[i].getGeschossen() + ";" + tabelle[i].getKassiert()  + ";" + tabelle[i].getGespielt() + ";" + tabelle[i].getGewonnen()  + ";" + tabelle[i].getVerloren() + ";" + tabelle[i].getUnentschieden() + ";\n");
                                                  }
            
            fw.close();
        }
        catch (IOException e){
            System.out.println("Fehler beim Schreiben der Datei tabellenSpeicher");
            System.out.println(e.toString());
        }
    }


public static void leseDatei() {
        
        try {
            
            BufferedReader  br = new BufferedReader(new InputStreamReader(new FileInputStream("tabellenSpeicher.csv"),"UTF8"));
            String line = null;
            int i = 0;
            while((line = br.readLine()) != null) {
                // Ganze Zeile:
                // System.out.println(line);               
                String[] parts = line.split(";");
                tabelle[i] = new Verein("");   
                tabelle[i].setName(parts[0]);
                tabelle[i].setVNr(Integer.parseInt(parts[1]));
                tabelle[i].setPunkte(Integer.parseInt(parts[2]));
                tabelle[i].setGeschossen(Integer.parseInt(parts[3]));
                tabelle[i].setKassiert(Integer.parseInt(parts[4]));               
                tabelle[i].setGespielt(Integer.parseInt(parts[5]));
                tabelle[i].setGewonnen(Integer.parseInt(parts[6]));
                tabelle[i].setVerloren(Integer.parseInt(parts[7]));
                tabelle[i].setUnentschieden(Integer.parseInt(parts[8]));
                tabelle[i].setUnentschieden(Integer.parseInt(parts[8]));
                
                i++;
                }
        
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }/* finally {
           if( br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            } */
        }
    }


   
   
