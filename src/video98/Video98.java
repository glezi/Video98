/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video98;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;

/**
 *
 * @author gleez
 */
public class Video98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrameSpinner mimarco = new FrameSpinner(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
   
class FrameSpinner extends JFrame{
    public FrameSpinner(){
        
        setBounds(500,400,550,350); 
   
        
        add(new LaminaSpinner()); 
        
        setVisible(true);
    }
    
}

class LaminaSpinner extends JPanel{
    
    public LaminaSpinner(){
       
        String lista[] = {"Enero", "Febrero", "Marzo", "Abril"}; 
        
        JSpinner control = new JSpinner(new SpinnerListModel(lista)); 
       // control.setPreferredSize(d);
        add(control); 
        
    }
}
