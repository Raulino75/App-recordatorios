/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dulce
 */
public class HasMap {
    
    private static Map<String, String> texts_en = new HashMap<>();
    private static Map<String, String> texts_es = new HashMap<>();
    
        public static void addUsersEnglish(String es, String data) {
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
        texts_en.put("error_dialog", "Unexpected error: ");
        texts_en.put("dialog_general_error", "Error: ");
    }

    public static void addUsersEspanish(String es, String data) {
        texts_es.put("error_dialog", "Error inesperado: ");
        texts_es.put("dialog_general_error", "Error: ");
    }
}
