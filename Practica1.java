

package com.mycompany.practica1;
import java.util.ArrayList;
import java.util.Scanner;
public class Practica1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre + ", seleccione una opcion");
    
   menu1 menu1 = new menu1();
   menu1.Mostrarmenu1();
        
}
}
