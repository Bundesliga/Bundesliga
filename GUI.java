import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextArea; 

/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version numbes2qa1r or a date)
 */
public class Gui
{
    // instance variables - replace the example below with your own
    private static JComboBox<String> spieltag = new JComboBox<String>();
    private static JLabel[] heimMannsch = new JLabel[9], ausMannsch  = new JLabel[9];
    private static JTextField[] heimT = new JTextField[9], ausT  = new JTextField[9];
    private static JFrame mainFrame, anmelden;
    private static JButton login, logout, zeigeTipps/**admin only*/,tippsAuswerten, tippTabelle, eingabeBestaetigen, loeschen, zeigeTabelleBegegnung;
    private static JTextField benutzerName;
    private static JTextField Passwort;
    private static boolean admin = false,angemeldet = false;
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        //Füge der JComboBox die Spieltag-Bezeichnungen hinzu
        for(int i= 0; i<34;i++) {
            spieltag.addItem((i+1)+". Spieltag");
        }
        //Erstelle Fenster
        JFrame fenster = new JFrame();
        fenster.getContentPane().setLayout(new BorderLayout());

        /*
         * Erstelle 3 Vertikale Panels im BorderLayout 
         */
        JPanel oben = new JPanel(new BorderLayout());

        JPanel mitte = new JPanel();
        mitte.setLayout(new BoxLayout(mitte,BoxLayout.Y_AXIS));

        JPanel unten = new JPanel(new BorderLayout());

        /*
         * Füge diese dem fenster hinzu
         */
        fenster.add(oben,BorderLayout.NORTH);
        fenster.add(mitte,BorderLayout.CENTER);
        fenster.add(unten,BorderLayout.SOUTH);

        //HINZUFÜGEN VON KOMPONENTEN
        login = new JButton("Login"); 
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        unten.add(login);
        
      
            
        
       
    
        zeigeTipps = new JButton("Abgegebene Tipps"); 
        zeigeTipps.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            } 
        });
        unten.add(zeigeTipps);
        
        tippsAuswerten = new JButton("Tipps Auswerten"); 
        tippsAuswerten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        unten.add(tippsAuswerten);
        
        tippTabelle = new JButton("Tipp-Tabelle"); 
        tippTabelle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        unten.add(tippTabelle);
        
        eingabeBestaetigen = new JButton("Tabelle anzeigen"); 
        eingabeBestaetigen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Tabelle.main(new String[]{""});
             Tabelle.starteNeueSaison();
             Tabelle.sortiereTabelle();
            }
        });
        unten.add(eingabeBestaetigen);
        
        if (angemeldet = false){
         logout = new JButton("Logout"); 
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        fenster.getContentPane().add(logout);

         }
        


        /*
         * Button und JComboBox auf das obere Panel
         */
        JButton anmeldeBut = new JButton("anmelden");
        anmeldeBut.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               anmeldeFenster();
            }
        });
        oben.add(anmeldeBut,BorderLayout.EAST);
        oben.add(spieltag);

        /*
         * Füge dem MittelPanel die SpielPanels hinzu
         */
        JPanel[] spiele = new JPanel[9];
        for(int i= 0; i<spiele.length;i++) {
            spiele[i] = new JPanel();
            spiele[i].setLayout(new BoxLayout(spiele[i], BoxLayout.X_AXIS));

            JPanel heimPanel = new JPanel(new BorderLayout());
            heimMannsch[i] = new JLabel((i==0)?"FC Bayern München" :(i==1)? "Hamburger SV" : "FC Schalke 04");
            heimMannsch[i].setMinimumSize(new Dimension(0,heimMannsch[i].getMinimumSize().height));
            heimMannsch[i].setPreferredSize(heimMannsch[0].getPreferredSize());
            heimPanel.add(heimMannsch[i]);
            heimPanel.add(new JTextField(2),BorderLayout.EAST);

            JPanel ausPanel = new JPanel(new BorderLayout());

            ausMannsch[i] = new JLabel((i==0)? "Hertha BSC Berlin":(i==1)?"Borussia Dortmund": "Borussia Mönchengladbach",SwingConstants.RIGHT);
            ausMannsch[i].setMinimumSize(new Dimension(0,ausMannsch[i].getMinimumSize().height));
            ausMannsch[i].setPreferredSize(heimMannsch[0].getPreferredSize());
            ausPanel.add(ausMannsch[i]);
            ausPanel.add(new JTextField(2),BorderLayout.WEST);

            spiele[i].add(heimPanel);
            JLabel punkte = new JLabel(":",SwingConstants.CENTER);
            punkte.setPreferredSize(new Dimension(punkte.getPreferredSize().width+20,punkte.getPreferredSize().height));
            spiele[i].add(punkte);
            spiele[i].add(ausPanel);
            spiele[i].setMaximumSize(new Dimension(100000000,ausPanel.getMinimumSize().height));

            mitte.add(spiele[i]);
        }
        fenster.pack();
        fenster.setVisible(true);
    }
        
    public static void anmeldeFenster() {
        anmelden = new JFrame("Anmelden");
        JPanel panel = new JPanel();
        anmelden.add(panel);
        
        anmelden.setSize(new Dimension(200,100));
        benutzerName = new JTextField(20);
        panel.add( new JLabel( "Nutzername: " ) );
        
        Passwort = new JTextField(20);
        
        
        panel.add(benutzerName);
        panel.add( new JLabel( "Passwort: " ) );
        panel.add(Passwort);
        
            
            //Layout Manager
            
            final JButton anmeldeButt = new JButton("anmelden");
            anmeldeButt.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed (ActionEvent e) {
                   Tipper tippender = new Tipper(benutzerName.getText()) ;
                   if(tippender.getName().equals("KaiK")&& Passwort.getText().equals("1")||tippender.getName().equals("Shanon")&& Passwort.getText().equals("1"))
                   {
                     admin =true ;
                     anmelden.dispose();
                     anmeldeButt.setText("hi");
                     angemeldet =false;
                     
                     
                   }
                   
               }
            });
            panel.add(anmeldeButt);
            anmelden.getContentPane().add(panel);
            anmelden.pack();
            anmelden.setVisible(true);
        
    }
   }

