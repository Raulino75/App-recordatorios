/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

import java.time.LocalDateTime;

/**
 *
 * @author dulce
 */
public class InvalidPriorityException extends Exception{
    public InvalidPriorityException(Prioridad priority) {
        super("La prioridad: "+ priority + " es invalida");
    }
}