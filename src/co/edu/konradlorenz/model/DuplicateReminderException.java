/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author dulce
 */
public class DuplicateReminderException extends Exception{
    private String title;
    
    public DuplicateReminderException(String title) {
        super("Ya existe un recordatorio con el título: " + title);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
}