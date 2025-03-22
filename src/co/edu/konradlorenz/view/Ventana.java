package co.edu.konradlorenz.view;

import co.edu.konradlorenz.control.Funcionamiento;
import co.edu.konradlorenz.model.*;
import java.util.Scanner;

public class Ventana {

    Scanner sc = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int ingresarDatoInt() {
        return sc.nextInt();
    }

    public String ingresarDatoString() {
        return sc.nextLine();

    }

}
