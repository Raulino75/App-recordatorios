
package com.mycompany.practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Recordatorio {

    Scanner sc3 = new Scanner(System.in);
    List<String> ListaRecordatorios = new ArrayList<>();
   
    public void AgregarRecordatorio() {
        ListaRecordatorios.add(sc3.nextLine());
    }
    public void MostrarRecordatorios(){
        System.out.println(ListaRecordatorios);
    }
    public void EliminarRecordatorio(){
        ListaRecordatorios.remove(sc3.nextInt());
    }
    public void ModificarRecordatorios(){
        ListaRecordatorios.set(sc3.nextInt(), sc3.nextLine());
    }
    
}
