/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import gui2.Windows;
import javax.swing.JFrame;

/**
 *
 * @author LAB17
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Windows ventana = new Windows();
       ventana.setVisible(true);
       ventana.setBounds(0, 0, 600, 800);
       ventana.setTitle("Mi primer interfaz grafica");
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
