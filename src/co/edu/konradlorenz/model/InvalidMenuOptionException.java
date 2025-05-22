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
public class InvalidMenuOptionException extends Exception{
    public InvalidMenuOptionException(int option) {
        super("The option" + option + "' is invalid.");
    }
}
