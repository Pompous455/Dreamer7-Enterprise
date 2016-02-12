package nakymat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RaporttiPainike implements ActionListener{

    private Raportti raportti;
    
    public RaporttiPainike(Raportti raportti){
        this.raportti = raportti;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(raportti.getNimi());
    }
    
}
