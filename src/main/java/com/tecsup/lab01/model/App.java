package com.tecsup.lab01.model;

import com.tecsup.lab01.controller.UserController;



/**
 * Hello world!
 *
 */
public class App extends com.tecsup.lab01.model.User
{
    public static void main( String[] args )
    {
    	UserController x=new UserController();
    	x.registrar();
    }
}