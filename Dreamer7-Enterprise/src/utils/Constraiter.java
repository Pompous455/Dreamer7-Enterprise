package utils;

import java.awt.Component;
import java.awt.Container;
import javax.swing.SpringLayout;

public class Constraiter {
    public static void addConstraits(SpringLayout layout, Component frame, int x, int y, Container container){
        layout.putConstraint(SpringLayout.WEST, frame, x, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, frame, y, SpringLayout.NORTH, container);                
    }
}
