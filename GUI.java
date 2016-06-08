import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextArea;
import java.awt.Dimension;
public class GUI extends JFrame implements ActionListener
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private JButton login, logout, zeigeTipps/**admin only*/,tippsAuswerten, tippTabelle, eingabeBestaetigen, loeschen, zeigeTabelleBegegnung;
    private JFrame mainFrame, anmelden;
    private JPanel mainPanel,buttonPanel;
    private JTextArea hauptMenue= new JTextArea();
    private JTextField benutzerName;
    private JTextField Passwort;
    private boolean admin = false;
   
    
    /**
     * Konstruktor für Objekte der Klasse TestGUI
     */
    public GUI()
    {
        // Instanzvariable initialisieren
        super("Tabelle");
        // = ();
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        hauptMenue.setPreferredSize(new Dimension(450,500));
        
        login = new JButton("Login"); 
        login.addActionListener(this);
        mainPanel.add(login);
        
        logout = new JButton("Logout"); 
        logout.addActionListener(this);
        mainPanel.add(logout);
        
        zeigeTipps = new JButton("Abgegebene Tipps"); 
        zeigeTipps.addActionListener(this);
        buttonPanel.add(zeigeTipps);
        
        tippsAuswerten = new JButton("Tipps Auswerten"); 
        tippsAuswerten.addActionListener(this);
        buttonPanel.add(tippsAuswerten);
        
        tippTabelle = new JButton("Tipp-Tabelle"); 
        tippTabelle.addActionListener(this);
        buttonPanel.add(tippTabelle);
        
        eingabeBestaetigen = new JButton("Eingabe bestätigen"); 
        eingabeBestaetigen.addActionListener(this);
        buttonPanel.add(eingabeBestaetigen);
        
        zeigeTabelleBegegnung = new JButton("Spieltag"); 
        zeigeTabelleBegegnung.addActionListener(this);
        buttonPanel.add(zeigeTabelleBegegnung);

        //loeschen = new JButton();
        //loeschen.addActionListener(this);
        //buttonPanel.add(loeschen);
         
        
        
        
        mainPanel.add(hauptMenue);
        mainPanel.add(buttonPanel);
              
        add(mainPanel);
        pack();
        setVisible(true);
        Tabelle.begin();
    }
    
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==this.zeigeTabelleBegegnung) {
            hauptMenue.append(Tabelle.getTabelle()[1].getName());
      } else if(e.getSource()==this.login) {
            anmeldeFenster();
      }
    }
        
    public void anmeldeFenster() {
        anmelden = new JFrame("Anmelden");
        JPanel panel = new JPanel();
        anmelden.add(panel);
        
        anmelden.setSize(new Dimension(200,100));
        benutzerName = new JTextField(20);
        getContentPane().add( new JLabel( "Das Feld: " ) );
        
        Passwort = new JTextField(20);
        getContentPane().add( new JLabel( "Das Feld: " ) );
        
        panel.add(benutzerName);
        panel.add(Passwort);
            
            //Layout Manager
            
            JButton anmeldeButt = new JButton("anmelden");
            anmeldeButt.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed (ActionEvent e) {
                   Tipper tippender = new Tipper(benutzerName.getText()) ;
                   if(tippender.getName().equals("KaiK")||tippender.getName().equals("Shanon")&& Passwort.getText().equals("1"))
                   {
                     admin =true ;
                     anmelden.dispose();
                   }  
               }
            });
            panel.add(anmeldeButt);
            anmelden.pack();
            anmelden.setVisible(true);
        
    }
    public void textLöschen()
    {
        hauptMenue.selectAll();
        hauptMenue.cut();
    
    }
  }                                        
        
        
    
