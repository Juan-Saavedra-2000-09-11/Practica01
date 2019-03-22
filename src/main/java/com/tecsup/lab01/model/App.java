package com.tecsup.lab01.model;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App extends com.tecsup.lab01.model.User
{
    public static void main( String[] args )
    {
    	nombre=JOptionPane.showInputDialog("Ingrese nombre");
    	apellidos=JOptionPane.showInputDialog("Ingrese apellidos");
    	edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
    }
}