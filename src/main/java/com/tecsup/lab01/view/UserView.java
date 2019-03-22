package com.tecsup.lab01.view;

public class UserView extends com.tecsup.lab01.model.User{
	public void imprimir() {
		System.out.println("La persona ingresada es:");
		System.out.println(nombre+" "+apellidos);
		System.out.println("Su edad es:");
		System.out.println(edad);
	}

}
