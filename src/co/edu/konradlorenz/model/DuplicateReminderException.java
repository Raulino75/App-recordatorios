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
    public DuplicateReminderException(String title) {
        super("There is already a reminder with the title:" + title + "'.");
    }
}