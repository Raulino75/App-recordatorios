package co.edu.konradlorenz.view;

import co.edu.konradlorenz.controller.Controller;
import co.edu.konradlorenz.model.*;
import java.time.LocalTime;
import java.util.*;
import javax.swing.*;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private static LocalTime currentTime = LocalTime.now();
    private static LocalTime timeLimit = LocalTime.of(12, 0);

    public static void mostrarMensaje(JFrame parent, String info, String titulo, int tipoMensaje) {
        JOptionPane.showMessageDialog(parent, info, titulo, tipoMensaje);
    }

    public static void mostrarMensaje(JDialog parent, String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(parent, mensaje, titulo, tipo);
    }
}
