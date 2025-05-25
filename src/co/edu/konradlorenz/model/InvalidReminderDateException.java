/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

import java.time.LocalDate;

/**
 *
 * @author dulce
 */
public class InvalidReminderDateException extends Exception{
    public InvalidReminderDateException(LocalDate dateTime) {
        super("The date and time " + dateTime + " is not valid for a reminder.");
    }
}
