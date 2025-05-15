/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author dulce
 */
public class ReminderNotFoundException extends Exception{
    public ReminderNotFoundException(String title) {
        super("No se encontró ningún recordatorio con el título: \"" + title + "\".");
    }
}
