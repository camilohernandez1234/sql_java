

package com.mycompany.sql_conexion;

import models.People;


public class Mavenproject1 {

    public static void main(String[] args) {
        People pedro = new People ();
         People juan = new People ();
         pedro.setNombres("pedrito");
         pedro.setApellidos("perez"); 
         
         juan.setNombres("juanito");
         
        System.out.println(pedro.getNombres()+" "+pedro.speak());
         System.out.println(juan.getNombres()+" "+pedro.walk());
    }
}
