/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author LAB17
 */
public class Windows extends JFrame
{
    JPanel panel;
    JLabel label;
    JTextField texto; 
    JCheckBox vereficador;
    JRadioButton seleccion;
    JButton boton;
    
    public Windows()
    {
        panel = new JPanel();
        label = new JLabel();
        texto = new JTextField(25);
        vereficador = new JCheckBox();
        seleccion = new JRadioButton();
        boton = new JButton();
        
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.BLUE);
        
    }
}
