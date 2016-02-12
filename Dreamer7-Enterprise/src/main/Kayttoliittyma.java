/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import nakymat.*;

/**
 *
 * @author Leo
 */
public class Kayttoliittyma implements Runnable{
    ArrayList<Nakyma> nakymat;
    private JFrame frame;
    public Kayttoliittyma(){
        nakymat = new ArrayList<>();
        frame = new JFrame("Otsikko");
        nakymat.add(new Etusivu());     
    }
    
    @Override
    public void run() {
        frame.setSize(400, 400);      
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        haeSivu("etusivu").naytaSivu(panel);
        panel.setPreferredSize(new Dimension(panel.getWidth(), 600));        
        JScrollPane scroll = new JScrollPane();
        //scroll.setPreferredSize(new Dimension(500,500));
        scroll.setViewportView(panel);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        frame.getContentPane().add(scroll);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);      
    }
    
    public void tyhjenna(){
        frame.removeAll();
        frame.revalidate();
        frame.repaint();
    }
    
    public Nakyma haeSivu(String nimi){
        for(Nakyma nakyma : nakymat){
            if(nakyma.getNimi().equals(nimi)){
                return nakyma;
            } 
        }
        return null;
    }   
}
