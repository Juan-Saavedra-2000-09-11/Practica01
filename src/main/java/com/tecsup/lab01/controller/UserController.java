package com.tecsup.lab01.controller;

import javax.swing.JOptionPane;

public class UserController extends com.tecsup.lab01.model.User {
	public void registrar(){
		nombre=JOptionPane.showInputDialog("Ingrese nombre");
    	apellidos=JOptionPane.showInputDialog("Ingrese apellidos");
    	edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
	}
}
