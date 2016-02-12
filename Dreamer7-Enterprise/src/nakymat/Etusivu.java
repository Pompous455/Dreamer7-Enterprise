
package nakymat;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import static utils.Constraiter.addConstraits;

public class Etusivu implements Nakyma{
    private ArrayList<Raportti> lista;
    public Etusivu(){
        lista = new ArrayList<>();    
    }

    @Override
    public void naytaSivu(JPanel frame) {                  
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);     
        JLabel teksti = new JLabel("Tervetuloa!");
        addConstraits(layout,teksti, 10, 0, frame);
        frame.add(teksti);
     
        JButton painike = new JButton("Sulje");        
        painike.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        addConstraits(layout,painike, 110, 0, frame);
        frame.add(painike);
        
        //Esimerkkiraportit
        lista.add(new Raportti("peli1", 1, 3, (float) 4.5, "kiva peli"));
        lista.add(new Raportti("peli2", 2, 4, (float) 6, "Perseestä!!!"));
        lista.add(new Raportti("peli3", 3, 3, (float) 4.5, "LOISTAVAA!"));            
        
        int y = 100;
        for(Raportti raportti : lista){
            JLabel nimi = new JLabel(raportti.getNimi());
            addConstraits(layout, nimi, 10, y, frame);
            frame.add(nimi);
            JLabel numero = new JLabel(Integer.toString(raportti.getNumero()));
            addConstraits(layout, numero, 100, y, frame);
            frame.add(numero);
            JButton nappi = new JButton("Näytä raportti");
            nappi.setPreferredSize(new Dimension(120, 20));
            nappi.addActionListener(new RaporttiPainike(raportti));
            addConstraits(layout, nappi, 200, y, frame);
            frame.add(nappi);
            y = y + 25;
        }
        
        //Teksitkenttäesimerkki
        //JTextArea kentta = new JTextArea(1, 5);        
        //kentta.setBackground(Color.GREEN);
        //addConstraits(layout,kentta, 10, 50, frame);
        //frame.add(kentta);             
    }

    @Override
    public String getNimi() {
        return "etusivu";
    }
}

